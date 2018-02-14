package com.java.service;

public class CalcServiceProxy implements com.java.service.CalcService {
  private String _endpoint = null;
  private com.java.service.CalcService calcService = null;
  
  public CalcServiceProxy() {
    _initCalcServiceProxy();
  }
  
  public CalcServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcServiceProxy();
  }
  
  private void _initCalcServiceProxy() {
    try {
      calcService = (new com.java.service.CalcServiceServiceLocator()).getCalcService();
      if (calcService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calcService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calcService != null)
      ((javax.xml.rpc.Stub)calcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.java.service.CalcService getCalcService() {
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService.add(a, b);
  }
  
  public int mul(int a, int b) throws java.rmi.RemoteException{
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService.mul(a, b);
  }
  
  public int sub(int a, int b) throws java.rmi.RemoteException{
    if (calcService == null)
      _initCalcServiceProxy();
    return calcService.sub(a, b);
  }
  
  
}