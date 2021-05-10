package test;

import java.io.*;
import java.util.*;

public class Strings {

	public static void main(String[] args) {
		
		String s = "hello ibk";
//		for (char a : s.toCharArray()) {
//			System.out.print(a);
//		}
		String[] li = s.split(" ");
		
		String[] p ;
		

		for (String string : li) {
			System.out.println(string);
			p.add(string);
		}

	}

}
