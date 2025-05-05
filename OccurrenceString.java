public class OccurrenceString {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;

    }
    public static void main(String[] args) {
        OccurrenceString occurrenceString = new OccurrenceString();
        String haystack = "butsad";
        String needle = "sad";
        int output = occurrenceString.strStr(haystack,needle);
        System.out.println("Output: "+ output);
    }
}
