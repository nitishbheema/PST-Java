class Solution {
    public boolean halvesAreAlike(String s) {

        int count = 0;
        String vowels = "aeiouAEIOU";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                if (i < n / 2) count++;
                else count--;
            }
        }

        return count == 0;
    }
}
