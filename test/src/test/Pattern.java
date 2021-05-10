package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class Pattern {

	public static void printpattern(int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) + 1; j++) {
				if (j <= i) {
					System.out.print(++count);
				} else {
					System.out.print(--count);
				}
			}
			count += i;
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		printpattern(n);
		
		String s = "hello ibk";
		for (char a : s.toCharArray()) {
			System.out.print(a);
		}
		String[] li = s.split(" ");
		for (String string : li) {
			System.out.println(string);
		}
//		System.out.println(li);
	}

}
