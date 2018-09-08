package com.muktadirshawn;

public class Runner {

	public static void main(String[] args) {
		LinkList list=new LinkList();
		
		list.insert(10);
		list.insert(15);
		list.insert(20);
		
		
		list.insertAtStart(25);
		
		list.insertAt(2, 100);
		
		list.deleteAt(2);
		
		list.show();

	}

}
