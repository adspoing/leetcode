public int[] twoSum(int[] nums, int target) 
    {
        int i = 0, j = nums.length - 1;
        while(i < j)
        {
            if(nums[i] + nums[j] == target)
                break;
            else if (nums[i] + nums[j] < target)
                i++;
            else
                j--;
        }
        if(i >= j)
            return new int[]{-1, -1};
        return new int[]{i + 1, j + 1};
    }