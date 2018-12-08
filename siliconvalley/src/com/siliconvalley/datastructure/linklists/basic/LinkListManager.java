package com.siliconvalley.datastructure.linklists.basic;

class LinkListManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList LL = new LinkList();
		
		LL.displayLinkList();
		
		LL.insertLast(-111);
	
		
		LL.insertFirst(12);
		
		LL.insertFirst(34);
		LL.insertFirst(-19);
		
		LL.insertLast(67);
		LL.insertLast(99);
		LL.insertFirst(-99);
		
		LL.displayLinkList();
		
		LL.deleteFirst();
		
		LL.displayLinkList();
		
		LL.deleteLast();
		
		LL.displayLinkList();
		
		LL.deleteNodeWithKey(-111);
		
		LL.displayLinkList();
		
		//LL.deleteNodeWithKey(34);
		
		//LL.displayLinkList();
		
		//LL.deleteNodeWithKey(67);
		
		//LL.displayLinkList();
		
		LL.deleteNodeWithKey(-19);
		
		LL.displayLinkList();
		
		LL.deleteNodeWithKey(12);
		
		LL.displayLinkList();
		
		LL.deleteNodeWithKey(67);
		
		LL.displayLinkList();
		
		LL.deleteNodeWithKey(34);
		
		LL.displayLinkList();
		
		LL.insertLast(12);
		LL.insertLast(9999);
		LL.insertFirst(0);
		
		LL.displayLinkList();
		
	}

}
