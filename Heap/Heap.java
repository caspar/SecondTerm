
public class Heap{

	/* HEAPIFICATION OF AN ARRAY IN PLACE
	 * 0-based:
	 * 	children: 2i+1, 2i+2
	 * 	parent: (i-1)/2
	 * 
	 * 1-based:
	 * 	children: 2i, 2i+1
	 * 	parent: i/2		
	 * 
	 * SORT BY REMOVING THE MAX ELEMENT
	 */

	private static Node root = null;
	private static int depth = 1;
	
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
		public void setValue(int value){
			this.value=value;
		}
		public int getValue(){
			return value;
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
	
	public static void heap(int[] arr){
		for(int num : arr)
			add(num);
	}
	
	public static void add(int value){ //why don't I do this recursively... Or not
		Node current = root;
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
						current.setLeft(new Node(value));
						depth++;
						return;
					}

				}
				if(current.getValue() < value){
					if (current.hasRight())
						current = current.getRight();
					else{
						current.setRight(new Node(value));
						depth++;
						return;
					}
				}
			}
		}
	}
	
	public static void sort(int[] a){
		
	}
	
	public static void heapSort(int[] a){
		// Heapify
		// Put in order
		
	}
	
	public static pushUp(){
		
	}
	
	public static pushDown(){
		
	}

}