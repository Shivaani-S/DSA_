class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                nums.push(num);
                st.push(curr);
                curr = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                int k = nums.pop();
                StringBuilder prev = st.pop();

                for (int i = 0; i < k; i++) {
                    prev.append(curr);
                }

                curr = prev;
            } else {
                curr.append(c);
            }
        }

        return curr.toString();
    }
}