/*
 * Erik Neville
 * North Seattle College 
 */


package fuckyou;

/**
 *
 * @author Erik Neville <erikeneville@gmail.com>
 */
public class FuckYou {
    
    static boolean isPerfSquare(int x) {
        int s = (int)Math.sqrt(x);
        return (s * s == x);
    }
    
    static boolean isFib(int n) {
        return isPerfSquare(5 * n * n + 4) ||
                isPerfSquare(5 * n * n - 4);
    }
    
    static boolean divisSeven(int x) {
        return x % 7 == 0;
    }
    
    static boolean divEleven(int x) {
        return x % 11 == 0;
    }
    
    static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int n = 10000;
        
        for (int i = 1; i <= n; i++) {
            if (isFib(i) == true || divisSeven(i) == true || divEleven(i) == true
                    || String.valueOf(i).contains("7") || isPrime(i) == true) {
                System.out.println("Fuck You "  + "(" + i + ")");
            } else {
                System.out.println(i);
            }
        } 
    }   
}
