class Solution {
    public void moveZeroes(int[] nums) {

        int pos = 0; // position for next non-zero

        // move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos++] = nums[i];
            }
        }

        // fill remaining positions with zeros
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }
}
