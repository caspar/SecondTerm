import java.io.*;
import java.util.*;

// Caspar Lant
// 9168
// Sorts.java

public class Sorts{

    public static String name(){
	return "Lant,Alexander";
    }
        
    public static void quicksort(int[] L){
	quicksort(L, 0, L.length-1);
    }
    
    public static void quicksort(int[] arr, int to, int from) {
        int index = partition(arr, to, from);
        if (to < index - 1) {
            quicksort(arr, to, index - 1);
        }
        if (index < from) {
            quicksort(arr, index, from);
        }
    }

    public static int partition(int arr[], int to, int from) {
        int i = to, j = from;
        int tmp;
        int pivot = arr[(to + from) / 2];
        while (i <= j) {
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i <= j){
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

}