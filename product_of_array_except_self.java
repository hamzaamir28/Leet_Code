public class product_of_array_except_self {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
         int[] answer = new int[n];
         
         answer[0] = 1;
         for (int i = 1; i < n; i++) {
             answer[i] = answer[i - 1] * nums[i - 1];
         }
         int suffixProduct = 1;
         for (int i = n - 1; i >= 0; i--) {
             answer[i] *= suffixProduct;
             suffixProduct *= nums[i];
             System.out.println(suffixProduct);
         }
         return answer;
     }
}
