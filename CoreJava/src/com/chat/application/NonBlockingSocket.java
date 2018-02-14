package com.chat.application;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NonBlockingSocket {

	public static void main(String[] args) throws IOException, InterruptedException {
		SocketChannel channel= SocketChannel.open();
		//channel.connect(new InetSocketAddress("http://jenkov.com", 80));
		channel.connect(new InetSocketAddress("localhost",9999));
		while(!channel.finishConnect()){
			Thread.sleep(1000);
		}
		System.out.println("Connected to server..");
		//Firstly the buffer is allocated. The data read from a SocketChannel is stored into the buffer.
		//Secondly we call the SocketChannel.read() method and it reads the data from a SocketChannel into a buffer. 
		//The integer value of the read() method returns how many bytes were written into the buffer.
		ByteBuffer buffer=  ByteBuffer.allocate(84);
		//reads from channel into buffer
		int bytesRead= channel.read(buffer);
		System.out.println(bytesRead);
		String str="";
		buffer.flip();
		str= str+buffer.array();
		System.out.println(str);
		channel.close();
		
	}

}
