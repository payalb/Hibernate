package com.chat.application;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class URLConnectionApp1 {

	public static void main(String[] args) throws IOException {
		URL url= new URL("http://download.finance.yahoo.com/d/quotes.csv?s=APPL&f=sl1d1t1c1ohgv&e=.csv");
		// openConnection().getInputStream()
		Scanner scanner= new Scanner(url.openStream());
		scanner.useDelimiter(",");
		String str;
		while(scanner.hasNext()){
			 str= scanner.nextLine();
			System.out.println(str);
		}
		scanner.close();
		//Once u have csv format, String tokenizer or scanner can help us parse teh string with comma seperated values.
		//http://quote.yahoo.com/d/quotes.csv?s=APPL&f=sl1d1t1c1ohgv&e=.csv returns csv file
	}

}
