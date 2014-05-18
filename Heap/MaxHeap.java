public class MaxHeap{

	public Node root;
	private static int depth = 0; //not sure if I need this
	public int count = 0;

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

	public void MaxHeap(){
		root = new Node();
		depth = 1;
		count = 1;
	}

	public void add(int x){
		Node current = root;
		while(current.hasNext()){


		}
	}
	public boolean remove(int x){ //returns false if x is not in heap

	}
	public String toString(){

	}

}

