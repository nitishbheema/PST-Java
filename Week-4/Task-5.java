import java.util.*;

class Result {

    public static String timeConversion(String s) {

        String period = s.substring(8);      // AM or PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);     // :mm:ss

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else { // PM
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d%s", hour, rest);
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = Result.timeConversion(s);
        System.out.println(result);
    }
}
