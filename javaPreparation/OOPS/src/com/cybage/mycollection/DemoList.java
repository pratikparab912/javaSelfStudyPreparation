package com.cybage.mycollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DemoList {

	public static void main(String[] args) {
		
		DemoList.demoArrayList();
		//DemoList.demoLinkedList();
		
	}
	public static void demoArrayList() {
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sham");
		list.add("Sham");
		list.add("Sham");
		list.add("Jaaam");
		list.add(null);
		list.add(null);
		
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			String name = listIterator.next();
			System.out.println(name);
		}
		System.out.println("In Reverse order");
		while(listIterator.hasPrevious()) {
			String name = listIterator.previous();
			System.out.println(name);
		}
		
	}
	public static void demoLinkedList() {
		List<String> list = new LinkedList<String>();
		System.out.println(list.size());
		list.add("Ram");
		System.out.println(list.size());
		list.add("Sham");
		list.add("Jaaam");
		System.out.println(list.size());
	
		System.out.println(list);
	}

}
