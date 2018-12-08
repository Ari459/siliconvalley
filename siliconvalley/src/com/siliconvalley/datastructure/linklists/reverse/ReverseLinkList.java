package com.siliconvalley.datastructure.linklists.reverse;

import com.siliconvalley.datastructure.linklists.basic.Link;
import com.siliconvalley.datastructure.linklists.basic.LinkList;

public class ReverseLinkList {

	public Link first;
	public Link last;


	public void reverseRecursive(Link headNode) {

		Link ffirst;
		Link rest;

		if(headNode==null) {

			return;
		}

		ffirst = headNode;
		rest = ffirst.next;

		if(rest == null) {
			//first = headNode;
			return;
		}
	}

	public Link newRecursiveReverse(Link localLink,Link r2) {

		if(localLink!=null){

			r2.next =   newRecursiveReverse(localLink.next,r2.next);
			r2.displayNode();

			//localLink.displayNode();
			return localLink;
		}else {
			return this.last;
		}
	}

	public Link newRecursiveReverse2(Link current,Link previous, Link result) {

		if(current!=null){
			previous = current;


			result =   newRecursiveReverse2(current.next,previous.next,result);
			//	result.displayNode();

			//localLink.displayNode();
			return current;
		}else {
			result =previous;
			return result;
		}

	}

	public void reverseIterative() {

		Link current = first;
		Link reverse = null;
		Link temp = null;

		while(current!=null) {

			temp = current.next;
			current.next = reverse;

			reverse = current;
			current = temp;
		}

		first = reverse;

	}


	public static void main(String[] args) {

		LinkList LL = new LinkList();

		LL.displayLinkList();

		LL.insertFirst(9);
		LL.insertFirst(8);
		LL.insertFirst(7);

		//	LL.insertFirst(6);
		//	LL.insertFirst(5);
		//	LL.insertFirst(4);
		//	LL.insertFirst(3);

		LL.displayLinkList();

		LL.reverseIterative();

		System.out.println();
		LL.displayLinkList();

		Link result =null;
		result= LL.newRecursiveReverse2(LL.first,LL.first, LL.first);
		result.displayNode();
	}

}
