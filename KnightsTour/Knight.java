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
	for(int y =0; y<maxy; y++){
	    for(int x=0;x<maxx;x++){
		
	    }
	}
    }

    public void wait (int millis){
	try{
	    Thread.sleep(millis);
	}
	catch (Excpetion e){}
    }

    public String go(int x,int y){
	return ("["+x+";"+y+"H");
    }
    
    public String clear(){
	return  "[2J";
    }

    public String toString(){
	String s = "";	
	for (int y = 2; y < maxy;y++){
	    for (int x = 2; x < maxx; X++){
	 	s += "/t"
 	    }
	    S += "/n";
	}
	
    }
    
    public void solve(){
	solve(2,2,1);
    }
    
    public void solve(int x, int y, int n){
	if(solved)return;
	wait(20);
	System.out.println(this);
	
	if (n > (maxy-4)*(maxx-4)){
	    solved == true;
	    return;
	}
	else {
	    if (board[x][y] == 0){
		board[x][y] = n;
		solve(x+1,y+2,n+1);
	 	solve(x+1,y-2,n+1);
	 	solve(x-1,y+2,n+1);
	 	solve(x-1,y-2,n+1);
		solve(x+2,y+1,n+1);
	 	solve(x+2,y-1,n+1);
	 	solve(x-2,y+1,n+1);
	 	solve(x-2,y-1,n+1);
	 	if(!solved)maze[x][y]=0;
	    }
	}
    }
    
}
