package com.java.model;

import java.util.ArrayList;
import java.util.RandomAccess;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyList<MyObject> extends ArrayList<MyObject> implements RandomAccess, Cloneable, java.io.Serializable{

	/*public void addAll(MyList<MyObject> list) {
		for(MyObject object: list){
			this.add(object);
		}
		
	}


	@Override
	public int size() {
		return this.size();
	}

	@Override
	public boolean isEmpty() {
		if(this.size()==0)
			return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		if(o instanceof MyObject){
			
		if(this.contains((MyObject)o)){
			return true;
		}
		
		return false;
	}

	@Override
	public Iterator<MyObject> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(MyObject e) {
		super.add(e);
		return true;
	}

	@Override
	public boolean remove(Object o) {
		this.remove(o);
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends MyObject> c) {
		for(MyObject object: c){
			this.add(object);
		}
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		for(Object object: c){
			this.add(object);
		}
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}*/

}
