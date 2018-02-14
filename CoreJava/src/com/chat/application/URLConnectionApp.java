package com.chat.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*The World Wide Web (WWW) uses  uniform resource locators (URLs) to identify online 
 resources. For example, the following URL says that there is (or will be generated on the fl y) a 
 file called training.html located at the remote host known as mycompany.com , and that the 
 program should use the HTTP protocol to request this fi le. It also states that this request has 
 to be sent via port 80*/
public class URLConnectionApp {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://finance.yahoo.com/quote/aapl?p=aapl");
		// openConnection().getInputStream()
		/*The reason you may consider using the URLConnection class is that it could give you some additional control over the I/O process. For example, by calling its method setDoOutput(true) you specify that this Java program is intended to write to the remote URL too. In the case of HTTP connections, this will also implicitly set the type of request to POST (see Lesson 27). The method useCaches() of URLConnection
		 also allows you to specify whether the protocol can use a cached 
		object or should always request a fresh copy. In general, if you are planning to write Java programs that will work using HTTP protocol, use the class HttpURLConnection, which supports HTTP-specific features, such as processing header fields, getting HTTP response codes, setting request properties, and so on
		*/InputStream stream = url.openStream();
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(stream));
		String content="";
		String str;
		while ((str = reader.readLine()) != null) {
			content= content + str;
		}
		System.out.println(content);
		reader.close();

		// Once u have csv format, String tokenizer or scanner can help us parse
		// teh string with comma seperated values.
		// http://quote.yahoo.com/d/quotes.csv?s=APPL&f=sl1d1t1c1ohgv&e=.csv
		// returns csv file
	}

}
