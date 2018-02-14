package com.chat.application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastBroadcaster {

	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("228.5.6.7");
		MulticastSocket socket = new MulticastSocket(6789);
		String message="Red alert!";
		DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address, 6789);
		socket.send(packet);
	}
}
