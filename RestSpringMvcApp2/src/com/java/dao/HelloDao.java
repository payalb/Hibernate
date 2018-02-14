package com.java.dao;

import org.springframework.stereotype.Repository;

import com.java.exception.NotFoundException;
import com.java.model.MyList;

@Repository
public class HelloDao {

	private static MyList<MyObject> list = new MyList<MyObject>();

	static {
		list.add(new MyObject(1, "payal"));
		list.add(new MyObject(2, "shweta"));
	}

	public MyList<MyObject> getList() {
		return list;
	}

	public MyObject getObject(String word) {
		for (MyObject object : list) {
			if (object.getName().equalsIgnoreCase(word)) {
				return object;
			}
		}

		throw new NotFoundException();

	}

	public void addObject(MyObject obj) {
		list.add(obj);
	}

}
