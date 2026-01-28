import java.util.Scanner;

public class Solution {

    public static String addNumbersUsingStrings(String input1, String input2) {

        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int a = (i >= 0) ? input1.charAt(i--) - '0' : 0;
            int b = (j >= 0) ? input2.charAt(j--) - '0' : 0;

            int sum = a + b + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.next();
        String input2 = sc.next();

        System.out.println(addNumbersUsingStrings(input1, input2));

        sc.close();
    }
}
