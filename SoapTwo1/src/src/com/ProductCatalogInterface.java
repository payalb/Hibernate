package src.com;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import src.com.model.Product;

import com.src.exception.IllegalInputException;

/*
 * name: ServiceEndpointInterface
 * portName, serviceName should not be here
 */
@WebService(name="ProductCatalog")
@SOAPBinding(style= Style.RPC)
public interface ProductCatalogInterface {

	
	@WebResult(partName="OutputParam")
	public abstract String getProductName(@WebParam(partName="InputParam") int id) throws IllegalInputException;
	@WebMethod
	public abstract ArrayList<String> getAllProducts();
	@WebMethod(exclude=true)
	public abstract void getProductName(String name);
	@WebMethod
	public abstract @WebResult(name="Product") ArrayList<Product> getAllProduct();

}