package com.muktadirshawn;


public class LinkList {
	
	Node head;
	
	//insert data at linkedlist
	
	public void insert(int data) {
		
		Node node =new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head = node;
		}
		
		else
		{
			Node n=head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	//insert at start
	public void insertAtStart(int data) 
	{
		Node node =new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		
		head = node;
	}
	//insert at anywhere!!!
	
	public void insertAt(int index,int data) {
		Node node =new Node();
		node.data = data;
		node.next = null;
		
		if(index==0) {
			insertAtStart(data);
		}
		else {
		Node n = head;
		for(int i=0;i<index-1;i++) {
			n = n.next;
		}
		node.next=n.next;
		n.next=node;
		
		}
	}
	
	public void deleteAt(int index) {
		
		if(index==0) {
			head=head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println(n1.data+" is deleted succcessfully!!!\n");
			n1 = null;
		}
	}
	
	public void show() {
		Node node = head;
		
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
		
	}

	
	

}
