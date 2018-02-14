package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClientManyApp2 {

	public static void main(String[] args) {
		
		try(Socket socket = new Socket("localhost", 1092)){
			Thread t1= new Thread(()->{
			try {
				SendNumberToServer(socket);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			});
			t1.start();
			Thread t3= new Thread(()->{
				try {
					readFromServer(socket);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			t3.start();
			t1.join();
			t3.join();
	} catch (Exception e) {
		e.printStackTrace();
	}


	}

	private static void SendNumberToServer(Socket socket) throws IOException {
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());

		BufferedReader bfreader1 = new BufferedReader(new InputStreamReader(
				System.in));
		String message1;

		while ((message1 = bfreader1.readLine()) != null) {
			printWriter.println(message1);
			printWriter.flush();
		}
		
	}
	private static void readFromServer(Socket socket) throws IOException {
		BufferedReader bfreader = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));

		String message;
		while ((message = bfreader.readLine()) != null)
			System.out.println(message);
	}
}
