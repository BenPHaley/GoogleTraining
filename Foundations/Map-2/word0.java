public Map<String, Integer> word0(String[] strings) {
	Map<String, Integer> output = new HashMap<String, Integer>();
	int length = strings.length - 1;
	while (length >= 0) {
		output.put(strings[length], 0);
		length--;
	}
	return output;
}

