import java.util.*;
import java.io.*;
public class Knight{

    private int[][]board;
    private int maxx,maxy;
    private int startx,starty;
    private boolean solved = false;
    
    public Knight(int n){
	maxy=maxx=n;
	board = new int[n][n];
	//for(int y =0; y<maxy; y++){
	//    for(int x=0;x<maxx;x++){
	       
    }

    public Knight(){
	this(5);
    }

    public void wait(int millis){
	try{
	    Thread.sleep(millis);
	}
	catch (Exception e){}
    }


    public String toString(){
	String s = "";

	for (int x = 0; x < maxx; x++) {
	    for (int y = 0; y < maxy; y++ ) {
		s = s + " " + board[x][y];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public void solve(){
	solve(0,0,1);
    }
    
    public void solve(int x, int y, int n){
	//if(solved)return;
	wait(20);
	System.out.println(this);
	
	if (n > (maxy-4)*(maxx-4)){
	    solved = true;
	    return;
	}
	
	else {
	    if (board[x][y] == 0){
		board[x][y] = n;
		solve(x+1,y+2,n+1);
	 	if(!solved)board[x][y]=0;
	 	solve(x+1,y-2,n+1);
		if(!solved)board[x][y]=0;
	 	solve(x-1,y+2,n+1);
		if(!solved)board[x][y]=0;
	 	solve(x-1,y-2,n+1);
		if(!solved)board[x][y]=0;
		solve(x+2,y+1,n+1);
		if(!solved)board[x][y]=0;
	 	solve(x+2,y-1,n+1);
		if(!solved)board[x][y]=0;
	 	solve(x-2,y+1,n+1);
		if(!solved)board[x][y]=0;
	 	solve(x-2,y-1,n+1);
	 	if(!solved)board[x][y]=0;
	    }
	}
    }
    
}
