import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                result.add(String.valueOf(nums[i]));
                k++;
            } else
            {
                result.add("_");
            }
        }

        return k + ", nums = " + result.toString();
    }

    public static int removeDuplicates(int[] nums)
    {
        HashSet<Integer> result = new HashSet<Integer>();
        for (int number : nums)
            result.add(number);

        return result.size();
    }

    public static int removeDuplicatesV2(int[] nums)
    {
        int k = 0;
        

        return k;
    }
}
