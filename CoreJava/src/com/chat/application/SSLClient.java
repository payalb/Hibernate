package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.net.ssl.SSLSocketFactory;

public class SSLClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.setProperty("javax.net.ssl.trustStore", "payal.store");
		Socket socket=  SSLSocketFactory.getDefault().createSocket("localhost",4444);
		BufferedReader reader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter writer= new PrintWriter(socket.getOutputStream(), true);
		BufferedReader consoleReader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("username :");
		writer.write(consoleReader.readLine());
		String str;
		while(true){
			System.out.println("enter message to send to server..");
			writer.write((str=consoleReader.readLine()));
			if(str.equals("quit")){
				socket.close();
				break;
			}
		}
		System.out.println(reader.readLine());
	}

}
