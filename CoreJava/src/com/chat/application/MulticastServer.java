package com.chat.application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastServer {
//multicast address which is actually the class D address (in the range 224.0.0.0 to 239.255.255.255) 
	//When a host wants to send data to a multicast group, it puts that data in multicast datagrams, which are nothing more than UDP datagrams addressed to a multicast group
	public static void main(String[] args) throws IOException {
	    MulticastSocket socket = new MulticastSocket(6789);
	    InetAddress address = InetAddress.getByName("228.5.6.7");
	    socket.joinGroup(address);
	    //prevent from receiving it's own message
	    //socket.setLoopbackMode(true);
	  
	    Thread t= new Thread(()->{
	    	while(true){
	      byte[] buf = new byte[1024];
	      DatagramPacket packet = new DatagramPacket(buf, buf.length);
	      try {
			socket.receive(packet);
			 String received = new String(packet.getData());
		      System.out.println("Message recvd: " + received);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	}
	    });
	      
	     t.start();
	    
	      String message="Hey! How r u?";
			DatagramPacket packet1 = new DatagramPacket(message.getBytes(), message.length(), address, 6789);
			socket.send(packet1);
	  //  socket.leaveGroup(address);
	  //  socket.close();
	}

}
