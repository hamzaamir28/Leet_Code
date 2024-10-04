import java.util.Arrays;

public class remove_duplicates_from_sorted_aray_II {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 2){
            return 2;
        }
        int point_one = 0;
        int point_two = 1;
        int count = 1;
        try{
            while (count != 3){
                if(nums[point_one] == nums[point_two]){
                    count++;
                }else{
                    count = 1;
                }
                point_one++;
                point_two++;
            }
        }catch (Exception e){
            return nums.length ;
        }
        
        
        int temp = nums[point_one];
       try{
        while(nums[point_two] == nums[point_one]){
                point_two++;
            }
       }catch (Exception e){
            return point_one;
       }
        
        count = 1;
        temp = nums[point_one]; 
        while(point_two < nums.length){
            if(temp == nums[point_two]){
                count++;
                if(count < 3){
                    nums[point_one] = nums[point_two];
                    point_one++;
                    point_two++;
                }else{
                    point_two++;
                }
                
            }else{
                temp = nums[point_two];
                nums[point_one] = nums[point_two];
                count = 1;
                point_one++;
                point_two++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return point_one;
    }
}
