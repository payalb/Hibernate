package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ReadPhpPage {

	public static void main(String[] args) throws IOException {
		Scanner scanner= new Scanner(System.in);
		String email= null;
		String password= null;
		System.out.println("please enter email..");
		email= scanner.nextLine();
		System.out.println("please enter password..");
		password= scanner.nextLine();
		
		String link="http://localhost/One.php?email="+email+"&password="+password;
		URL url= new URL(link);
		HttpURLConnection con= (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		BufferedReader reader= new BufferedReader(new InputStreamReader(con.getInputStream()));
		String line;
		while((line=reader.readLine())!=null){
			System.out.println(line);
		}
		
	}

}
