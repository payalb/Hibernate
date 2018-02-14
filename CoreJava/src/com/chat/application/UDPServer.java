package com.chat.application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	//Connectionless protocol: UDP: Packet knows where to go.
	public static void main(String[] args) throws IOException {
		DatagramSocket ds= new DatagramSocket(9999);
		byte[] response= new byte[1024];
		DatagramPacket packetReceived= new DatagramPacket(response,response.length);
		 ds.receive(packetReceived);
		 String str= new String(packetReceived.getData(),0,packetReceived.getLength());
		 int number= (int) Math.pow(Integer.parseInt(str),2);
		 byte[] result= (number+"").getBytes();
		 DatagramPacket packetSent= new DatagramPacket(result, result.length, InetAddress.getLocalHost(),packetReceived.getPort() );
		 ds.send(packetSent);
		 ds.close();
	}

}
