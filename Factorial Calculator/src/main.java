public class main {

    public static void main(String[] args){
        //Calculate the factorial for n
        int n = 5;
        System.out.print(n + "! = " + calculateFactorial(n));
    }

    //Recursively multiplies n by n-1
    public static int calculateFactorial(int n){
        if ((n-1) > 0){
            n *= (calculateFactorial(n - 1));
        }
        return n;
    }
}
