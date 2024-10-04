public class valid_palindrome {
    public boolean isPalindrome(String s) {
        
        String check = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(s.charAt(i))){
                check+= String.valueOf(Character.toLowerCase(s.charAt(i)));
            }else if (Character.isDigit(s.charAt(i))){
                check+= String.valueOf(s.charAt(i));
            }
        }
   
        if(check.length() <= 1){
            return true; 
        }
        for(int i = 0; i < check.length(); i++){
            if(check.charAt(i) != check.charAt(check.length() - 1- i)){
                return false;
            }
        }
        return true;
    }
}
