/*
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    var sum=0;
    for(var i=0;i<nums.length;i++){
        sum ^= nums[i];
    }
    return sum;
};