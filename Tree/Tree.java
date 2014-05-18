//Caspar Lant
//Binary Search Tree

import java.util.*;

public class Tree{

	private static Node root = null;
	private static int depth = 1;

	public static void main(String[] args){
		Tree t = new Tree();
		t.add(9);
		t.add(8);
		t.add(14);
		t.add(12);
		t.add(12);
		t.add(13);
		t.add(15);
		/*
		 * 			10
		 * 		  /    \
		 * 		 9	   14
		 * 		/     /  \ 
		 * 	   8	12    15
		 * 			 \
		 *           13  
		 */
		
		/*System.out.println(t.search(14));
		System.out.println(t.search(12));
		System.out.println(t.toString());
		
		t.clear();
		int[] arr = {9,8,14,12,12,13,15};
		t.batchAdd(arr);
		System.out.println(t.search(14));
		System.out.println(t.search(12));
		System.out.println(t.toString());
		
		System.out.println(t.root.getLeft().getData());
		System.out.println(t.root.getLeft().getLeft().getData());
		*/
	}

	public class Node{

		private Node nextLeft;
		private Node nextRight;
		private int data;
		private int quantity = 1;

		public Node(int data){
			this.data=data;
			nextLeft=null; //not necessary
			nextRight=null;
		}
		public void setRight(Node next){
			this.nextRight=next;
		}	

		public void setLeft(Node next){
			this.nextLeft=next;
		}
		public boolean hasRight(){
			return this.nextRight != null; //not sure if this will work... 
		}
		public boolean hasLeft(){
			return this.nextLeft != null; //not sure if this will work... 
		}
		public boolean isLeaf(){
			return nextLeft == null && nextRight == null;	
		}
		public Node getRight(){ 
			return nextRight;
		}
		public Node getLeft(){
			return nextLeft;
		}
		public void setdata(int data){
			this.data=data;
		}
		public int getData(){
			return data;
		}
		public void increment(){
			quantity++;	
		}
		public void decrement(){
			quantity--;	
		}
		public int getQuantity(){
			return quantity;
		}
	}

	public Tree(){
		root = new Node(10);	
	}

	public Tree(int data){
		root = new Node(data);
	}

	public void add(int data){ //why don't I do this recursively... Or not
		Node current = root;
		for (int i = 0; i < depth; i++){
			if (current.getData() == data){
				current.increment(); 
				return;
			}
			else {
				if(current.getData() > data){
					if (current.hasLeft())
						current = current.getLeft();
					else{
						current.setLeft(new Node(data));
						depth++;
						return;
					}

				}
				if(current.getData() < data){
					if (current.hasRight())
						current = current.getRight();
					else{
						current.setRight(new Node(data));	
						depth++;
						return;
					}	
				}
			}
		}	
	}

	public boolean remove(int data){ //catches exception
		/* Remove Method:
		 * 3 possible cases: 
		 * 	- node does not exist (return false)
		 * 	- node has no children (delete by dereferencing)
		 * 	- node has a right child (Node's Parent's setRight(Node.getRight())
		 * 	- node has no right children (Node'sParent.setLeft(Node.getLeft()) 	
		 *  - Stay a step back at all tio,es
		 */
		
		if(search(data).equals(null))
			return false;
		if(
		
		Node doomed = search(data);
		return true;
	}
	
	public Node search(int data){ //throws Exception
		Node current = root;
		for (int i = 0; i < depth; i++){
			if (current.getData() == data){ 
					return current;
			}
			if(current.getData() > data){
				if (current.hasLeft())
					current = current.getLeft();
				else{
					System.out.println("Tree does not contain " + data);
					return null;
				}
			}
			if(current.getData() < data){
				if (current.hasRight())
					current = current.getRight();
				else{
					System.out.println("Tree does not contain " + data);
					return null;
				}	
			}	
		}	
		return null;
	}

	public int getDepth(){
		return depth;
	}

	public void batchAdd(int[] arr){
		for (int i = 0; i < arr.length ;i++){
				add(arr[i]); 
		}	
	}
	
	public void clear(){
		root.setLeft(null);
		root.setRight(null);
	}
	
	public String loopToString(){
		Node current = root;
		String result = "" + root.getData() + "}";
		while (current.hasLeft()){
			result = "" + current.getLeft().getData() +", "+ result;
			current = current.getLeft();
			}
		return "{"+result;
	}
	public String toString(){
		return toString("", root);	
	}
	
	public String toString(String input,Node current){
		if (!current.hasLeft() && !current.hasRight()){
			return "" + current.getData();
		}
		if (current.hasLeft()){
			input = "" + toString(input, current.getLeft()) + input;
		}
		if (current.hasRight()){
			input = input + toString(input, current.getLeft());
		}
		return input;
	}

}