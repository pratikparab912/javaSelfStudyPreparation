package com.cybage.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
/*
 * forEach, collect, reduce, count, min, max, findFirst, findAny, and toArray.
 */
public class TerminalMethods {

	public static void main(String[] args) {
		
		List<String> employees=Arrays.asList("Ram","Sham","Ram","Jam","Tam","Tom");

		//count
		int count_of_employee=(int) employees.stream().distinct().count();
		System.out.println("Count of employee:"+count_of_employee);
		
		//min
				List<Integer> data=Arrays.asList(10,20,30,2,70,39);
				Optional <Integer> min=data.stream().min((val1,val2)->val1.compareTo(val2));
				
				System.out.println("Min Value:"+min.get());
				
		//max
				Optional <Integer> max=data.stream().max((val1,val2)->val1.compareTo(val2));
				
				System.out.println("Max Value:"+min.get());
		
		/*
		 * reduce all elements into one 
		 * reducer(accumulator, currentValue) => {
						    // Apply some operation to accumulator and currentValue
						    // Return the result as the new accumulator
				}
				In this syntax:
				
				accumulator: The accumulated result of previous operations.
				currentValue: The current element being processed.
		 */
		List<String> info=Arrays.asList("A","B","C","D","E","F");
		
		Optional<String> result=info.stream().reduce((prev_result,current_value)->{
			return prev_result+current_value;
			});
		System.out.println(result.get());
		
		
		//toArray:--Convert Collection tp Array
		
		Object arr[]=info.stream().toArray();
		for(Object val:arr)
			System.out.println(val);
		
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using Stream API to find the sum of list elements
        int sum = numbers.stream()
                        .reduce(0, (acc, num) -> acc + num);

        System.out.println("Sum: " + sum);  // Output: Sum: 15
	}
}
