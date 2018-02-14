package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerManyApp {

	public static void main(String[] args) throws IOException {
		
		Thread t= new Thread(()->{
		
			try(ServerSocket server= new ServerSocket(1091)){
				Socket socket1= server.accept();
			readFromClientAndSendResponse(socket1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		});
		t.start();
		Thread t1= new Thread(()->{
			
			try(ServerSocket server= new ServerSocket(1092)){
				Socket socket1= server.accept();
				readNumberFromClientAndSendResponse(socket1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		});
			t1.start();
	}

	private static void readNumberFromClientAndSendResponse(Socket socket1) throws IOException {
		InputStreamReader reader = new InputStreamReader(
				socket1.getInputStream());
		BufferedReader bf = new BufferedReader(reader);
		String line;
		while ((line = bf.readLine()) != null) {
			PrintStream ps = new PrintStream(socket1.getOutputStream());
			line = "Multiplied by 2:  " + Integer.parseInt(line)*2;
			ps.println(line);
			ps.flush();
	}
	}

	private static void readFromClientAndSendResponse(Socket socket1)
			throws IOException {
		InputStreamReader reader = new InputStreamReader(
				socket1.getInputStream());
		BufferedReader bf = new BufferedReader(reader);
		String line;
		while ((line = bf.readLine()) != null) {
			PrintStream ps = new PrintStream(socket1.getOutputStream());
			line = "message received " + line;
			ps.println(line);
			ps.flush();
		}
	}

}
