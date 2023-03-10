package recursionLevel1Questions;

public class Nto1{


    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        fun(n - 1);
    }

    static void funcReverse(int n){
        if(n == 0){
            return;
        }

        funcReverse(n - 1);
        System.out.println(n);
        
    }

    static void funcBoth(int n){
        if(n == 0){
            return;
        }

        System.out.println(n); // will print n when making the function calls
        funcBoth(n - 1);
        System.out.println(n);  // will print n when removing from stack
    }
}