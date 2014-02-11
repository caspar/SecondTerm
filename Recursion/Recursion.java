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
}