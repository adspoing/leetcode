var missingNumber = function(nums) {
return nums.length * (nums.length + 1) / 2 - nums.reduce((rs, cv) => rs + cv, 0);
};