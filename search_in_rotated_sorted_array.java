public class search_in_rotated_sorted_array {
    public int search(int[] nums, int target) {
        int ans = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans = i;
                break;
            }
        }

        return ans;
    }
}
