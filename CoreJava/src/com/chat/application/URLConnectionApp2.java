package com.chat.application;

import java.awt.Image;
import java.io.IOException;
import java.net.ContentHandler;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConnectionApp2 extends ContentHandler{

	public static void main(String[] args) throws IOException {
		URLConnectionApp2 obj= new URLConnectionApp2();
		//  URL url1 = new URL ("ftp://ftp.wustl.edu/graphics/gif/a/apple.gif"); 
		  //  Image img = (Image)url1.getContent(); 
		 /* URL listing = 
			        new URL("http://somewhere.an.edu/lynx/lynx2html.tar"); 
			    String s = (String)listing.getContents(); 
			    System.out.println( s ); */
		    //ftp protocol handler. mime type by looking at extension: gif handler. MIME type of the data is image/gif
		URL url= new URL("text","","http://download.finance.yahoo.com/d/quotes.csv?s=APPL&f=sl1d1t1c1ohgv&e=.csv");
		URLConnection conn= url.openConnection();
		 //It's the protocol handler's job to fetch and decode the data before passing it along. The protocol handler's output is your data, pure and simple. 
		System.out.println(url.getContent());
		String str=obj.getContent(conn);
		// openConnection().getInputStream()
		System.out.println(str);
		
		//Once u have csv format, String tokenizer or scanner can help us parse teh string with comma seperated values.
		//http://quote.yahoo.com/d/quotes.csv?s=APPL&f=sl1d1t1c1ohgv&e=.csv returns csv file
	}

	@Override
	public String getContent(URLConnection urlc) throws IOException {
		Scanner scanner= new Scanner(urlc.getInputStream());
		scanner.useDelimiter(",");
		String str="";
		while(scanner.hasNext()){
			 str= scanner.nextLine();
		}
		scanner.close();
		return str;
	}

}
