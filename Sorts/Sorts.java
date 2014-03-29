import java.io.*;
import java.util.*;

//Alexander Caspar Lant
//9168
//Sorts.java

public class Sorts{

   public static ArrayList<String> msort(ArrayList<String> L)
    {
        ArrayList<String> left = new ArrayList<String>();
        ArrayList<String> right = new ArrayList<String>();
        int center = 0;

        if(L.size()==1) return L;
        else{
            center = L.size()/2;
            // copy the left half of L into the left.
            for(int i=0; i<center; i++){
                    left.add(L.get(i));
            }

            //copy the right half of L into the new arraylist.
            for(int i=center; i<L.size(); i++){
                    right.add(L.get(i));
            }

            // Sort the left and right halves of the arraylist.
            left  = msort(left);
            right = msort(right);

            // Merge the results back together.
            merge(left,right,L);

        }
        return L;
    }

    private static void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> L) {

        int leftIndex = 0;
        int rightIndex = 0;
        int LIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size())
        {
            if ((left.get(leftIndex).compareTo(right.get(rightIndex)))<0) 
            {
                L.set(LIndex,left.get(leftIndex));
                leftIndex++;
            }
            else 
            {
                L.set(LIndex, right.get(rightIndex));
                rightIndex++;
            }
            LIndex++;
        }

        ArrayList<String>remaining;
        int remainingIndex = 0;
        if (leftIndex >= left.size()) {
            // The left arraylist is empty
            remaining = right;
            remainingIndex = rightIndex;
        }
        else {
            // The right arraylist is empty
            remaining = left;
            remainingIndex = leftIndex;
        }

        // Copy the remaining of whichevery AL was not empty
        for (int i=remainingIndex; i<remaining.size(); i++) {
            L.set(LIndex, remaining.get(i));
            LIndex++;
        }
    }
    
    public static String name(){
        return "Lant,Alexander";
    }
    
}