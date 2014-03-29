public class Driver{
    public static void main(String[]args){
	int[]aryA = new int[100000];
	int[]aryB = new int[aryA.length];

	for(int i = 0;i<aryA.length;i++){
	    aryA[i]=(int)(Math.random()*400000000-200000000);
	    aryB[i]=aryA[i];
	}
 
	long start,end,duration,start2,end2;
	String name = Sorts.name();
	start=System.currentTimeMillis();
	Sorts.quicksort(aryA);
	end=System.currentTimeMillis();

	start2=System.currentTimeMillis();
	Arrays.sort(aryB);
	end2=System.currentTimeMillis();

	if(equals(aryA,aryB)){
	    System.out.println(name+" time to Quicksort  "+aryA.length+" integers: "+(end-start)/1000.0+"seconds. builtin took:"+(end2-start2)/1000.0);
	}else{
	    System.out.println("Not Sorted!");
	}


 
    }

    public static boolean isSorted(int[]L){
	if(L==null || L.length<2){
	    return true;
	}
	for(int i=0; i<L.length-1;i++)
	    if(L[i]>L[i+1]){
		return false;
	    }
	return true;
    }
    public static boolean equals(int[]L1,int[]L2){
	if(L1.length == L2.length){
	    for(int i=0; i<L1.length-1;i++)
		if(L1[i]!=L2[i]){
		    return false;
		}
	    return true;
	}else{
	    return false;
	}


    }
}
