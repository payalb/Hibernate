package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadContentOfWebPage {

	public static void main(String[] args) throws IOException {
		URL obj= new URL("http://www.google.com/");
		URLConnection conn= obj.openConnection();
		BufferedReader reader= new BufferedReader(new InputStreamReader( conn.getInputStream()));
		Object content= obj.getContent();
		System.out.println(content.toString());
		String inputLine;
        while ((inputLine = reader.readLine()) != null)
            System.out.println(inputLine);
        reader.close();

	}

}
