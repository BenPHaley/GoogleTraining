public int maxSpan(int[] nums) {
	int tmp = 0;
	int max = 0;
	int length = nums.length;
  
	for (int i = 0; i < length; i++) {
		for (int j = i; j < length; j++) {
			if (nums[i] == nums[j]) {
				tmp = j - i + 1;
				if (tmp > max) {
					max = tmp;
				}
			}
		}
		if (max > length-1) {
			break;
		}
	}
  	return max;
}

