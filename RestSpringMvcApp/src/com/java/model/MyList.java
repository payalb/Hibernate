package com.java.model;

import java.util.ArrayList;
import java.util.RandomAccess;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyList<MyObject> extends ArrayList<MyObject> implements RandomAccess, Cloneable, java.io.Serializable{

	private static final long serialVersionUID = 1L;

}
