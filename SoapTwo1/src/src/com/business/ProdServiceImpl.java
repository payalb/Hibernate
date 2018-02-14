package src.com.business;

import java.util.ArrayList;
import java.util.List;

import src.com.model.Product;

public class ProdServiceImpl implements ProdService{

	private List<String> catalog= new ArrayList<String>();
	
	@Override
	public  String getProductName(int id) {
		if(id<10)
			return "soap";
		return "rest";
					
	}

	@Override
	public List<String> getAllProducts() {
		return catalog;
	}

	@Override
	public void addProduct(String name) {
		catalog.add(name);
		
	}
	
	
}
