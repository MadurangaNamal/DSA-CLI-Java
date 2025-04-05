import java.util.*;
import java.util.stream.Stream;

public class LeetCode {

    public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge both arrays using two-pointer technique
        while (i < m && j < n) {
            result[k++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
        }

        // Copy remaining elements efficiently
        if (i < m) {
            System.arraycopy(nums1, i, result, k, m - i);
        }
        if (j < n) {
            System.arraycopy(nums2, j, result, k, n - j);
        }

        System.out.println(Arrays.toString(result));
    }

    public static String removeElement(int[] nums, int val) {

        int k = 0;
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                result.add(String.valueOf(nums[i]));
                k++;
            } else {
                result.add("_");
            }
        }

        return k + ", nums = " + result.toString();
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> result = new HashSet<Integer>();
        for (int number : nums)
            result.add(number);
        System.out.println(result.toString());
        return result.size();
    }

    public static int removeDuplicatesV2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Long> countMap = new HashMap<>();

        Arrays.stream(nums).forEach(n -> {
            countMap.put(n, countMap.getOrDefault(n, 0L) + 1);

            if (countMap.get(n) <= 2)
                result.add(n);
        });
        System.out.println(result.toString());

        return result.size();
    }

    public static int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int maxCount = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                majorityElement = entry.getKey();
            }
        }

        return (maxCount > nums.length / 2) ? majorityElement : -1;
    }

    public static void rotate(int[] nums, int k) {

        int[] rotatedArray = new int[nums.length];
        int position = k+1;
        System.out.println("Original: " + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            rotatedArray[i] = nums[((position + i) % nums.length)];
        }

        System.out.println("Rotated by "+ k +" elements: "+ Arrays.toString(rotatedArray));
    }

}
