public class zigzag_conversion {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int[] idx = new int[s.length()];
        int point = 0;
        boolean up = false;
        for(int i = 0; i < s.length(); i++){
            idx[i] = point;
            if(!up){
                point++;
            }else{
                point--;
            }
            if(point == 0){
                up = false;
            }else if(point == numRows - 1){
                up = true;
            }
        }
        
        String ans = "";
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < s.length(); j++){
                if(idx[j] == i){
                    ans += s.charAt(j);
                }
            }
        }
        return ans;
    }
}
