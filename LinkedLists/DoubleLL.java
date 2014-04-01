public class DoubleLL<E>{
    
    private class Node<E>{
	private E data; 
	private Node<E> next, prev;
	
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

    private Node<E> current = null;

    public void insert(E d){ //edited
	Node<E> n = new Node<E> (d);
	if (current == null){ //if list is empty
	    current=n;
	    current.next=n;
	    current.prev=n;
	}
	else{
	    n.next = current.next;
	    n.prev = current;
	    (current.next).prev = n;
	    current.next = n;
	}
    }

    public E getCurrent(){
	return current.data;
    }
    public void forward(){
	current = current.next;
    }
    public void back(){
	current = current.prev;
    }
    public String toString() {
	if (current == null)
	    return "";
	
	Node<E> tmp = current.next;
	String s = "";
	while (tmp != current){
	    s += tmp.data+ " ";
	    tmp = tmp.next;
	}
	return s;
    }

    public static void main (String[] args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("caspar");
	System.out.println(L);
	L.insert("is");
	System.out.println(L);
	L.insert("da");
	System.out.println(L);
	L.insert("bomb");
	System.out.println(L);
	// First test these three
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
    }
}