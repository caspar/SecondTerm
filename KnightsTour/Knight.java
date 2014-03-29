import java.io.*;
import java.util.*;

public class Knight{
    
    private int[][] board;
    private int height, width;
    private int startx, starty;
    private boolean solved = false;
    private boolean foundStart = false;

    public Knight(int n){ //creates board
	maxx=n+4;
	maxy=n+4;
	board = new int[maxx][maxy];
	for(int i=0; i<board.length;i++){
	    for(int j=0;j<board[i].length;j++){
		if(i<2 || i>maxx-3 || j<2 || j>maxy-3){
		    board[i][j]=-1;
		}
	    }
	}
    }
    
    public String toString(){
	String s = "";
	for(int i=0;i<board.length;i++){
	    for(int j=0;j<board[i].length;j++){
		s+=board[i][j]+"\t";
	    }
	    s+="\n"+"\n";
	}
	return s;
    }



}