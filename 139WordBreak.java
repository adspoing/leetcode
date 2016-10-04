public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 0; i <s.length();i++){
            String sub = s.substring(0,i+1);
            if(wordDict.contains(sub)){
                dp[i+1] = true; //if dictionary has substring, it is a valid partition. 
            }else{
                for(int j = sub.length()-1;j>=0;j--){ // if dictionary hasn't substring, we need to figure out whether there exists further partition in substring. We use another pointer j to iterate.
                    if(wordDict.contains(sub.substring(j+1))){  
                        if(dp[j+1]){ // if substring has a correct partition, check whether the string front of partition point is in the dictionary.
                            dp[i+1] = true; // a valid internal partition means both two substrings are in the dictionary.
                            break;
                        }
                    }
                }
            }
        }
        return dp[s.length()];
    }
}