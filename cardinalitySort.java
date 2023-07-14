// cardinalitySort
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static List<Integer> cardinalitySort(List<Integer> nums) {
        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                int binaryCardinality1 = Integer.bitCount(num1);
                int binaryCardinality2 = Integer.bitCount(num2);

                if (binaryCardinality1 != binaryCardinality2) {
                    return Integer.compare(binaryCardinality1, binaryCardinality2);
                } else {
                    return Integer.compare(num1, num2);
                }
            }
        });
        return nums;
    }

    public static void main(String[] args) {
        // Example 1
        List<Integer> nums1 = new ArrayList<>(List.of(31, 15, 7, 3, 2));
        System.out.println(cardinalitySort(nums1));  // Output: [2, 3, 7, 15, 31]

        // Example 2
        List<Integer> nums2 = new ArrayList<>(List.of(3));
        System.out.println(cardinalitySort(nums2));  // Output: [3]

        // Example 3
        List<Integer> nums3 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(cardinalitySort(nums3));  // Output: [1, 2, 4, 3, 5]
    }
}
