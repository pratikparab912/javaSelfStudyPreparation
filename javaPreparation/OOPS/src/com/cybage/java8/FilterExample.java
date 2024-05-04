package com.cybage.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product 
{
	private int productId;
	private String productName;
	private String brandName;
	private float price;
	
	public Product(int productId, String productName, String brandName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brandName = brandName;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getBrandName() {
		return brandName;
	}

	public float getPrice() {
		return price;
	}
	public String toString()
	{
		return productId+"\t"+productName+"\t"+brandName+"\t"+price;
	}
	
}

public class FilterExample 
{
	public static void main(String[] args) {
		/*List<Integer> info=new ArrayList<>();
		info.add(10);
		info.add(15);
		info.add(20);
		info.add(25);
		info.add(30);
		
		System.out.println(info.toString());*/
		
		List<Integer> info=Arrays.asList(10,15,20,25,30,12);
		//List<Integer> info = new ArrayList<Integer>();
		//info.add(10);
		//info.add(15);
		System.out.println(info);
		/*
		 * filter(Predicate)
		 * 
		 * 
				In Java, Predicate is a functional interface that is part of the 
				java.util.function package, which was introduced in Java 8 as a part of 
				the Java Streams API and lambda expressions to support functional-style 
				programming. The Predicate interface is used to represent a boolean-valued 
				function of one argument. It is primarily used for filtering or matching 
				objects based on certain criteria.
				
				Definition of Predicate
				The Predicate<T> interface is defined as follows:
				
				
				@FunctionalInterface
				public interface Predicate<T> 
				{
				    boolean test(T t);
				}
		 * 
		 * Collect Result into to new collection using collect method 
		 * 
		 * */
		
//		List<Integer> even_numbers= info.stream().filter(data->data%2==0).collect(Collectors.toList());
//		System.out.println("Even Number List:"+even_numbers);
		
		/*
		 * forEach(Consumer)
		 * 
		 * In Java, the Consumer interface is another functional interface like Predicate, 
		 * but instead of returning a boolean, it is designed to accept a single input 
		 * argument and perform some operations on it without returning any result. 
		 * This makes it ideal for scenarios where you need to perform actions such as printing,
		 *  modifying, or computing effects with the given objects, but you do not need to 
		 *  produce any output from those actions.

			Definition of Consumer
			The Consumer<T> interface is defined in the java.util.function package and is part of Java 8's functional programming capabilities. Here is the basic structure:
			
			
			@FunctionalInterface
			public interface Consumer<T> {
			    void accept(T t);
			}
		 */
		info.stream()
			.filter(data->data%2==0)
				.forEach(data->System.out.println(data));
		
		
		List<String> employee_names=Arrays.asList("Ram","Sham","Jam","Sonali","Niteen","Vivek");
		System.out.println(employee_names);
//		List<String> employee_filter_names=employee_names.stream().filter(data->data.length()>4 && data.length()<6).collect(Collectors.toList()); 
//		System.out.println(employee_filter_names);
		employee_names.stream()
			.filter(data->data.length()>4 && data.length()<6)
					.forEach(data->System.out.println(data));
		
		//With Entity Reference 
		
		List<Product> products=Arrays.asList(new Product(1, "Fridge", "LG", 78000f),
											 new Product(2, "Laptop", "DELL", 34000f),
											 new Product(3, "AC", "LG", 67000f));
		System.out.println("All Product List:-");
		for(Product p:products)
			System.out.println(p);
		
		System.out.println("Products with cost more than 50,000/-");
		products.stream()
			.filter(product->product.getPrice()>50000)	
				.forEach(product->System.out.println(product));
		
	}

}

