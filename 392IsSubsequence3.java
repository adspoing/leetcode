
public class Solution {
    public boolean isSubsequence(String s, String t) {
	        
	        int j = 0;
	        int i = 0;
	        for(;i<s.length();i++)
	        {
	            
	            char c = s.charAt(i);
	       
	            if(t.indexOf(c,j) ==-1) return false;
	            else j = t.indexOf(c,j)+1;
	            
	        }
	        return i==s.length();
	    }
}