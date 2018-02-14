package com.chat.application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer1 {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket= new DatagramSocket(2356);
		byte[] message= new byte[1024];
		DatagramPacket packet= new DatagramPacket(message, message.length);
		socket.receive(packet);
		String messageBody =new String(packet.getData());
		System.out.println(messageBody);
	}

}
