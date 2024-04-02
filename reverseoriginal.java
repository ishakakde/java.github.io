public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2, 7, 1, 6};
        reverseArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
           
            start++;
            end--;
        }
    }
}
