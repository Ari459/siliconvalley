package com.siliconvalley.datastructure.linklists.basic;

class Link {

	public int data;
	public Link next;
	
	public Link(int newData) {
		this.data = newData;
		//this.next = null;
	}
	
	public void displayNode() {
		System.out.print(this.data);
	}
	
}
