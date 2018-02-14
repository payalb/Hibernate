package com.chat.application;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPIPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket= new Socket("127.0.0.1", 1563);
		String str="Hello Server!!";
		BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		writer.write(str);
		writer.close();
		socket.close();
	}

}
