public String[] encoder(String[] raw, String[] code_words) {
	// Will store key, value pairs to remember if a string has already been 
	// assigned to a string in the code_words array
	Map<String, String> matching = new HashMap<String, String>();
	int length = raw.length;
	String output[] = new String[length];
	int index = 0;
	int code_words_index = 0;
  
	while (index < length) {
		if (matching.containsKey(raw[index])) {
			output[index] = matching.get(raw[index]);
		}
		else {
			// Add the strings pair to the hashmap
			matching.put(raw[index], code_words[code_words_index]);
			// Adds the string to the array and increments the 
			// code_words_index
			output[index] = code_words[code_words_index++];
		}
		index++;
	}

	return output;
}

