package com.chat.application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient1 {

	public static void main(String[] args) throws IOException {
		try (DatagramSocket obj = new DatagramSocket();) {
			int i = 32;
			byte[] data = String.valueOf(32).getBytes();
			DatagramPacket packet = new DatagramPacket(data, data.length,
					InetAddress.getLocalHost(), 2356);
			obj.send(packet);
		}
	}
}
