public class Node{

    private Node next;
    private String data;

    public Node(String data){
	this.data=data;
	next=null; //not necessary
    }
    public void setNext(Node next){
	this.next=next;
    }
    public Node getNext(){
	return next;
    }
    public void setData(String data){
	this.data=data;
    }
    public String getData(){
	return data;
    }
    public String toString(){
	String output = "";
	if (this.getNext() == null)
	    output = null;
	else
	    output = "Data: " + data;
	return output;
    }

}