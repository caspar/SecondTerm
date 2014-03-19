public class Driver{
    public static void main(String[]args){
	Node n1=new Node("Caspar");
	System.out.println(n1.toString());
	n1.setNext(new Node("Gabby"));
	System.out.println(n1.toString());

	//Node last = n1.getNext().getNext();
	//last.setNext(n1);
    }

}