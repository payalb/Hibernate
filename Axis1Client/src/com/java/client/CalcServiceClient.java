package com.java.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import org.apache.axis.client.Service;
import com.java.service.CalcServiceSoapBindingStub;

public class CalcServiceClient {

	public static void main(String[] args) throws RemoteException,
			MalformedURLException {
		CalcServiceSoapBindingStub obj = new CalcServiceSoapBindingStub(
				new URL(
						"http://localhost:8080/Axis1Webservice/services/CalcService"),
				new Service());
		System.out.println(obj.add(3, 4));
	}

}
