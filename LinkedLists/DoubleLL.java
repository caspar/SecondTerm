public class DoubleLL{
    
    private class Node<E>{
	E data; 
	Node<E> next, prev;
	
	public Node(E d){
	    data = d;
	}
	
	public String toString(){
	    return ""+data;
	}
	
	public void setData(E d){ data = d; }
	public E getData(){ return data; }
	
	public void setNext(Node<E> n){ next = n; }
	public Node<E> getNext(){ return next; }
	
	public void setPrev(Node<E> p){ prev = p; }
	public Node<E> getPrev(){ return prev; }
    }

    private Node<E> currenr;

    public void insert(E d)
	    
	
    }

}