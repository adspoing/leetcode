public class Solution {
    public boolean isSubsequence(String s, String t) {
        int lastIndex = -1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            lastIndex = t.indexOf(c, lastIndex+1);
            if(lastIndex == -1) {
                return false;
            }
        }
        return true;
    }
}