package tka.com;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

	public void addProductDetails() {
		
		Product p=new Product(5, "bowl",70,20, "1/1/22", "1/1/25");
		ServiceProduct service=new ServiceProduct();
		service.addProductDetails(p);
	}

	public void updateProduct(int id, String name) {
		ServiceProduct service=new ServiceProduct();
		service.updateProduct(id,name);
	}

	public void deleteProduct(int id) {
		ServiceProduct service=new ServiceProduct();
		service.deleteProduct(id);
	}

	public Product dispalyProductById(int id) {
		ServiceProduct service=new ServiceProduct();
		Product p=service.dispalyProductById(id);
		return p;
	}

	public List<Product> dipslayAllDetails() {
		ServiceProduct service=new ServiceProduct();
		List<Product> p=service.dipslayAllDetails();
		return p;
	}

	public List<Product> dipslayDetailsByName(String name) {
		ServiceProduct service=new ServiceProduct();
		List<Product> p=service.dipslayDetailsByName(name);
		return p;
	}

	

	

	public Product dispalyProductByIdRes() {
		ServiceProduct service=new ServiceProduct();
		Product p= service.dispalyProductByIdRes();
		return p;
	}

	public List<Product> dipslayDetailsByNameRes() {
		ServiceProduct service=new ServiceProduct();
		List<Product> p=service.dipslayDetailsByNameRes();
		return p;
	}

	public List<Product> displayDetailsByPatternName() {
		ServiceProduct service=new ServiceProduct();
		List<Product> p=service.displayDetailsByPatternName();
		return p;
	}

	public List<Product> dipslayDetailsByPrice() {
		ServiceProduct service=new ServiceProduct();
		List<Product> p=service.dipslayDetailsByPrice();
		return p;
	}

	public List<Product> dipslayDetailsByCostRange() {
		ServiceProduct service=new ServiceProduct();
		List<Product> p=service.dipslayDetailsByCostRange();
		return p;
	}

	public List<Product> dipslayDetailsByMaxCost() {
		ServiceProduct service=new ServiceProduct();
		List<Product> p=service.dipslayDetailsByMaxCost();
		return p;
	}

	public List<Product> dipslayExpiredDetails() {
		ServiceProduct service=new ServiceProduct();
		List<Product> p=service.dipslayExpiredDetails();
		return p;
	}

	public List<Product> dipslayAscCost() {
		ServiceProduct service=new ServiceProduct();
		List<Product> p=service.dipslayAscCost();
		return p;
	}


}