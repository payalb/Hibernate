package com.java.util;

import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.EmptyInterceptor;
import org.hibernate.EntityMode;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

public class AccountInterceptor extends EmptyInterceptor{

	@Override
	public void afterTransactionBegin(Transaction tx) {
		System.out.println("Transaction started!");
	}
	@Override
	public void afterTransactionCompletion(Transaction tx) {
		System.out.println("Transaction completed!");
	}
	@Override
	public void beforeTransactionCompletion(Transaction tx) {
		System.out.println("Transaction about to be completed!");
	}
	
	@Override
	public void onDelete(
			Object entity, 
			Serializable id, 
			Object[] state, 
			String[] propertyNames, 
			Type[] types) {
		System.out.println(entity.getClass()+" with id ="+ id + "deleted!");
	}

	@Override
	public boolean onFlushDirty(
			Object entity, 
			Serializable id, 
			Object[] currentState, 
			Object[] previousState, 
			String[] propertyNames, 
			Type[] types) {
		System.out.println(entity.getClass()+" with id ="+ id + "is dirty!");
		return true;
	}

	@Override
	public boolean onLoad(
			Object entity, 
			Serializable id, 
			Object[] state, 
			String[] propertyNames, 
			Type[] types) {
		System.out.println(entity.getClass()+" with id ="+ id + "loaded!");
		return true;
	}

	@Override
	public boolean onSave(
			Object entity, 
			Serializable id, 
			Object[] state, 
			String[] propertyNames, 
			Type[] types) {
		System.out.println(entity.getClass()+" with id ="+ id + "saved!. Properties: "+ propertyNames );
		return true;
	}
	
	@Override
	public void postFlush(Iterator entities) {
		System.out.println("After flushing");
	}

	@Override
	public void preFlush(Iterator entities) {
		System.out.println("Before flushing");
	}
	@Override
	//Called when flush method invoked on session object
	public int[] findDirty(
			Object entity,
			Serializable id,
			Object[] currentState,
			Object[] previousState,
			String[] propertyNames,
			Type[] types) {
		System.out.println("Detected object "+ entity + "with id "+ id +" is dirty!");
		return null;
	}
	
	@Override
	public Object instantiate(String entityName, EntityMode entityMode, Serializable id) {
		return null;
	}
	
}
