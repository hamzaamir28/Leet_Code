public class longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1){
            return (s.length() == 0) ? 0 : 1;
        }
        String temp = "";
        int max_length = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(!temp.contains(String.valueOf(s.charAt(j)))){
                    temp+= String.valueOf(s.charAt(j));
                }else{
                    max_length = Math.max(max_length, temp.length());
                    temp = "";
                    break;
                }
            }
        }
        

        return max_length;
    }
}
