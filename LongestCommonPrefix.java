public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if( length == 1){
            return strs[length-1];
        }
        String str = strs[0];
        for (int i = 1;i<length;i++){
            while(!strs[i].startsWith(str)){
                str = str.substring(0,str.length()-1);
                if(str.isEmpty()){ return "";}
            }
        }
        return str;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"",""};

        String output = longestCommonPrefix.longestCommonPrefix(strs);

        System.out.println("Output: "+ output);
    }
}
