package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		try(ServerSocket server= new ServerSocket(1091)){
			 System.out.println("Server started: " + server);
	         System.out.println("Waiting for a client ..."); 

		Socket socket1= server.accept();
		System.out.println("Client accepted: " + socket1);

		Thread t= new Thread(()->{
		try {
			readFromClientAndSendResponse(socket1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		});
		t.setDaemon(false);
		t.start();
		}
		
	}

	private static void readFromClientAndSendResponse(Socket socket1) throws IOException {
		InputStreamReader reader= new InputStreamReader(socket1.getInputStream());
		BufferedReader bf= new BufferedReader(reader);
		String line;
		while((line= bf.readLine()) != null){
			PrintStream ps= new PrintStream(socket1.getOutputStream());
			line= "message received "+ line;
			ps.println( line);
			ps.flush();
		}
	}

}
