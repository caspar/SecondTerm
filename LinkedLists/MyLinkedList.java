public class MyLinkedList{

    private Node head;
    private int  length;
    
    public MyLinkedList(){
	head=new Node("");
	head.setData(null);
    }
    
    public String get(int i){
	return getNode(i).getData();
    }
    
    public void set(int position, String newString) throws Exception{
	getNode(i).setData(newString);
    }

    public int size(){
	return length;
    }

    public void add(String data){
	add(length, data);
    }

    public void add(int index, String data){
	//Throw Exception
	Node temp = new Node(data);
	temp.setNext(getNode(index-1).getNext());
	getNode(index-1).setNext(temp);
	length++;
    }
    
    public void remove(int index) throws Exception{
	Node first = getNode(index-1);
	first.setNext(first.getNext().getNext()); 
	//removes Node at i by dereferencing it.
    }

    private Node getNode(int i)throws Exception{
	if(i<-1 || i >=length)
	    throw new IndexOutOfBoundsException("Index out of bounds, fool!");
	Node temp = head;
	for (int x=0; x<i; x++){
	    temp = temp.getNext();
	}
	return temp;
    }
    
    public int find(String s){
	for (int i = 0; i < length();i++){
	    if (getNode(i).getData().equals(s))
		return i;
	}
	return -1;
    }
    
    public int length(){
	return length;
    }

    public String toString(){	
	String s = "[ ";
	Node temp = head;
	while (temp.getNext() != null){
	    s+= temp.getData() + ", ";
	    temp = temp.getNext
	}
	s+= " ]";
	return s;
    }
}