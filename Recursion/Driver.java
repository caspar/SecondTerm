public class Driver {

    public static void main(String[]args){
        /*create an instance of what you are testing*/
        recursion a = new recursion();
        /*run calculations*/
        System.out.println(a.fibItr(5));
        System.out.println(a.hailLen(5));
        System.out.println(a.longestHail(5));
    }
}