public class Driver{
    public static void main(String[]args){
	Knight2 k=new Knight2(Integer.parseInt(args[0]));
	k.solve();
	System.out.println(k);
    }
}
