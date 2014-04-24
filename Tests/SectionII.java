//1.

public String recombine(String word1, String word2){
    //returns a String
    return (word1.subString(0, (word1.length()+1)/2)
	    + word2.subString((word2.length())/2));	 
}

public String[] mixedWords(String[] words){
    String[] out = new String[words.length];
    for (int i = 0; i < words.length-1; i += 2){
	//0, 2, 4, 6...
	out[i]   = recombine(words[i]  , words[i+1]);
	out[i+1] = recombine(words[i+1], words[i]  );			   
    }
    return out;
}
			   
//2.

public static int getPeakIndex(int[] array){
    int peakIndex = -1;
    for (int i = 1; i < array.length-1; i ++)
	if (array[i] > array[i-1] && 
	    array[i] > array[i+1]) 
	    peakIndex = i;
    return peakIndex;
}


//I think:
public static boolean isMountain(int[]array){
    int peakIndex = getPeakIndex(array);
    if (peakIndex == -1) return false; //precautionary
    return (isIncreasing(array, peakIndex) &&
	    isDecreasing(array, peakIndex)) ;
}

//3.

public int getRandomDirection(){
    //figured this would be faster than initializing a location class
    //and choosing variables out of an array(List?)
    Random r = new Random();
    int out = ((360 / (r.nextInt(4) + 1)) - 90);
    out += (r.nextInt(2)) * 45;
    return out;
}

public ArrayList<Location> getMoveLocations(){
    ArrayList<Location> out = super.getMoveLocations();
    for (int i = 0; i < out.size(); i++){
	if ((Math.abs(((out.get(i).getRow()) 
		      - super.getLocation().getRow()) > Maxdistance) ||
	    Math.abs(((out.get(i).getCol())
		      - super.getLocation().getRow()) > Maxdistance))
	    && get(i).isValid())
	    out.remove(i);
    }
    return out;
}

public Location selectMoveLocation(ArrayList<Location> locs){
    if (locs.size() == 0) return getLocation();
    Location result = super.selectMoveLocation();
    if (


}

//4.

public boolean record(int score){
    (for int i = 0; i < scoreInfo.size(); i++){
	if (scoreInfo.get(i).getScore() == score){
	    scoreInfo.get(i).increment();
	    return false;
	}
    }
    ScoreInfo pt = new ScoreInfo(score);
    (i = 0; i < scoreInfo.size(); i ++){
	if ((scoreInfo.get(i-1).getScore() < score) && 
	    (scoreInfo.get(i).getScore() > score)){
	        scoreInfo.add(i,pt);
		return true;
	}
    }
}

public void recordScores(int[] stuScores){
    for (int i = 0;i<stuScores.length();i++){
	record stuScores[i];
    }
}