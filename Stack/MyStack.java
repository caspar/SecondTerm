import java.util.*;

public class MyStack<T>{

    public static void main(String[] args){
	MyStack M = new MyStack();

    }

    private class Node<T>{
	private T data;
	private Node<T> next;
    
	public Node(T data){
	    this.data=data;
	    next=null;
	}
	public Node(){
	    this.data=null;
	    next=null;
	}
	public void setNext(Node<T> next){
	    this.next=next;
	}
	public void setData(T data){
	    this.data=data;
	}
	public Node<T> getNext(){
	    return next;
	}
	public T getData(){
	    return data;
	}
	public String toString(){
	    return data.toString();
	}
    }

    private Node<T> head;
    //private int length;

    public MyStack(){
	head = null;
    }

    public boolean empty(){
	return head == null;
    }

    public T peek(){
	if(empty()){
	    throw new EmptyStackException();
	}
	return head.getData();
    }

    public T pop(){
	/*
	if(empty()){
	    throw new EmptyStackException();
	}
	T tmp = head.getData();
	*/
	T tmp = peek();
	head = head.getNext();
	return tmp;
    }

    public T push(T cheesecake){
	Node<T> newNode = new Node<T>(cheesecake);
	newNode.setNext(head);
	head = newNode;  
	return cheesecake;
    }

    public int search(T d){
	Node<T> x = head;
	int ans = 1;
	while(x != null){
	    if(x.getData().equals(d)){
		return ans;
	    }
	    ans++;
	    x = x.getNext();
	}
	return -1;
    }


}



