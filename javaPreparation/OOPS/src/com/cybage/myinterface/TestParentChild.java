package com.cybage.myinterface;

public class TestParentChild {

	public static void main(String[] args) {
		ChildInterface childref = new ParentChildImpl();
		childref.disply();
		childref.show();
		ParentInterface parentref = new ParentChildImpl();
		parentref.disply();
		//parentref.show();
		
		Child12 ref = new Parent12Child12Impl();
		ref.putData();

	}

}
