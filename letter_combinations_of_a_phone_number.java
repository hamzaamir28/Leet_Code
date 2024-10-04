import java.util.LinkedList;
import java.util.List;

public class letter_combinations_of_a_phone_number {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> arr = new LinkedList<>();
        
        if(digits.length() == 0){
            return arr;
        }
        arr.add("");
        String[] map = new String[]{
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz",
        };

        for(int i = 0; i < digits.length(); i++){
            int idx = digits.charAt(i) - '0';
            while(arr.peek().length() == i){
                String perm = arr.pop();
                for(char c : map[idx].toCharArray()){
                    arr.add(perm + c);
                }
            }
        }
        return arr;
    }
}
