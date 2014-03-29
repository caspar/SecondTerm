public class Driver{

    public static void main(String[]args){

	Knight k;
	if(args.length < 1){
	    k = new Knight(5);
	}else{
	    k = new Knight(Integer.parseInt(args[0]));
	}
	k.solve();

    }

}
