import java.util.*;
import java.io.*;

public class Sorts{

     public static void msort(ArrayList<String> L) {
	if (L.size() <= 1) {
	    return;
	}

	//Make two parts!
	ArrayList<String> firstHalf = new ArrayList<>();
	ArrayList<String> secondHalf = new ArrayList<>();

	//Split into two parts!
	for (int i = 0; i < L.size() / 2; i++) {
	    firstHalf.add(L.get(i));
	}

	for (int i = L.size() / 2; i < L.size(); i++) {
	    secondHalf.add(L.get(i));
	}

	//Merge the two parts
	ArrayList<String> ans = new ArrayList<>();
	ans.add(merge(msort(firstHalf), msort(secondHalf)));
	L = ans;
    }
 
    public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {
	if (a.size() == 0) return b;
	if (b.size() == 0)return a;

	ArrayList<String> ans = new ArrayList<>();
	int next;
	if (a.get(0) > b.get(0)) {
	    next = b.get(0);
	    b.remove(0);
	} else {
	    next = a.get(0);
	    a.remove(0);
	}
	ans.add(next);
	ans.addAll(merge(a,b));
	a = ans;
    }
    
    public static String name(){
        /****************EDIT YOUR NAME HERE:****************/
        return "Lant,Alexander";
    }
}