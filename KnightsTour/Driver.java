public class Driver{

    public static void main(String[]args){
	Mazesolver f;
	if(args.length < 1){
	    f = new Mazesolver("data.dat");
	}else{
	    f = new Mazesolver(args[0]);
	}
	f.solve();



    }

}
