import java.util.*;

public class LambdaOperations {

    static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    static PerformOperation isPalindrome() {
        return n -> {
            int temp = n, rev = 0;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            return rev == n;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int type = sc.nextInt();
            int num = sc.nextInt();
            boolean result;

            if (type == 1) {
                result = isOdd().check(num);
                System.out.println(result ? "ODD" : "EVEN");
            } 
            else if (type == 2) {
                result = isPrime().check(num);
                System.out.println(result ? "PRIME" : "COMPOSITE");
            } 
            else {
                result = isPalindrome().check(num);
                System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}
