import java.io.*;
import java.util.*;

public class MergeSort{
    
    public static void main(String[] args){
	try {
	    MergeSort MS = new MergeSort(args[0]);
	}
	catch (Exception oops){
	}
    }
    

    public void msort(int [] a){
	//
	int[] ans;
	
	if (a.length > 1){
	    // make 2 smaller arrays
	    int[] L1 = new int[] (a.length/2);
	    int[] L2 = new int[] (a.length/2);
	    
	    //copy a to the smaller arrays
	    arraycopy(a, 0, L1, 0, a.length/2);
	    arraycopy(a, a.length/2, L2, 0, a.length/2);
	    
	    //msort each half
	    msort(L1);
	    msort(L2);
	    
	    ans = merge(L1,L2);
	    //copy ans back into a
	    arraycopy(ans, 0, a, 0, a.length);
	}
    }
   
    public int[] merge(int[] a, int[] b){
	//pre: both a & b are sorted
	//post: returned array has all the values of a & b sorted
	int[] result = new int[a.length + b.length];
	
	for (int n = 0; n < a.length; n++){
	    if (a[n] > b[n]){
		result[n] = a[n];
	    }
	    else{
		result[n] = b[n];
	    }
	}      	
    } 
    
}