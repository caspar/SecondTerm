public class Driver2{

    public static void main(String[]args){

	Knight2 k2;
	if(args.length < 1){
	    k2 = new Knight2(5);
	}else{
	    k2 = new Knight2(Integer.parseInt(args[0]));
	}
	k2.solve();

    }

}
