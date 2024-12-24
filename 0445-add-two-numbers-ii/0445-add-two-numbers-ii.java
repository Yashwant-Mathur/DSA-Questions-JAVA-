class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Push all values of l1 into stack1
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        // Push all values of l2 into stack2
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        ListNode result = null; // Initialize the result list
        int carry = 0;

        // Process the stacks until both are empty and carry is zero
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int x = stack1.isEmpty() ? 0 : stack1.pop();
            int y = stack2.isEmpty() ? 0 : stack2.pop();

            int sum = x + y + carry;
            carry = sum / 10;

            // Create a new node with the digit value and add it to the front
            ListNode newNode = new ListNode(sum % 10);
            newNode.next = result;
            result = newNode;
        }

        return result;
    }
}
