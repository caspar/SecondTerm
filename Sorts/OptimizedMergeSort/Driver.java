
Amnesty program:

All of the homework server assignments have major issues with multiple people's submissions.

In order of WORST to least horrible errors:
1. Epic bad: SYNTAX errors. Your submitted file doesn't even compile.
    2. Bad: Output has hundreds or thousands of lines of text. 
	3. Pretty bad: Wrong class name, method names, or wrong parameters
    4. Bad enough to mention: You submitted a java file OR your zip had a folder in it.
    5. Bad but I am not mad: You submitted a file that wasn't zip or rar. (like .gz)  This is awesome, but my script didn't account for this. It only handles zip/rar files. 

    Tests I used:

A1 Recursion
    public class Driver{
    public static void main(String[]args){
	/*create an instance of what you are testing*/
	recursion a = new recursion();
	int score = 0;
	/*run calculations*/
	int[] answers={0,1,1,2,3,5,8,13,21,34,55,89};
	for(int i=0;i<answers.length;i++){
	    if(answers[i] == a.fibItr(i)){
		score++;
	    }else
		System.out.println("failed fibItr("+i+")");
	}
	/*score the calculations*/
	/*print out your test results*/
	int[]answers2={0,1,2,8,3,6,9,17,4,20,7,15,10};
	int[]answers3={0,1,2,3,3,3,6, 7,7, 9,9, 9, 9};
	int score2=0;
	int score3=0;

	for(int i=1;i<answers2.length;i++){
	    if(answers2[i] == a.hailLen(i)){
		score2++;
	    }else
		System.out.println("failed hailLen("+i+")");
	}
	System.out.println();
	for(int i=1;i<answers3.length;i++){
	    if(answers3[i] == a.longestHail(i)){
		score3++;
	    }else
		System.out.println("failed longestHail("+i+")");
	}
	score /= 6;
	score2 /= 4;
	score3 /= 4;

	long start=System.currentTimeMillis();
	int result = a.fibItr(40);
	long end=System.currentTimeMillis();

	if(result==102334155 && (end-start) < 200){
	    score++;
	}else{
	    System.out.println("Either fibIter(40) was not 102334155, or it took too long. Result:"+result+" time="+(end-start)/1000.0+"seconds");
	}

	System.out.println("max fib score 3,     student score:"+score);   
	System.out.println("hailLen score 3,     student score:"+score2);   
	System.out.println("longestHail score 3, student score:"+score3);   
	System.out.println("SCORE,"+a.lastName()+","+a.firstName()+","+(score+score2+score3));


 
    }
}

A2 Knights Tour:
public class Driver{
    public static void main(String[]args){
	Knight k=new Knight(Integer.parseInt(args[0]));
	k.solve();
	System.out.println(k);
    }
}


A3 merge sort ArrayList<String>

    import java.util.*;
public class Driver{
    public static void main(String[]args){
	System.out.println(Sorts.name());
	ArrayList<String>A1= new ArrayList<String>();
	ArrayList<String>A2= new ArrayList<String>();
	ArrayList<String>B1= new ArrayList<String>();
	ArrayList<String>B2= new ArrayList<String>();
	for(int i=0;i<10000;i++){
	    String value=""+(10000-i);
	    String value2=""+(i);
	    A1.add(value);
	    A2.add(value);
	    B1.add(value);
	    B2.add(value);
	    B1.add(value2);
	    B2.add(value2);
	}

	Collections.sort(A2);
	Collections.sort(B2);

	Sorts.msort(A1);
	Sorts.msort(B1);

	String ans=Sorts.name();
	if(A1.equals(A2))
	    ans+="Sorted A!";
	if(B1.equals(B2))
	    ans+="Sorted B!";
	System.out.println(ans);    
    }
}

A4 optimized mergesort:

public class Driver{
    public static void main(String[]args){
	int[]aryA = new int[5000000];
	int[]aryB = new int[aryA.length];

	for(int i = 0;i<aryA.length;i++){
	    aryA[i]=(int)(Math.random()*400000000-200000000);
	    aryB[i]=aryA[i];
	}
 
	long start,end,duration,start2,end2;

	start=System.currentTimeMillis();
	Sorts.msortOpt(aryA);
	end=System.currentTimeMillis();

	start2=System.currentTimeMillis();
	Arrays.sort(aryB);
	end2=System.currentTimeMillis();

	if(equals(aryA,aryB)){
	    System.out.println(Sorts.name()+" Time to mergesort \t"+aryA.length+" integers: "+(end-start)/1000.0+"seconds. builtin took:"+(end2-start2)/1000.0);
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

