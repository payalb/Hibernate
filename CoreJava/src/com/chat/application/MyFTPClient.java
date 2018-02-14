package com.chat.application;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;

public class MyFTPClient {

	public static void main(String[] args) throws SocketException, IOException {
		FTPClient client= new FTPClient();
		//Below code works... Took it from net
			client.connect("ftp.icm.edu.pl", 21);
			System.out.println("Successfully connected!");
			client.login("anonymous", "me@nowhere.com");
			System.out.println(client.getReplyString());
			
			client.makeDirectory("/One");
			System.out.println(client.getReplyString());
			/*client.connect("server.com", 21);
			System.out.println("Successfully connected!");
			client.login("Anonymous", "");
			System.out.println(client.getReplyString());*/
			
			// log out and disconnect from the server
			client.logout();
			client.disconnect();
 
            System.out.println("Disconnected");

	}

}
