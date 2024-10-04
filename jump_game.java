public class jump_game {
    public boolean canJump(int[] nums) {    
        int final_pos = nums.length - 1;
        
        for(int idx = nums.length - 2; idx >= 0; idx--){
            if(idx + nums[idx] >= final_pos){
                final_pos = idx;
            }
        }
        
        return final_pos == 0;
    }
}
