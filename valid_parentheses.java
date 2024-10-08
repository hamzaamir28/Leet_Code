import java.util.Stack;

public class valid_parentheses {
    public boolean isValid(String s) {
         if(s.length() <= 0 || (s.length() % 2 != 0)) {
			 return false;
		 }
		 Stack<Character> stack = new Stack();
		 for(int i = 0; i < s.length(); i++) {
			 if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				 stack.push(s.charAt(i));
			 }else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
				 stack.pop();
			 }else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
				 stack.pop();
			 }else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
				 stack.pop();
			 }else return false;
		 }	 
		return stack.isEmpty();    
    }
}
