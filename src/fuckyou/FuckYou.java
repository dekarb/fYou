/*
 * Erik Neville
 * North Seattle College 
 */


package fuckyou;
import java.util.Scanner;

/**
 *
 * @author Erik Neville <erikeneville@gmail.com>
 */
public class FuckYou {
    
    static boolean isPerfSquare(int n) {
        int s = (int)Math.sqrt(n);
        return (s * s == n);
    }
    
    static boolean isFib(int n) {
        return isPerfSquare(5 * n * n + 4) ||
                isPerfSquare(5 * n * n - 4);
    }
    
    static boolean divisSeven(int n) {
        return n % 7 == 0;
    }
    
    static boolean divEleven(int x) {
        return x % 11 == 0;
    }
    
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
        
    
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a max number to play to: ");
        int n = in.nextInt();
        System.out.println();
        
        for (int i = 1; i <= n; i++) {
            if (isFib(i) == true || divisSeven(i) == true || divEleven(i) == true
                    || String.valueOf(i).contains("7") || isPrime(i) == true) {
                System.out.println("Fuck You "  + "   (" + i + ")");
            } else {
                System.out.println(i);
            }
        } 
    }   
}
