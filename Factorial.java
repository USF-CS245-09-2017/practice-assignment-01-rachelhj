public class Factorial {  
    /*
     * This function returns either the recursive or iterative function.
     */  
    public static int factorial(int n, String type){
        if(type.equalsIgnoreCase("recursive")){
            return factorial_recursive(n);
        }
        else if(type.equalsIgnoreCase("iterative")){
            return factorial_iterative(n);
        }
        return 0;
    }
    /*
     * This function returns the factorial of n using recursive function.
     */
    public static int factorial_recursive(int n){
        if(n>=0 && n<=2){
            return n;
        }
        return n*factorial_recursive(n-1);
    }
    /*
     * This function returns the factorial of n using iterative function.
     */
    public static int factorial_iterative(int n){
        for(int i=n-1;i>0;i--){
            n*=i;
        }
        return n;
    }

}
