public class UniqueNumbersInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9, 9};
        printUniqueNumbers(array);
    }

    public static void printUniqueNumbers(int[] array) {
        System.out.println("Unique numbers in the array:");

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            // Check if the current number is repeated
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

           
            if (isUnique) {
                System.out.println(array[i]);
            }
        }
    }
}
