package com.java.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.java.src.MyStatelssBeanTwoRemote;

/**
 * Session Bean implementation class MySingletonTest
 */
@Singleton
@Startup
public class MySingletonTest {

	@EJB
	MyStatelssBeanTwoRemote myBean;
    /**
     * Default constructor. 
     */
    public MySingletonTest() {
        // TODO Auto-generated constructor stub
    }

    @PostConstruct
    public void invokeBusiness(){
    	myBean.getName("Payal");
    }
}
