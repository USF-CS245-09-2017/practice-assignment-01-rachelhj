public class Fibonacci {
    /*
     * This function returns either the recursive or iterative function.
     */
    public static int fibonacci (int n, String type){
       if(type.equalsIgnoreCase("recursive")){
            return fibonacci_recursive(n);
        }
        else if(type.equalsIgnoreCase("iterative")){
            return fibonacci_iterative(n);
        }
        return 0;
    }
    /*
     * This function returns the fibonacci of n using recursive function.
     */
    public static int fibonacci_recursive(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fibonacci_recursive(n-1)+fibonacci_recursive(n-2);
    }
    /*
     * This function returns the fibonacci of n using iterative function.
     */
    public static int fibonacci_iterative(int n){
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        if(n==0||n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
            sum = n1+n2;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }
}
