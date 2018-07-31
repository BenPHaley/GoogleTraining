int[] sort(int[] a) {
	ArrayList<Integer> output = new ArrayList<Integer>();
	int i = 0;
	int aLength = a.length;
	while (i < aLength-1) {
		if (a[i] != a[i+1]) {
			output.add(a[i]);
		}
		i++;
	}
  
	if (i == aLength-1) {
		output.add(a[i]);
	}
  
	int length = output.size();
	int[] b = new int[length];
	for (int x = 0; x < length; x++) {
		b[x] = output.get(x);
	}
	return b;
}
