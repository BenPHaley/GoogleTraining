public Map<String, Integer> wordCount(String[] strings) {
	Map<String, Integer> output = new HashMap<String, Integer>();
	int length = strings.length - 1;
  
	while (length >= 0) {
		output.put(strings[length], 
			(output.containsKey(strings[length]) ? 
				output.get(strings[length])+1 : 1)); 
		length--;
	}
	return output;
}

