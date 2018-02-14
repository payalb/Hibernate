package src.com.business;

import java.util.List;

import com.src.exception.IllegalInputException;

public interface ProdService {

	public  String getProductName(int id) throws IllegalInputException ;

	public List<String> getAllProducts();

	public void addProduct(String name);


}
