package com.Assignment1;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

	private List<Product> pro;

	ProductRepo() {
		pro = new ArrayList<Product>();
		Product pr1 = new Product(101, "Mustard Oil", 187.00, "Grocery");
		Product pr2 = new Product(102, "Pants", 700.00, "Clothing");
		Product pr3 = new Product(103, "Headphones", 700.00, "Electronic");
		Product pr4 = new Product(104, "mobile", 32000.00, "Electronic");
		Product pr5 = new Product(105, "Tootbrush", 100.00, "Grocery");
		Product pr6 = new Product(106, "Noodels", 300.00, "Food");
		pro.add(pr1);
		pro.add(pr2);
		pro.add(pr3);
		pro.add(pr4);
		pro.add(pr5);
		pro.add(pr6);
	}

	public List<Product> getList() {
		return pro;
	}
}
