class Solution {
    public int minSwaps(int[] nums) {
        int ones = 0;

        for (int num : nums) {
            ones += num;
        }

        if (ones <= 1 || ones == nums.length) {
            return 0;
        }

        int count = 0;
        int max = 0;
        int n = nums.length;

        for (int i = 0; i < n + ones - 1; i++) {
            count += nums[i % n];

            if (i >= ones) {
                count -= nums[(i - ones) % n];
            }

            max = Math.max(max, count);
        }

        return ones - max;
    }
}