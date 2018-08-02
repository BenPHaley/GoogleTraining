public Map<String, String> pairs(String[] strings) {
	Map<String, String> output = new HashMap<String, String>();
	int length = strings.length;
	int index = 0;
	int strLength;
	String charFirst;
	String charEnd;
  
	while (index < length) {
		strLength = strings[index].length();
		charFirst = strings[index].substring(0,1);
		charEnd = strings[index].substring(strLength - 1, strLength);
		output.put(charFirst, charEnd);
		index++;
	}
	return output;
}
