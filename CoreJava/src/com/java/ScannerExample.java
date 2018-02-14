package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws FileNotFoundException {
		// Breaks input into individual tokens associated with bits of data. By
		// default white-spaces include tab, blanks, line terminators.

		// Example 1

		try (Scanner scanner = new Scanner(new FileReader(new File(
				"src/scannerToken")));) {
			while (scanner.hasNext()) {
				System.out.println("Token :" + scanner.next());
			}
		}

		// Example 2 : specifying delimiter

		try (Scanner scanner = new Scanner(new FileReader(new File(
				"src/scannerToken1")));) {
			scanner.useDelimiter("\t");
			while (scanner.hasNext()) {
				System.out.println("Token :" + scanner.next());
			}
		}

		// Example 3 : specifying locale for digits in thousands

		try (Scanner scanner = new Scanner(new FileReader(new File(
				"src/scannerToken2")));) {
			scanner.useLocale(Locale.US);
			while (scanner.hasNextDouble()) {
				System.out.println("Token :" + scanner.next());
			}
			
		}
	}

}
