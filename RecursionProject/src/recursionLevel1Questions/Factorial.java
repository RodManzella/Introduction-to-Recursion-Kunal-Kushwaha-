package recursionLevel1Questions;

public class Factorial {
    
    public static void main(String[] args) {
        
    }

    static int fact (int n){
        if(n <= 1){
            return 1;
        }

        return n * fact (n - 1);
    }
}
