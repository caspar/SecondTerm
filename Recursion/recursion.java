public class Recursion{
    
    private int output = 1;
    
    public static void main(String[] args){
	int test = Integer.parseInt(args[0]);
	Recursion fact;
	fact = new Recursion(test);
    }
    
    public Recursion(int input){
	System.out.println("Factorial: "+factorial(input));
	System.out.println("Fibonacci: "+fib(input));
	System.out.println("Fibonacci Fast: "+fibIter(input));
    }

    private int fib(int input){
	if (input == 0)
	    return 0;
	if (input == 1)
	    return 1;
	else
	    return fib(input-1)+fib(input-2);
    }

    private int factorial(int input){
       	if (input == 0)
	    return 1;
	else{
	    return input*(factorial(input-1));
	}
    }
    
    private int fibHelp(int penult, int last, int n){
	if (n == 0)
	    return penult; 
	else 
	    return fibHelp(last, penult+last, n-1);
    }
    private int fibItr(int n){
	if (n < 2)
	    return n;
	else
	    return fibHelp(0,1,n-2);
    }
}