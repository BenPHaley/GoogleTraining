public boolean canBalance(int[] nums) {
	int numLength = nums.length;
	int frontSum = 0, backSum = 0;
	int frontIndex = 0, backIndex = numLength-1;
  
	while (frontIndex != backIndex) {
		if (frontSum >= backSum) {
			backSum += nums[backIndex--];
		}
		else {
			frontSum += nums[frontIndex++];
		}
	}

	if (frontSum >= backSum) {
		backSum += nums[backIndex--];
	}
	else {
		frontSum += nums[frontIndex++];
	}

	return frontSum == backSum;
}

