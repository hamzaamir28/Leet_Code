public class palindrome_number {
    public boolean isPalindrome(int x) {
        boolean check = false;
       String s = String.valueOf(x);
       
       if(s.charAt(0) == '-') {
           return false;
       }
       if(s.length() == 1) {
           return  true;
       }
       
       int med = (s.length()/2);
       String reverse = "";
       
       //121
       //check if first and last element is same
       for(int i = s.length()-1; i >= 0; i--){
           reverse = reverse + s.charAt(i);
       }
       
       if(s.equals(reverse)) {
           check = true;
       }else {
           check = false;
       }
      return check;
  }
}
