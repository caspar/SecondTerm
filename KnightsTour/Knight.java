import java.util.*;

// Caspar Lant
// 9168
// Knight.java

public class Knight {

    int[][] board;
    int[][] moves;
    boolean solved;

    public Knight(int n) {
	board = new int[n][n];
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[0].length; j++){
		board[i][j] = 0;
		
	    }
	}
	moves = new int[8][2];
	moves[0][0] = 1;
	moves[0][1] = 2; 
	
	moves[1][0] = 1;
	moves[1][1] = -2;
	
	moves[2][0] = 2;
	moves[2][1] = 1;
	
	moves[3][0] = 2;
	moves[3][1] = -1;
	
	moves[4][0] = -1;
	moves[4][1] = 2; 
	
	moves[5][0] = -1;
	moves[5][1] = -2;
	
	moves[6][0] = -2;
	moves[6][1] = 1;
	
	moves[7][0] = -2;
	moves[7][1] = -1;
	
    }
    
    public void solve(){
	solve(0,0,0, board);
    }
    
    public void solve(int x, int y, int start, int[][] outboard){
	if(!solved){
	    if(x<0 || y<0 || x >= outboard[0].length ||  y>=outboard.length || outboard[y][x] != 0){
		return;
	    }
	    start++;
	    outboard[y][x] = start;
	    if(isSolved(outboard)){
		outboard = findZero(outboard);
		board =	outboard;
		solved = true;
		return;
	    }
	    int[][] newboard = new int[outboard.length][outboard[0].length];

	    for(int i = 0; i < 8; i++){
		int nx = x+moves[i][0];
		int ny = y+moves[i][1];
		for(int ii = 0; ii < outboard.length; ii++){
		    for(int ji = 0; ji < outboard[0].length; ji++){
			newboard[ji][ii] = outboard[ji][ii];
		    }
		}
		solve(nx, ny, start, newboard);
	    }
	}
    }
    
    public int[][] findZero(int[][] outboard){
	outboard[outboard.length-1][0] = outboard[0].length*outboard.length;
	return outboard;
    }
    
    public boolean isSolved(int[][] outboard){
	for(int i = 0; i < outboard.length; i++){
	    for(int j = 0; j < outboard[0].length; j++){
		if(outboard[i][j] == 0){
		    return false;
		}
	    }
	}
	return true;
    }
    
    public String toString(){
	String output = "\n";
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[0].length; j++){
		if(board[i][j] < 10){
		    output+=" ";
		}
		output+=board[i][j] + "  ";
	    }
	    output+="\n";
	}
	return output;
    }
    
}