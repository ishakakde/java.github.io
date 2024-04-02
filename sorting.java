import java.util.Arrays;
import java.util.Comparator;

public class SortHalfArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2, 7, 1, 6};
        sortHalfArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortHalfArray(int[] array) {
        int length = array.length;
        int halfLength = length / 2;

        // Sort first half in ascending order
        Arrays.sort(array, 0, halfLength);

        // Sort second half in descending order
        Arrays.sort(array, halfLength, length / 2 + length % 2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }
}
