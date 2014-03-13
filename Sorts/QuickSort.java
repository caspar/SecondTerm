import java.io.*;
import java.util.*;

public class QuickSort {
    
    
    public static void main(String[] args){
	int[]L={1, 7, 3, 5, 4, 2, 6};
	System.out.print("\n[");
	for (int i = 0; i<L.length; i++)
	    System.out.print(L[i] + " ");
	System.out.print("] \n");

	partition(L, 0, L.length);
    }
    
    public static int partition (int[]L, int left, int right){
	Random R = new Random();
    	int[]L2 = new int[right-left]; //6
	int pivot = L[R.nextInt(right)+left]; 
	System.out.println(pivot + " ---> " + L[pivot]); //test
	int l = 0;
	int r = 0;
	for (int i = left; i<right; i++){
	    if (L[i]<=pivot && i != pivot){
		L2[left+l] = L[i];
		l++;
	    }
	    else if (i != pivot){
		L2[(L2.length -1) -r] = L[i]; //dis dont werk
		r++;
	    }
	}
	L2[l] = L[pivot];
	System.out.print("[");//test
	for (int j = 0; j < L2.length; j++){
	    L[j] = L2[j];
	    System.out.print(L2[j]+" ");
	}
	System.out.print("] \n\n");
	return pivot;
    }
    
    public static int quickselect(int[]L, int k){
	return quickselect(L, k, 0, L.length - 1);
    }
    
    public static int quickselect(int[]L, int k, int left, int right){
	int pindex = partition(L,left,right);
	if (pindex == k)
	    return L[k];
	if (k<pindex)
	    return quickselect(L, k, left, pindex -1);
	else
	    return quickselect(L, k, pindex +1, right);
    }
}