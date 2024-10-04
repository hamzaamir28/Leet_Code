public class candy {
    public int candy(int[] ratings) {
        if(ratings.length == 1){
            return 1;
        }

        int[] candies = new int[ratings.length];
        
        for(int i = 0; i < candies.length; i++){
            candies[i] = 1;
        }
        
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i - 1] < ratings[i]){
                candies[i] = candies[i-1] + 1;
            }
        }

        for(int i = ratings.length-1; i > 0; i--){
            if(ratings[i] > ratings[i-1]){
                if(candies[i] <= candies[i-1]){
                    candies[i] = candies[i-1] + 1;
                }
            }else if(ratings[i] < ratings[i-1]){
                if(candies[i] >= candies[i-1]){
                    candies[i-1] = candies[i] + 1;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < candies.length; i++){
            sum += candies[i];
        }

        return sum;
    }
}
