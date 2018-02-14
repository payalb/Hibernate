package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPIPServer {

	public static void main(String[] args) throws IOException {
		try (ServerSocket obj = new ServerSocket(1563);
				Socket socket = obj.accept();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()))) {

			System.out.println("Server waiting for connection req...");

			System.out.println("Connection Request accepted..");

			String str = reader.readLine();
			System.out.println(str);
		}
	}

}
