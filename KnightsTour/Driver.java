import java.io.*;
import java.util.*;

//Caspar Lant

    public class Driver{
	public static void main(String[]args){
	    try{
		//this grabs the number when you run the command 'java Drive 5'
		int size = Integer.parseInt(args[0]);

		Knight t=new Knight(size);

		t.solve();//this prints the coordinate version of the solution
 
		System.out.println(t);//this prints the board

	    }catch(Exception e){
		System.out.println("Correct usage:\njava Drive n\n where n is a positive integer.");
	    }
	}
    }