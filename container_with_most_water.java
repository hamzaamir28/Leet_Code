public class container_with_most_water {
    public int maxArea(int[] height) {
        int max_area = 0;
        int point_one = 0;
        int point_two = height.length-1;

        while(point_one < point_two){
            int area = Math.min(height[point_one], height[point_two]) * (point_two-point_one);
            max_area = Math.max(max_area, area);
            
            if(height[point_one] < height[point_two]){
                point_one++;
            }else{
                point_two--;
            }
        }
        return max_area;
    }
}
