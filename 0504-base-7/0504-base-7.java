class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0"; // Special case for zero
        }

        int count = 0;
        if (num < 0) {
            count = 1;
        }

        num = Math.abs(num);  // Work with the absolute value of num
        String s = "";

        while (num > 0) {
            s = (num % 7) + s;  // Add the remainder at the front of the string
            num = num / 7;       // Divide num by 7 to move to the next digit
        }

        if (count == 1) {
            return "-" + s;  // Add negative sign if the number was negative
        } else {
            return s;
        }
    }
}
