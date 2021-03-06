import java.io.*;
import java.util.*;

public class MergeSort{
    
    public boolean isSorted = false;
    
    public static void main(String[] args){
	try {
	    MergeSort MS = new MergeSort(args[0]);
	}
	catch (Exception oops){
	}
    }
       
    private int[] merge(int[] a, int[] b){
	int[]out=new int[a.length+b.length];
	int ia=0,ib=0;
	while (ia<a.length || ib<b.length){
	    if (ia<a.length && (ib>=b.length || a[ia]<b[ib])){
		out[ia+ib]=b[ib];
		ia++;
	    }else{
		out[ia+ib]=a[ia];
		ib++;
	    }
	}
	return out;
    }

    public void mergesort(int [] a){
	
	int[] ans;
	
	if (a.length > 1){
	    // make 2 smaller arrays
	    int[] L1 = new int[] (a.length/2);
	    int[] L2 = new int[] ((a.length+1)/2);
	    
	    //copy a to the smaller arrays
	    arraycopy(a, 0,         L1, 0, L1.length);
	    arraycopy(a, L1.length, L2, 0, L2.length);
	    
	    //msort each half
	    mergesort(L1);
	    mergesort(L2);
	    
	    //merge arrays
	    ans = merge(L1,L2);

	    //copy ans back into a
	    arraycopy(ans, 0, a, 0, a.length);
	}
    }
   
    public int[] merge1(int[] a, int[] b){
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

    public String StringSort(String){
	


    }
    
}