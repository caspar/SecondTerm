import java.util.*;
public class Driver{
    public static void main(String[]args){
	System.out.println(Sorts.name());
	ArrayList<String>A1= new ArrayList<String>();
	ArrayList<String>A2= new ArrayList<String>();
	ArrayList<String>B1= new ArrayList<String>();
	ArrayList<String>B2= new ArrayList<String>();
	for(int i=0;i<10000;i++){
	    String value=""+(10000-i);
	    String value2=""+(i);
	    A1.add(value);
	    A2.add(value);
	    B1.add(value);
	    B2.add(value);
	    B1.add(value2);
	    B2.add(value2);
	}

	Collections.sort(A2);
	Collections.sort(B2);

	Sorts.msort(A1);
	Sorts.msort(B1);

	String ans=Sorts.name();
	if(A1.equals(A2))
	    ans+="Sorted A!";
	if(B1.equals(B2))
	    ans+="Sorted B!";
	System.out.println(ans);    
    }
}
