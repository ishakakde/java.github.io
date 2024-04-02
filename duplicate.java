import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 1};
        int[] result = removeDuplicates(array);
        System.out.println("Array after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        int[] result;
        int count = 0;

       
        for (int num : array) {
            uniqueElements.add(num);
        }

       
        result = new int[uniqueElements.size()];
        for (int num : array) {
            if (uniqueElements.contains(num)) {
                result[count++] = num;
                uniqueElements.remove(num);
            }
        }

         }
}
