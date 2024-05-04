package com.cybage.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OtherMethods
{
	public static void main(String[] args) {
		
		//Non-Terminal
		
		List<Integer> info=Arrays.asList(19,23,4,56,2,45);
		List<Integer> sortedList=null;
		sortedList=info.stream().sorted().collect(Collectors.toList());
		System.out.println("ASC Order:"+sortedList);
		
		sortedList=info.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("DESC Order:"+sortedList);
		
		//String Data-ASCII
		List<String> data=Arrays.asList("Ram","Sham","Jam","Niteen","Vivek","Kirti","Rahul","anagha");
		List<String> sorted_data=null;
		sorted_data=data.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted ASC Order:"+sorted_data);
		sorted_data=data.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted DESC Order:"+sorted_data);
		
		
		/*
		 * anyMatch()
		 * 
		 * The anyMatch() method is a part of the Java Stream API, which is used to perform aggregate operations on a stream of elements. 
		 * Specifically, anyMatch() is used to check whether any elements in the stream match a given predicate. 
		 * It returns a boolean value indicating whether at least one element in the stream satisfies the condition specified by the predicate.

				Here's the method signature of anyMatch():
				
				boolean anyMatch(Predicate<? super T> predicate)
		 */
		
		Set<String> names=new HashSet<>();
		names.add("Sonali");
		names.add("Anagha");
		names.add("Vivek");
		names.add("Niteen");
		names.add("Rahul");
		
		boolean result=false;
		result=names.stream().anyMatch(value->value.contains("x"));
		System.out.println("Result (Any Element contain: 'x'):"+result);

		result=names.stream().anyMatch(value->value.contains("a"));
		System.out.println("Result (Any Element contain: 'a'):"+result);
		
		
		/*
		 * allMatch():
		 * 
		 * The allMatch() method, is part of the Java Stream API and is used to perform aggregate operations on a 
		 * stream of elements. However, unlike anyMatch(), which checks if at least one element matches a given predicate, 
		 * allMatch() checks if all elements in the stream match the given predicate.

				Here's the method signature of allMatch():
				
				boolean allMatch(Predicate<? super T> predicate)
		 */
		result=names.stream().allMatch(value->value.contains("a"));
		System.out.println("Result (Any Element contain: 'a'):"+result);
		
		/*
		 * noneMatch()-
		 * The noneMatch() method, also part of the Java Stream API, is used to determine whether none of the elements in the
		 *  stream match a given predicate. It's essentially the opposite of allMatch().

			Here's the method signature of noneMatch():
			
			boolean noneMatch(Predicate<? super T> predicate)
		 */
		
		result=names.stream().noneMatch(value->value.contains("x"));
		System.out.println("Result (Any Element contain: 'x'):"+result);//true

		result=names.stream().noneMatch(value->value.contains("a"));
		System.out.println("Result (Any Element contain: 'a'):"+result);//false
		
		
		//Terminal Methods
		
		/*
		 * The findFirst() method is used in the Java Stream API to retrieve the first element from a stream. 
		 * It returns an Optional<T> object that may or may not contain the first element of the stream.

						Here's the method signature of findFirst():
						
						Optional<T> findFirst()
		 */
		
	      List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

	      Optional<String> firstWord = words.stream().findFirst();

	        if (firstWord.isPresent()) {
	            System.out.println("First word in the list: " + firstWord.get()); // Output: apple
	        } else {
	            System.out.println("The list is empty.");
	        }
	        
	        /*
	         * In Java, if you want to find any element in a stream that matches a given condition, you can use the findAny() method.
	         *  This method returns an Optional object containing an arbitrary element of the stream that matches the specified predicate, 
	         *  if any.

					Here's the method signature of findAny():
					
					Optional<T> findAny()
	         */
	        Optional<String> anyWord =null;
	        anyWord = words.stream().findAny();

	        if (anyWord.isPresent()) {
	            System.out.println("Any word in the list: " + anyWord.get()); // Output: apple
	        } else {
	            System.out.println("The list is empty.");
	        }
	        
	        //With Condition
	        
	        anyWord=words.stream().filter(val->val.contains("b")).findAny();
	        if (anyWord.isPresent()) {
	            System.out.println("Any word contains 'b' : " + anyWord.get()); // Output: apple
	        } else {
	            System.out.println("The list is empty.");
	        }
	        
	        //Append 2 List
			List<String> list1=Arrays.asList("Sonali","Omkar","Sonali");
			List<String> list2=Arrays.asList("Vivek","Rahul");
			Stream<String> stream1=list1.stream();
			Stream<String> stream2=list2.stream();
			
			List<String> resultList=Stream.concat(stream1, stream2).collect(Collectors.toList());
			System.out.println("Concat List:"+resultList);

	        
	        
	}

}

