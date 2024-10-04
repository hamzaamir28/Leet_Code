import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    List<Integer> il=new ArrayList<Integer>();
                    il.add(nums[i]);
                    il.add(nums[j]);
                    il.add(nums[k]);
                    l.add(il);
                    j++;
                    k--;
                    while(j<k&& nums[j]==nums[j-1]) j++;
                    while(j<k&& nums[k]==nums[k+1]) k--;

                }
            }
        }
        return l;
    }
}
