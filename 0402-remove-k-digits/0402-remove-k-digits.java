class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        int n = num.length();

        for (int i = 0; i < n; i++) {
            char currentChar = num.charAt(i);

            while (!stack.isEmpty() && k > 0 && stack.peek() > currentChar) {
                stack.pop();
                k--;
            }

            // Avoid leading zeros
            if (!stack.isEmpty() || currentChar != '0') {
                stack.push(currentChar);
            }
        }

        // If we still need to remove more digits, remove from the end of the stack
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the resulting number from the stack
        StringBuilder result = new StringBuilder();
        for (char digit : stack) {
            result.append(digit);
        }

        // If the result is empty, return "0"
        return result.length() == 0 ? "0" : result.toString();
    }
}
