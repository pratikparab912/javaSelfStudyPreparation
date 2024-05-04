package com.java8.predicate.joins;

import java.util.function.Predicate;

public class PredicateJoins {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9,10};

        Predicate<Integer> n1 = a->(a>2);
        Predicate<Integer> n2 = b->(b%2==0);

        System.out.println("Greater Than 2 : ");
        operationPredicate(n1,x);

        System.out.println("\nEven Numbers : ");
        operationPredicate(n2,x);

        System.out.println("\nOdd Numbers : ");
        operationPredicate(n2.negate(),x);

        System.out.println("\nGreater Than 2 And Even Numbers");
        operationPredicate(n1.and(n2),x);

        System.out.println("\nGreater Than 2 Or Even Numbers");
        operationPredicate(n1.or(n2),x);
    }

    public static void operationPredicate(Predicate<Integer> p, int[] x) {
        for(int eachValue : x) {
            if(p.test(eachValue)) {
                System.out.println(eachValue);
            }
        }
    }
}
