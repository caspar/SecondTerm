public class Queue<E>{

    public static void main(String[] args){
    }

    private class Node<E>{
	private E data;
	private Node<E> next;
    
	public Node(E data){
	    this.data=data;
	    next=null;
	}
	public Node(){
	    this.data=null;
	    next=null;
	}
	public void setNext(Node<E> next){
	    this.next=next;
	}
	public void setData(E data){
	    this.data=data;
	}
	public Node<E> getNext(){
	    return next;
	}
	public E getData(){
	    return data;
	}
	public String toString(){
	    return data.toString();
	}
   }
    
    public Node start;
    public Node end;
    
    public void enqueue(E input){ 
	end.setNext(input);
	end=end.setNext;
    }

    public E dequeue(){ //returns null if queue is empty
	
    }

    public boolean empty(){
	return (start == null);
    }

    public E peek(){ 
   
    }
    


}