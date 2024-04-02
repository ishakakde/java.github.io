public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        rotateLeft(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] array) {
        if (array.length <= 1) {
            return; // No need to rotate if the array has 0 or 1 element
        }

        int firstElement = array[0];

        
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = firstElement;
    }
}
