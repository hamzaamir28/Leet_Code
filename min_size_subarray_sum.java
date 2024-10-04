public class min_size_subarray_sum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+= nums[i];
            if(nums[i] >= target){
                return 1;
            }
        }
        if(sum == target){
            return nums.length;
        }else if(sum < target){
            return 0;
        }
        if((nums[nums.length-1] + nums[nums.length-2]) >= target){
            return 2;
        }

        int point_one = 0;
        int point_two = 0;
        int min_length = nums.length + 1;
        int temp_sum = 0;

        while(temp_sum < target){
            temp_sum+= nums[point_two];
            if(temp_sum >= target){
                break;
            }
            point_two++;
        }
        min_length = point_two - point_one+1;

        while(point_one < nums.length-1){
            temp_sum -= nums[point_one];
            point_one++;
            if(point_two < nums.length - 1){
                point_two++;
                temp_sum += nums[point_two];
            }
            if(temp_sum-nums[point_one] >= target){
                temp_sum-=nums[point_one];
                point_one++;
                min_length = Math.min((point_two-point_one + 1), min_length);
            }
            if(temp_sum-nums[point_two] >= target){
                temp_sum-=nums[point_two];
                point_two--;
                min_length = Math.min((point_two-point_one + 1), min_length);
            }
        }
        return min_length;
    }
}
