package tka.com;

import java.util.ArrayList;
import java.util.List;

public class ServiceProduct {

	public void addProductDetails(Product p) {
		
		DaoProduct dao=new DaoProduct();
		
		if(p!=null) {
			dao.addProductDetails(p);
			
		}else {
			System.out.println("Something went wrong ");
		}
	}

	public void updateProduct(int id, String name) {
		DaoProduct dao=new DaoProduct();
		dao.addProductDetails(id,name);
	}

	public void deleteProduct(int id) {
		DaoProduct dao=new DaoProduct();
		dao.deleteProduct(id);
		
	}

	public Product dispalyProductById(int id) {
		DaoProduct dao=new DaoProduct();
		Product p=dao.dispalyProductById(id);
		return p;
		
	}

	public List<Product> dipslayAllDetails() {
		DaoProduct dao=new DaoProduct();
		List<Product> p=dao.dipslayAllDetails();
		return p;
	}

	public List<Product> dipslayDetailsByName(String name) {
		DaoProduct dao=new DaoProduct();
		List<Product> p=dao.dipslayDetailsByName(name);
		return p;
	}

	

	

	public Product dispalyProductByIdRes() {
		DaoProduct dao=new DaoProduct();
		Product p=dao.dispalyProductByIdRes();
		return p;
	}

	public List<Product> dipslayDetailsByNameRes() {
		DaoProduct dao=new DaoProduct();
		List<Product> p=dao.dipslayDetailsByNameRes();
		return p;
	}

	public List<Product> displayDetailsByPatternName() {
		DaoProduct dao=new DaoProduct();
		List<Product> p=dao.displayDetailsByPatternName();
		return p;
	}

	public List<Product> dipslayDetailsByPrice() {
		DaoProduct dao=new DaoProduct();
		List<Product> p=dao.dipslayDetailsByPrice();
		return p;
	}

	public List<Product> dipslayDetailsByCostRange() {
		DaoProduct dao=new DaoProduct();
		List<Product> p=dao.dipslayDetailsByCostRange();
		return p;
	}

	public List<Product> dipslayDetailsByMaxCost() {
		DaoProduct dao=new DaoProduct();
		List<Product> p=dao.dipslayDetailsByMaxCost();
		return p;
	}

	public List<Product> dipslayExpiredDetails() {
		DaoProduct dao=new DaoProduct();
		List<Product> p=dao.dipslayExpiredDetails();
		return p;
	}

	public List<Product> dipslayAscCost() {
		DaoProduct dao=new DaoProduct();
		List<Product> p=dao.dipslayAscCost();
		return p;
	}

}
