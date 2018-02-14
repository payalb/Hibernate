package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread{
	
	Socket socket;

	public ServerThread(Socket socket) {
		this.socket= socket;
	}

	@Override
	public void run() {
		try {
			PrintWriter writer= new PrintWriter(socket.getOutputStream(), true);
			BufferedReader reader= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){
				writer.println("Echo:"+ reader.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
