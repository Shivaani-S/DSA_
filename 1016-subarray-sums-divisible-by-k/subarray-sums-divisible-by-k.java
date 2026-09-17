class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;

        int sum = 0;
        int ans = 0;

        for (int num : nums) {
            sum = (sum + num) % k;

            if (sum < 0) {
                sum += k;
            }

            ans += count[sum];
            count[sum]++;
        }

        return ans;
    }
}