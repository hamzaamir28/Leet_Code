public class find_the_index_of_the_first_occurrence_in_a_string {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0) {
			  return 0;
		  }
		  if(needle.length() == 0) {
			  return 0;
		  }
		  int index = 0;
		  if(haystack.contains(needle)) {
			  index = haystack.indexOf(needle);
		  }else return -1;
		return index;
    }
}
