public Map<String, Integer> wordLen(String[] strings) {
	Map<String, Integer> output = new HashMap<String, Integer>();
	int length = strings.length - 1;
  
	while (length >= 0) {
		output.put(strings[length], strings[length].length());
		length--;
	}
	return output;
}
