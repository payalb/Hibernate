package src.com;

import java.util.ArrayList;

import javax.jws.WebService;

import src.com.business.ProdServiceImpl1;
import src.com.model.Product;

import com.src.exception.IllegalInputException;

// * portName, serviceName should be added here
 
@WebService(endpointInterface="src.com.ProductCatalogInterface")
public class ProdCatalog implements ProductCatalogInterface {
	
	ProdServiceImpl1 service= new ProdServiceImpl1();
	
	
	@Override

	public String getProductName( int id) throws IllegalInputException{
		return service.getProductName(id);
	}

	
	@Override
	public ArrayList<String> getAllProducts(){
		return service.getAllProducts();
		
	}
	
	@Override

	public void getProductName(String name){
		 service.addProduct(name);
	}
	
	
	@Override

	public ArrayList<Product> getAllProduct(){
		return service.getAllProductsv2();
		
	}
}
