public class MyArrayStack{
    public static void main(String[] args){
	MyArrayStack as = new MyArrayStack();
	as.push(new Integer(3));
	as.push(new Integer(4));
	as.push(new Integer(5));
	as.push(new Integer(6));
	while(!s.empty()) push;


    }
    
    public void grow(){


    }
    public void shrink(){
	
    }
    public boolean empty(){
	return size ==0;
    }
    public E peek(){
	if (size>0)
	    return data[size-1];
	throw new EmptyStackException();
		
    }
    public E pop(){
	E ans=peek();
	size--;
	return ans;
    }
    
    public E push(E value){
	if (size==data.length)
	    grow();
	data[size]=value;
	size++;
	return value;
    }
	
    
}