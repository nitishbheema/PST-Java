import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			String s = sc.next();
			int n = s.length();

			int mid = n / 2;

			String left = s.substring(0, mid);
			String right;

			if (n % 2 == 0) {
				right = s.substring(mid);
			} else {
				right = s.substring(mid + 1);
			}

			int[] freq1 = new int[26];
			int[] freq2 = new int[26];

			for (char c : left.toCharArray()) {
				freq1[c - 'a']++;
			}

			for (char c : right.toCharArray()) {
				freq2[c - 'a']++;
			}

			boolean isLapindrome = true;
			for (int i = 0; i < 26; i++) {
				if (freq1[i] != freq2[i]) {
					isLapindrome = false;
					break;
				}
			}

			System.out.println(isLapindrome ? "YES" : "NO");
		}
	}
}
