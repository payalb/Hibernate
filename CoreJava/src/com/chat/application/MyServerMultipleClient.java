package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MyServerMultipleClient {

	static ArrayList<PrintWriter> printWriters = new ArrayList<>();
	static ServerSocket ss = null;

	public static void main(String args[]) throws IOException {
		try {
			ss = new ServerSocket(6356);
			while (true) {

				Socket clientSocket = ss.accept();
				PrintWriter obj1 = new PrintWriter(
						clientSocket.getOutputStream());
				printWriters.add(obj1);
				Thread t = new Thread(() -> {
					try {
						readDataFromClientAndSendResponse(clientSocket);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				t.start();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ss.close();
		}
	}

	private static void readDataFromClientAndSendResponse(Socket clientSocket)
			throws IOException, InterruptedException {

		BufferedReader obj = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));
		InetAddress address = clientSocket.getInetAddress();
		System.out.println("Got request from client:"
				+ address.getHostAddress());
		System.out.println(address.getByName(""));
		System.out.println(address.getLocalHost());
		System.out.println(address.getHostName());
		try {

			String message;
			while ((message = (obj.readLine())) != null) {
				for (PrintWriter pw : printWriters) {
					pw.println(address + " : " + message);
					pw.flush();
					try {
						Thread.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
