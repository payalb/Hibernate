package com.chat.application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/*When one sends a message to a multicast group, all subscribing recipients to that host and port receive the message (within the time-to-live range of the packet, see below). The socket needn't be a member of the multicast group to send messages to it.

When a socket subscribes to a multicast group/port, it receives datagrams sent by other hosts to the group/port, as do all other members of the group and port. A socket relinquishes membership in a group by the leaveGroup(InetAddress addr) method. Multiple MulticastSocket's may subscribe to a multicast group and port concurrently, and they will all receive group datagrams. 
*/public class MulticastClient {

	public static void main(String[] args) throws IOException {
		// Class D IP addresses are in the range 224.0.0.0 to 239.255.255.255,
		// inclusive. The address 224.0.0.0 is reserved and should not be used.
		InetAddress address = InetAddress.getByName("228.5.6.7");
		MulticastSocket socket = new MulticastSocket(6789);
		socket.joinGroup(address);
		 //prevent from receiving it's own message
	//	socket.setLoopbackMode(true);
		String message="Hello Everyone!";
		DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address, 6789);
		socket.send(packet);
		 
	    Thread t= new Thread(()->{
	    	while(true){
	    		byte[] response= new byte[1024];
	    		DatagramPacket packetRcvd= new DatagramPacket(response, response.length);
	      try {
	    		socket.receive(packetRcvd);
	    		System.out.println("Message recvd: " + new String(packetRcvd.getData()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	}
	    });
	      
	     t.start();
	
	
		
		
//	/	socket.leaveGroup(address);

	}

}
