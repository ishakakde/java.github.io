public class RotateArrayByK {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;
        rotateArrayByK(array, k);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArrayByK(int[] array, int k) {
        int n = array.length;
        k = k % n; 
        
        reverseArray(array, 0, n - 1);

        
        reverseArray(array, 0, k - 1);

       
        reverseArray(array, k, n - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
