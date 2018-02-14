package com.java.beans;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Session Bean implementation class MySingletonBean
 */
@Singleton
@LocalBean
/*
 * When no interface is getting implemented, by default it is Local Bean, cannot be accessed remotely.
 */
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
/*
 * By default it is container managed.
 */
@Startup
/*
 * Does not have to wait for client request, instantiated when deployed.
 */
public class MySingletonBean {

	private String name;
   
    public MySingletonBean() {
    }

    @Lock(LockType.READ)
    /*
     * Can be concurrently accessed by many clients.
     */
    public void getName(){
    	System.out.println("In business method of singleton bean");
    }
    
    @Lock(LockType.WRITE)
    /*
     * If any client is accessing this method, no other client can access it's read or write 
     * locked method. By default, every method has a write lock.
     */
    public synchronized void setName(String name){
    	this.name= name;
    }
}
