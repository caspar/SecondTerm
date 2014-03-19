import java.io.*;
import java.util.*;

public class QuickSort {
    
    
    public static void main(String[] args){
	int[]A={1, 7, 3, 5, 4, 2, 6};
	int[]L=makeArray(10, 10);
	System.out.println(Arrays.toString(A)); 
	quicksort(L);
    }
    
    public static int partition (int[]L, int left, int right){
	Random R = new Random();
    	int[]L2 = new int[right-left];
	int pivotIndex = (R.nextInt(right)+left);
	System.out.println("pivotIndex: " +pivotIndex);//test
	int pivot = L[pivotIndex];
	int l = 0, r = 0;
       	for (int i = left; i<right; i++){
	    System.out.println(Arrays.toString(L2));
	    if (L[i]<=pivot && i != pivotIndex){
		L2[left+l] = L[i];
		l++;
	    }
	    else if (i != pivotIndex){
		L2[(L2.length-1) -r] = L[i];
		r++;
	    }
	}
	L2[left+l] = pivot;
	System.out.println(Arrays.toString(L2));
	return pivotIndex;
    }
    
    public static void quicksort(int[]L){
	quicksort(L, 0, L.length);
    }
    
    public static void quicksort(int[]L, int left, int right){
	System.out.println(Arrays.toString(L));
	int pindex = partition(L,left,right);
	if (L.length < 2){
	    return;
	}
	quicksort(L, left, pindex-1);
	quicksort(L, pindex +1, right);
	
    }

    public static int[] makeArray(int length,int range){
	Random R = new Random();
	int[] L = new int[length];
	for (int i = 0; i < L.length; i++){
	    if (i == 3) {
		L[i] = 5;
	    }
	    else{
		L[i] = R.nextInt(range);
	    }
	}
	return L;
    }
}