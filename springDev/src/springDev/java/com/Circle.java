package springDev.java.com;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Circle implements Shape {
	/*
	 * If class constructor is private, IOC container can access them.
	 */
	private Circle() {
		System.out.println("In a constructor");
	}

	private List<Integer> list;
	private Set addressSet;
	private Map addressMap;
	private Properties addressProp;
	
	public Set getAddressSet() {
		return addressSet;
	}

	public Map getAddressMap() {
		return addressMap;
	}

	public Properties getAddressProp() {
		return addressProp;
	}


	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public List<Integer> getList() {
		return list;
	}

	public void draw() {
		System.out.println("Drawing a circle!!");
		for (int i : list) {
			System.out.println(i);
		}
		System.out.println(this.getAddressMap());
System.out.println(this.getAddressProp());
System.out.println(this.getAddressSet());
	}

	public String toString() {
		return this.getList().toString();
	}
}
