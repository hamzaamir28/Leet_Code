public class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1; //pointer 0
        int p1 = m-1; //pointer 1 - for nums 1
        int p2 = n-1; //pointer 2 - for nums2

        //decrement p with larget val b/w nums1 and nums2
        while(p >= 0){

            if(p1 < 0){
                //p1 reached -1 - would add element from nums2
                nums1[p] = nums2[p2--];
            }else if (p2 < 0){
                //vice versa
                nums1[p] = nums1[p1--];
            }else{
                //else we'll check which num is greater and assign it to nums1[p]
                if(nums1[p1] > nums2[p2]){
                    nums1[p] = nums1[p1--];
                }else{
                    nums1[p] = nums2[p2--];
                }
            }
            p--;
        }
    }
}
