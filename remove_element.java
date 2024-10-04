public class remove_element {
    public int removeElement(int[] nums, int val) {
        
        int pr = 0; int pg = 0;
        while(pg != nums.length){
            
            if(nums[pg] != val){
                nums[pr] = nums[pg];
                pr++;
            }

            pg++;
        }
        return pr;
    }
}
