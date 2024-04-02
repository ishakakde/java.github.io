public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Let's say 5 is missing
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1; // Since one number is missing, add 1 to the array length
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers

        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
