//Caspar Lant
//Binary Search Tree

import java.util.*;

public class Tree{

	private static Node head = null;
	private static int depth = 1;

	public static void main(String[] args){
		Tree t = new Tree(10);
		t.add(9);
		t.add(8);
		System.out.println(depth);
		System.out.println(head.getRight());
		System.out.println(head.getLeft().getValue());
		System.out.println(head.getLeft().getLeft().getValue());
		t.add(12);
		System.out.println(head.getRight().getValue());
		System.out.println(head.getRight().getQuantity());
		t.add(12);
		System.out.println(head.getRight().getQuantity());
	}

	public class Node{

		private Node nextLeft;
		private Node nextRight;
		private int value;
		private int quantity = 1;

		public Node(int value){
			this.value=value;
			nextLeft=null; //not necessary
			nextRight=null;
		}
		public void setNextRight(Node next){
			this.nextRight=next;
		}	
		public void setNextLeft(Node next){
			this.nextLeft=next;
		}
		public boolean hasRight(){
			return this.nextRight != null; //not sure if this will work... 
		}
		public boolean hasLeft(){
			return this.nextLeft != null; //not sure if this will work... 
		}
		public Node getRight(){
			return nextRight;
		}
		public Node getLeft(){
			return nextLeft;
		}
		public void setValue(int value){
			this.value=value;
		}
		public int getValue(){
			return value;
		}
		public void increment(){
			quantity++;	
		}
		public int getQuantity(){
			return quantity;
		}

	}

	//public Tree(){
	//	Tree(10);
	//}
	public Tree(int value){
		head = new Node(value);
	}


	public void add(int value){ //why don't I do this recursively... Or not
		if (head == null) head.setValue(value);
		Node current = head;
		for (int i = 0; i < depth; i++){
			if (current.getValue() == value){
				current.increment(); 
				return;
			}
			else {
				if(current.getValue() > value){
					if (current.hasLeft())
						current = current.getLeft();
					else{
						current.setNextLeft(new Node(value));
						depth++;
						return;
					}

				}
				if(current.getValue() < value){
					if (current.hasRight())
						current = current.getRight();
					else{
						current.setNextRight(new Node(value));	
						depth++;
						return;
					}	
				}
			}
		}	
	}

	public final void remove(){

	}

	public int getDepth(){
		return depth;
	}


}