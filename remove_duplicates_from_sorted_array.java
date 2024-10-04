public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        
        int pg = 0; int pr = 0;
        int uniqueNum = nums[0];
        while(pg != nums.length){

            if(nums[pg] != uniqueNum){
                uniqueNum = nums[pg];
                nums[++pr] = nums[pg];
            }
            pg++;
        }
        return pr + 1;
    }
}
