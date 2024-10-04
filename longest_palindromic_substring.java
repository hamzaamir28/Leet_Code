public class longest_palindromic_substring {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String palin = "";
        if(isPalindrome(s)){
            return s;
        }

        int start = 0;
        int end = s.length()-1;
        while(start < s.length()-1){
            char a = s.charAt(start);
            char b = s.charAt(end);

            if(a == b){
                String temp = s.substring(start, end + 1);
                if(isPalindrome(temp)){
                    if(temp.length() > maxLength){
                        palin = temp;
                        maxLength = temp.length();
                    }
                    start++;
                    end = s.length();
                }
            }
            
            end--;
            if(start == end){
                start++;
                end=s.length()-1;
            }
        }
        if(palin == ""){
            return String.valueOf(s.charAt(0));
        }
        return palin;
    }

    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
