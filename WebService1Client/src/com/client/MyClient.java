package com.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.java.MyService;

public class MyClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8935/ws/MyService?wsdl");

        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://java.com/", "MyServiceImplService");

        Service service = Service.create(url, qname);
        
        MyService hello = service.getPort(MyService.class);

        System.out.println(hello.add(2,3));
	}

}
