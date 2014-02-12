import java.util.*;
import java.io.*;
public class Mazesolver{

    private char[][]maze;
    private int maxx,maxy;
    private int startx,starty;
    private boolean solved = false;
    private boolean foundstart = false;

    public Mazesolver(String filename){
	String ans = "";
	try{
	    Scanner in = new Scanner(new File(filename));

	    //keep reading next line
	    while(in.hasNext()){
		String line= in.nextLine();
		if(maxy==0){
		    //calculate width of the maze
		    maxx=line.length();
		}
		//every new line add 1 to the height of the maze
		maxy++;
		ans+=line;
	    }
	}
	catch(Exception e){
	    System.out.println("File: "+filename+" could not be opened.");
	    e.printStackTrace();
	    System.exit(0);
	}

	maze = new char[maxx][maxy];
	for(int i=0;i<ans.length();i++){
	    char c = ans.charAt(i);
	    maze[i%maxx][i/maxx]= c;
	    if(c=='S'){
		foundstart=true;
		startx = i%maxx;
		starty = i/maxx;
	    }
	}
    }

    public String go(int x,int y){
	return ("["+x+";"+y+"H");
    }
    
    public String clear(){
	return  "[2J";
    }

    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }

    public String toString(){
	String ans = ""+maxx+","+maxy+"\n";
	for(int i=0;i<maxx*maxy;i++){
	    if(i%maxx ==0 && i!=0){
		ans+="\n";
	    }
	    ans += maze[i%maxx][i/maxx];
	}
	return clear()+go(0,0)+ans+"\n";
    }
    
    public void solve(){
	if(!foundstart){
	    System.out.println("No starting point 'S' found in maze.");
	}else{
	    maze[startx][starty]=' ';
	    solve(maze,startx,starty);
	}
    }

    public void solve(char[][]maze,int x,int y){
	wait(20);
	System.out.println(this);
	
	//try to solve the maze here...

    }


}
