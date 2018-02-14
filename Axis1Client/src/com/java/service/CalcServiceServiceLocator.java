/**
 * CalcServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.java.service;

public class CalcServiceServiceLocator extends org.apache.axis.client.Service implements com.java.service.CalcServiceService {

    public CalcServiceServiceLocator() {
    }


    public CalcServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalcServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalcService
    private java.lang.String CalcService_address = "http://localhost:8080/Axis1Webservice/services/CalcService";

    public java.lang.String getCalcServiceAddress() {
        return CalcService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalcServiceWSDDServiceName = "CalcService";

    public java.lang.String getCalcServiceWSDDServiceName() {
        return CalcServiceWSDDServiceName;
    }

    public void setCalcServiceWSDDServiceName(java.lang.String name) {
        CalcServiceWSDDServiceName = name;
    }

    public com.java.service.CalcService getCalcService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalcService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalcService(endpoint);
    }

    public com.java.service.CalcService getCalcService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.java.service.CalcServiceSoapBindingStub _stub = new com.java.service.CalcServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalcServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalcServiceEndpointAddress(java.lang.String address) {
        CalcService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.java.service.CalcService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.java.service.CalcServiceSoapBindingStub _stub = new com.java.service.CalcServiceSoapBindingStub(new java.net.URL(CalcService_address), this);
                _stub.setPortName(getCalcServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalcService".equals(inputPortName)) {
            return getCalcService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.java.com", "CalcServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.java.com", "CalcService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalcService".equals(portName)) {
            setCalcServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
