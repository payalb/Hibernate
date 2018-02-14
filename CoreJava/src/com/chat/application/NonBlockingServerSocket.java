package com.chat.application;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NonBlockingServerSocket {

	public static void main(String[] args) throws IOException {
		ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

		serverSocketChannel.socket().bind(new InetSocketAddress(9999));

		while(true){
		    SocketChannel socketChannel =
		            serverSocketChannel.accept();

		    if(socketChannel != null){
		       ByteBuffer buffer= ByteBuffer.allocate(84);
		       buffer.clear();
		       buffer.put("Hello from server..".getBytes());
		       buffer.flip();
		       while(buffer.hasRemaining()){
		    	   //write from buffer into the channel
		    	   socketChannel.write(buffer);
		       }
		       
		        }
		    socketChannel.close();
		}
	}

}
