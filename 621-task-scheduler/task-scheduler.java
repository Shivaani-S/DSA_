class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for (char c : tasks) {
            count[c - 'A']++;
        }

        Arrays.sort(count);

        int max = count[25];
        int slots = (max - 1) * n;

        for (int i = 24; i >= 0; i--) {
            slots -= Math.min(max - 1, count[i]);
        }

        return slots > 0 ? tasks.length + slots : tasks.length;
    }
}