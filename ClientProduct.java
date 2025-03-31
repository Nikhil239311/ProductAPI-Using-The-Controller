package tka.com;

import java.util.ArrayList;
import java.util.List;

public class ClientProduct {

	public static void main(String[] args) {
	/*	System.out.println("1 Insert Product ");
		ProductController pc=new ProductController();
		pc.addProductDetails();
		
		System.out.println("2 Update Product ");
		ProductController pc=new ProductController();
		pc.updateProduct(1,"book");
		
		System.out.println("3 delete Product ");
		ProductController pc=new ProductController();
		pc.deleteProduct(5);
		
		System.out.println("4 Display Product By id  ");
		ProductController pc=new ProductController();
		Product p=pc.dispalyProductById(5);
		System.out.println(p);
		
		System.out.println("4 Display Product By id  ");
		ProductController pc=new ProductController();
		Product p=pc.dispalyProductByIdRes();
		System.out.println(p);
	
		System.out.println("5 Display All Product ");
		ProductController pc=new ProductController();
		List<Product> p=pc.dipslayAllDetails();
		System.out.println(p+"\n");
			
		System.out.println("6 Display details By Name ");
		ProductController pc=new ProductController();
		List<Product> p=pc.dipslayDetailsByName("book");
		System.out.println(p+"\n");
			
		
		System.out.println("6 Display details By Name ");
		ProductController pc=new ProductController();
		List<Product> p=pc.dipslayDetailsByNameRes();
		System.out.println(p+"\n");
		
		
		System.out.println("7 Display details By Pattern Name ");
		ProductController pc=new ProductController();
		List<Product> p=pc.displayDetailsByPatternName();
		System.out.println(p); // Not executing
	
		System.out.println("8 Display details Product By price ");
		ProductController pc=new ProductController();
		List<Product> p=pc.dipslayDetailsByPrice();
		System.out.println(p);
		
		System.out.println("9 Display details Product By price into Range ");
		ProductController pc=new ProductController();
		List<Product> p=pc.dipslayDetailsByCostRange();
		System.out.println(p);
		
		System.out.println("10 Display details Product Max And Col print");
		ProductController pc=new ProductController();
		List<Product> p=pc.dipslayDetailsByMaxCost();
		System.out.println(p);
		
		
		System.out.println("12 Display details Product who expired (The cost become 0)");
		ProductController pc=new ProductController();
		List<Product> p=pc.dipslayExpiredDetails();
		System.out.println(p);
		*/
		

		System.out.println("13 Display details Product By asc order Cost");
		ProductController pc=new ProductController();
		List<Product> p=pc.dipslayAscCost();
		System.out.println(p);
		
	}
}
