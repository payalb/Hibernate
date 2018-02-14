package src.com.business;

import java.util.ArrayList;
import java.util.List;

import src.com.model.Product;

import com.src.exception.IllegalInputException;

public class ProdServiceImpl1  implements ProdService{
	
		private ArrayList<String> catalog= new ArrayList<String>();
		private ArrayList<Product> catalog1= new ArrayList<Product>();
		
		@Override
		public  String getProductName(int id) throws IllegalInputException {
			if(id<10 && id >0){
				return "soap";
			}
			else if(id>10){
			return "rest";
			}
			else
				throw new IllegalInputException("Invalid input!!");
		}

		@Override
		public ArrayList<String> getAllProducts() {
			return catalog;
		}

		@Override
		public void addProduct(String name) {
			catalog.add(name);
			
		}
		

		public ArrayList<Product> getAllProductsv2() {
			return catalog1;
		}
		

		public void addProductv2(Product product) {
			catalog1.add(product);
			
		}
	}


