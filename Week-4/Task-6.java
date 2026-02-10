public static void moveZeroes(int[] nums) {
    int i = 0;

    if (nums.length == 0 || nums.length == 1) {
        return;
    }

    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != 0) {
            nums[i] = nums[j];
            i++;
        }
    }

    for (int index = i; index < nums.length; index++) {
        nums[index] = 0;
    }
}
