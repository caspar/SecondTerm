import java.io.*;
import java.util.*;

public class quicksort{
   
    public void quicksort(int []L){
	quicksort(L, 0, L.length-1);
    }
   
    public void quicksort(int[]L, int left, int right){
        
	if (right-left<1){ //not sure this is correct.
	    return;
	}
	int pivIndex = partition(L, left, right);
	quicksort(L, left, pivIndex-1);
	quicksort(L, pivIndex+1, right);
	System.out.println(Arrays.toString(L));
    }
   
   
    public int partition(int L[], int front, int back){
	int pivot = L[front];
	while (front < back)
	    {
		while (L[front] < pivot){
		    front++;
		}
		while (L[back] > pivot) {
		    back--;
		}
		  
		int temp = L[front];
		L[front] = L[back];
		L[back] = temp;
	    }
	return front;
    }
   
    /*  
   public static void main(String[] args){
      int[] a = new int[10];
      
      a[0] = 2;
      a[1] = 64;
      a[2] = 25;
      a[3] = 36;
      a[4] = 52;
      a[5] = 43;
      a[6] = 6;
      a[7] = 11;
      a[8] = 98;
      a[9] = 14;
      
      quicksort(a);
      
   }
    */
   
}