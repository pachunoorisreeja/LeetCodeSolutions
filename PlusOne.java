public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, set to 0 and continue to carry over
            digits[i] = 0;
        }

        // If we are here, it means all digits were 9. Need extra digit.
        // Example: 999 + 1 = 1000
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // rest are already 0
        return newNumber;

    }

    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{9,9,9}));
    }
}
