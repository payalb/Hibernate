package com.chat.application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws IOException {

		DatagramSocket ds= new DatagramSocket();
		//To send data, take input from user or create data.
		int i=8;
		//Need server to square the numbers and send back the result.
		//4 parameters: data u need to send, data length, ipaddress, port number
		byte[] arr= String.valueOf(i).getBytes();
		
		DatagramPacket packetSend= new DatagramPacket(arr,arr.length, InetAddress.getLocalHost(), 9999);
		ds.send(packetSend);
		
		byte[] response= new byte[1024];
		DatagramPacket packetReceived= new DatagramPacket(response,response.length);
		ds.receive(packetReceived);
		String str=new String( packetReceived.getData());
		System.out.println("Response from server is "+ str);
		ds.close();		
	}

}

