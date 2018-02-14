package com.chat.application;

import java.io.IOException;
import java.net.ServerSocket;

import javax.net.ssl.SSLServerSocketFactory;

public class SSLServer {

	public static void main(String[] args) throws IOException {

		//jdk bin -> keytool -genkey -alias zastore -keystore  za.store
		//generate private key. alias : zastore. store information in za.store.
		
		System.setProperty("javax.net.ssl.keyStore", "payal.store");
		System.setProperty("javax.net.ssl.keyStorePassword", "radhey");
		ServerSocket serverSocket= SSLServerSocketFactory.getDefault().createServerSocket(4444);
		while(true){
			new ServerThread(serverSocket.accept()).start();
		}
	}

}
