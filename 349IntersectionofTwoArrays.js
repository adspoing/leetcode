/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    var map = {};
    for(var x in nums1){
        if(map[nums1[x]] === undefined)
        {
            map[nums1[x]] = 0;
        }
    }
    for(var y in nums2){
        if(map[nums2[y]] === 0){
            map[nums2[y]] = 1;
        }
    }
    var result = [];
    for(var key in map){
        if(map[key] ===1){
            result.push(parseInt(key));
        }
    }
    return result;
};