import java.util.Arrays;

public class reverse_words_in_a_string {
    public String reverseWords(String s) {
        if(s.length() <= 1){
            return s;
        }
        String[] words = s.split("\\W+");
        System.out.println(Arrays.toString(words));
        String ans = "";
        for(int i = words.length - 1; i >= 0; i--){
            
            if(i == 0){
                ans += words[i];
            }else{
                ans += words[i] + " ";
            }
        }

        return (ans.charAt(ans.length() - 1) == ' ') ? ans.substring(0, ans.length() - 1) : ans;
    }
}
