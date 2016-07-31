/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    if(nums ===null || nums.length ===0 )
        return 0;
    var dp=[];
    var len=nums.length;
    var max=0;
    for(var i=0;i<len;i++){
        dp[i]=1;
        for(var j=0;j<i;j++){
            if(nums[j]<nums[i]){
                dp[i]= Math.max(dp[i],dp[j]+1);
            }
        }
        max=Math.max(max,dp[i])
    }
    return max;
};