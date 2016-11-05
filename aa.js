/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    var map={};
    if(nums.length ===1) {return nums[0]} 
    for(var i=0;i<nums.length;i++){
        if(!map[nums[i]]){
            map[nums[i]] = 1;
        }
        else{
            map[nums[i]]++;
            if(map[nums[i]] >= nums.length/2){
                return nums[i];
            }
        }
    }
    
    
    
};