package com.siliconvalley.datastructure.array;
import java.util.Random;


// O(n)
public class ShuffleCards {

	private static int[] cards; 
	
	 private static Random randomNo = new Random();
	
	 public static void swapCards(int a, int b) {
		 int temp = cards[a];
		 cards[a] = cards[b];
		 cards[b] = temp;
	 }
	 
	 public static void getRandomCards() {
		 
		 for(int i=cards.length-1; i > 1 ;i--) {
			 int j = randomNo.nextInt(i);
			 swapCards(i,j);
		 }
	 }
	 
	 public static void initializeCards() {
		 
		 cards = new int[52];
		 for(int i=0;i<52;i++) {
			 cards[i] = i+1;
		 }
	 }
	 
	 public static void displayCards() {
		 System.out.println("\nDisplay Cards: ");
		 for(int i=0;i<cards.length;i++) {
			 System.out.print(cards[i]+ " ");
		 }
	 }
	 
	 public static void main(String[] args) {
		 
		 initializeCards();
		 displayCards();
		 getRandomCards();
		 displayCards();
		 
		 
	 }
	 

}
