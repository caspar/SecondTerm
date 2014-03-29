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
