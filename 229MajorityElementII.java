public List<Integer> majorityElement(int[] nums) {
List<Integer> list = new ArrayList<Integer>();

	Arrays.sort(nums);
	for (int i = 0; i < nums.length ; i++) {
		int j = i + nums.length / 3;
		if (j < nums.length && nums[i] == nums[j]
				&& !list.contains(nums[i])) {
			list.add(nums[i]);
		}
	}
	return list;

}