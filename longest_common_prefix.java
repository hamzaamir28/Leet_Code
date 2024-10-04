public class longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length <= 0) {
            return "";
        }
        //["flower","flow","flight"]
        //Problem: Find longest prefix
        //set a string to first word of array
        String lcp = strs[0];
        //reduce size of first letter which does not match longest prefix
            //iterate through strs
        for(int i = 1; i < strs.length; i++) {
            //compare new work i.e: index 1 forward with lcp
            while(strs[i].indexOf(lcp) != 0) {
                //while we can not find prefix at beggining of new word
                lcp = lcp.substring(0, lcp.length() - 1);
            }
        }
        //return the longest prefix
       return lcp;
       
   }
}
