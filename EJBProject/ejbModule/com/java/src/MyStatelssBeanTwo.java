package com.java.src;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyStatelssBeanTwo
 */
@Stateless
public class MyStatelssBeanTwo implements MyStatelssBeanTwoRemote {

    /**
     * Default constructor. 
     */
    public MyStatelssBeanTwo() {
       System.out.println("In Constructor");
    }

    @PostConstruct
    public void printName(){
    	System.out.println("In post construct method");
    }
    @Override
    public void getName(String name){
    	System.out.println(name);
    }
    @PreDestroy
    public void destroy(){
    	System.out.println("In destroy");
    }
    
}
