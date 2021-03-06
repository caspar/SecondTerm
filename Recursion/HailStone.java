import java.io.*;
import java.util.*;

//Caspar Lant

public class HailStone{
    
    public static void main(String[] args){
	HailStone HS = new HailStone();
	
	try{
	    int n = Integer.parseInt(args[0]);
	    HS.hail(n);
	    System.out.println("Hail Length: " + HS.hailLen(n));
	    System.out.println("Longest Hail: "+ HS.longestHail(n));
	}
	catch (Exception e){System.out.println("No input given");
	}
    }
    
    public String firstName(){
	return "ALEXANDER";
    }

    public String middleName(){
	return "CASPAR";
    }
    
    public String lastName(){
	return "LANT";
    }
    
    public int hailLen(int n){ // hailLen(n) : What is the length of the sequence generated by hail(n)
	if (n == 1)
	    return 1;
	if (n%2 == 0)
	    return hailLen(n/2) + 1;
	else
	    return hailLen((3*n)+1) + 1;
    }

    public void hail(int n){
	if (n==1)
	    System.out.println(n);
	else {
	    if (n%2 == 0){
		System.out.println(n);
		hail(n/2);
	    }
	    if (n%2 == 1){
		System.out.println(n);
		hail((3*n)+1);
	    }
	}
    }
    
    public int longestHail(int n){ // 3. longestHail(n) : what starting value from 1 to n generates the longest length sequence.

	if (n == 1)
	    return 1;
	else{
	    if (hailLen(n) > longestHail(n-1)){
		return hailLen(n);
	    }
	    return longestHail(n-1);
	}
    }	
}
    
