import java.io.*;
import java.util.*;

public class Knight2 {

    public static int[][] board;
    static int[] xMoves = { 2,1,2,1,-1,-2,-2,-1 }; 
    static int[] yMoves = { -1,-2,1,2,2,1,-1,-2 };
    public static int moveCount = 1;
    public static boolean solved = false;

    public Knight2(int n){
	board = new int[n][n];
    }

    
    public static void solve(int x, int y, int n){

	while (!solved){

	    if (moveCount == ((n * n) - 1)) {
		System.out.println(toString(board));
		System.out.println("Finished in " + (System.nanoTime() / 1000000) + " milliseconds.");
		solved = true;
	    }

	    else {
		for (int i = 0; i < 8; i++) { 
		    if ((x + xMoves[i]) >= 0 && (x + xMoves[i]) < n        
			&& (y + yMoves[i]) >= 0 && (y + yMoves[i]) < n){ 
			
			if (board[x + xMoves[i]][y + yMoves[i]] == 0) { 
			    
			    board[x + xMoves[i]][y + yMoves[i]] = moveCount; 
			    System.out.println(toString(board));           
			    moveCount++;                             
			    
			    try{ Thread.sleep(20); }
			    catch(Exception oops){}
			    solve( (x + xMoves[i]), (y + yMoves[i]), n );

			}
		    }


		    try{
			    board[x + xMoves[i]][y + yMoves[i]] = 0;
			    moveCount--;		   
		    }catch(Exception oopies){}
		}
	    }
	}
	if(solved){System.exit(0);}
    }

    public void solve(){
	solve(0, 0, board[0].length);
    }
    
    public static String toString(int[][] a) {
	String s = "";
	int columns;
	int rows;

	for (rows = 0; rows < a.length; rows++) {
	    for (columns = 0; columns < a[0].length; columns++ ) {
		s = s + " " + a[rows][columns];
	    }
	    s = s + "\n";
	}
	return s;
    }
}