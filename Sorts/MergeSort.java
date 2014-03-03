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