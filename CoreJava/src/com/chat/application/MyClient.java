package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) throws UnknownHostException,
			IOException, InterruptedException {

		try (Socket socket = new Socket("localhost", 6356)) {
			Thread t= new Thread (()->{
				try {
					writeToServerFromConsole(socket);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			Thread t1= new Thread (()->{
				try {
					readFromServer(socket);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			t.start();
			t1.start();
			t.join();
			t1.join();
			System.out.println(socket.isClosed());
		}
	}

	private static void readFromServer(Socket socket) throws IOException {
		BufferedReader bfreader = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));

		String message;
		while ((message = bfreader.readLine()) != null)
			System.out.println(message);
	}

	private static void writeToServerFromConsole(Socket socket)
			throws IOException {
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

		BufferedReader bfreader1 = new BufferedReader(new InputStreamReader(
				System.in));
		String message1;

		while ((message1 = bfreader1.readLine()) != null) {
			printWriter.println(message1);
			printWriter.flush();
		}
	}

}
