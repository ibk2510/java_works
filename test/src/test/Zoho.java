package test;

import java.io.*;
import java.util.*;

public class Zoho {

	public void pattern() {
		String s = "hello";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(s.charAt(i));
		}

	}

	public void zeroAtlast(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		for (int j = count; j < n; j++) {
			arr[j] = 0;
		}

	}

	public void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public void expand(String e) {
		int len = e.length();
		String ans = "";
		for (int i = 0; i < len; i = i + 2) {
			char letter = e.charAt(i);
			int times = Integer.parseInt(String.valueOf(e.charAt(i + 1)));
			for (int j = 0; j < times; j++) {
				ans += letter;
			}

		}
		System.out.println(ans);

	}

	public void cntnumpat(int n) {
		String start = "1";
		System.out.println(start);
		for (int i = 0; i < n - 1; i++) {
			StringBuilder str = new StringBuilder();
			for (int j = 0; j < start.length(); j++) {
				int cnt = 1;
				while (j + 1 < start.length() &&

						start.charAt(j) == start.charAt(j + 1)) {
					cnt++;

					j++;
				}
				str.append(cnt).append(start.charAt(j));
			}
			start = str.toString();
			System.out.println(start);
		}

	}

	public void getCrossString(String str) {
		int len = str.length();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i == j || (i + j) == len - 1) {
					System.out.print(str.charAt(j));
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 0, 0, 0, 5, 6, 77, 8 };
		int n = arr.length;

		Zoho z = new Zoho();

		z.printArr(arr);
		z.zeroAtlast(arr, n);
		System.out.println();
		z.printArr(arr);

		z.expand("a3b4c6g7");
		int k = 8;
		z.cntnumpat(k);
		z.getCrossString("hello");

	}

}
