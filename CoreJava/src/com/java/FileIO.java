package com.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIO {

	public static void main(String[] args) throws IOException {

		int counter = 0;
		// java.io package is used. Uses the concept of stream to make input
		// output operations faster.
		// Stream is a sequence of data composed of bytes and is present in 3
		// forms as a console: Stream is linked to a physical layer by java i/o
		// system to do operations.
		// It supports various types of data like bytes, char, primitive
		// datatypes and objects
		// system.in (input stream), system.out(output stream), system.err(error
		// stream)
		// Input stream is used to read data in byte form from file/
		// console/socket by java application and output stream is to write data
		// from java application to a file/ console. All character streams are formed from 
		//Reader and Writer classes.
		try (InputStream str = new FileInputStream(
				"C:\\Users\\Dell\\workspace\\CoreJava\\src\\Chrysanthemum.jpg")) {
			/* C:\\Users\\Dell\\workspace\\CoreJava\\src\\abc */
			// InputStream methods: read, available (number of bytes available),
			// close
			// OutputStream methods: write(int), write(byte[]), flush, close
			byte[] imageContent = new byte[str.available()];
			while (counter < imageContent.length)
				imageContent[counter++] = (byte) str.read();
			// Use FileInputStream and fileOutputStream when have to deal with
			// raw bytes like image data, audio and video data. When dealing
			// with character,
			// better to use FileReader and FileWriter class.
			// FileoutputStream can be used to write data to a file or to the
			// fileDescriptor.

			try (OutputStream os = new FileOutputStream("src/myFile.jpg", true)) {
				os.write(imageContent);
			}
		}
		
		//Reader is an abstract class which is character based with child as BufferedReader, CharArrayReader, FilterReader,
		//InputStreamReader, PipedReader, StringReader. Character streams are often wrappers for byte streams. 
		//Like fileReader wraps FileInputStream. Character streams automatically adapt to local character set and are ready for 
		//internationalization. The bridge stream to bridge gap b/w bytes and characters:InputStreamReader, OutputStreamWriter 
		try (FileReader str1 = new FileReader(
				"C:\\Users\\Dell\\workspace\\CoreJava\\src\\abc")) {
			int x = str1.read();
			while (x != -1) {
				System.out.print((char) x);
				x = str1.read();
			}
		}
		System.out.println("Done!!");
		// Demo of streams
		/*
		 * System.out.println("Enter a character.."); int characterData =
		 * System.in.read(); System.out.println("Character entered is :" +
		 * (char) characterData);
		 * System.err.println("Error printed using standard error stream!");
		 */
	}

}
