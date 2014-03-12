import java.io.*;
import java.util.*;

public class QuickSort {
    
    
    public static void main(String[] args){
	int[]L={1, 7, 3, 5, 4, 2, 6};
	partition(L, 0, L.length);
    }
    
    public static int partition (int[]L, int left, int right){
	
	Random R = new Random();
    	int[]L2 = new int[right-left]; //6
	int pivot = L[R.nextInt(right)+left]; 
	System.out.println(pivot); //test
	int l = 0;
	int r = 0;
	for (int i = left; i<right; i++){
	    if (L[i]<pivot && i != pivot){
		L2[l] = L[i];
		l++;
	    }
	    else if (i != pivot){
		L2[L2.length - r] = L[i]; //dis dont werk
		r++;
	    }
	}
	for (int j = 0; j < L2.length; j++){
	    L[j] = L2[j];
	    System.out.println(L[j]);
	}
	return pivot;
    }

    public static int quickselect(int[]L, int k){
	return quickselect(L, k, 0, L.length - 1);
    }
    
    public static int quickselect(int[]L, int k, int left, int right){
	return 0;
    }
}