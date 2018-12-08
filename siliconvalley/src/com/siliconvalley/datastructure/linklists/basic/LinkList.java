package com.siliconvalley.datastructure.linklists.basic;

class LinkList {

	private Link first;
	private Link last;
	
	public void insetFirst(int data) {
		
		Link newNode  = new Link(data);
		
		if(first==null && last == null) {
			first = newNode; 
			last = newNode;
			return;
		}else {
			newNode.next = first;
			first = newNode;
		}
	}
	
	public void displayLinkList() {
		Link current = first;
		
		if(first==null) {
			System.out.println("\nLink List is Empty!"); 
			return;
		}
		System.out.println("\nPrinting!");
		while(current!=null) {
			current.displayNode();
			System.out.print("->");
			current = current.next;
		}
	}
	
	public void insertLast(int data) {
		
		Link newNode = new Link(data);
		
		if(first==null && last == null) {
			first = newNode;
			last = newNode;
			return;
		}
		else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void deleteFirst() {
		
		if(first==null) {
			System.out.println("\nLink List is Empty!");
			return;
		}else if(first == last) {
			first=last=null;
		}else {
		
			System.out.println("\n\nDeleting First!");
			Link current = first;
			first = first.next;
			current = null;
		}
	}
	
	public void deleteLast() {
		
		if(last==null) {
			System.out.println("\nLink List is Empty!");
			return;
		}else if(first == last) {
			first=last=null;
		}else {
		
			System.out.println("\n\nDeleting Last!");
			Link current = first;
		
			while(current.next.next !=null) {
				current = current.next;
			}
		
			last = current;
			current.next=null;
		}
	}
	
	public void deleteNodeWithKey(int key) {
		
		Link current = first;
		
		if(first.data==key) {
			this.deleteFirst();
		}else if(last.data ==key) {
			this.deleteLast();
		}else {
		
			while(current.next.data != key) {
				current = current.next;
			} 
	
			current.next = current.next.next;
		}
	}

}// end of class Link List
