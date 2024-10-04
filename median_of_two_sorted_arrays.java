import java.util.Arrays;

public class median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] new_arr = new int[nums1.length+nums2.length];

        int a1 = nums1.length;
        int b1 = nums2.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        System.arraycopy(nums1, 0, c, 0, a1);
        System.arraycopy(nums2, 0, c, a1, b1);
        
        Arrays.sort(c);
        double median;
        if (c.length % 2 == 0)
            median = ((double)c[c.length/2] + (double)c[c.length/2 - 1])/2;
        else
            median = (double) c[c.length/2];

        
        return median;
    }
}
