public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length <= 0) {
              System.out.println("Bad input");
          }
          
          int[] ans = new int[2];
          
          //Problem: find two integers that add up to target
          //iterate through nums
          for(int i = 0; i < nums.length; i++) {
              
             //make integer variable sum that will have sum of two integers
              int sum = 0;
              //find two int that sum up to make target
              //iterate through nums again to find other number
              for(int j = i+1; j < nums.length; j++) {
                  sum = nums[i] + nums[j];
                  //if sum == target
                  if(sum == target) {
                     //then record index of two ints into ans
                      ans[0] = i;
                      ans[1] = j;
                  }
              }
              
          }
         return ans;      
     }
}
