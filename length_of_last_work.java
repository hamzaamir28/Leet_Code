public class length_of_last_work {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String word = "";
        for(int i = str.length - 1; i>=0; i--){
            if(str[i] != " "){
                word = str[i];
                break;
            }
        }
        return word.length();
    }
}
