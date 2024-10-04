public class search_insert_position {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        if(target < nums[0]){
            return 0;
        }
        int ans = -1;
        int temp = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target){
                temp = i+1;
            }else if(target == nums[i]){
                ans = i;
            }
        }

        return (ans == -1) ? temp : ans;
    }
}
