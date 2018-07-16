public int sumNumbers(String str) {
	int tmp = 0;
	int result = 0;
	int strLength = str.length();
 
	for (int i = 0; i < strLength; i++) {
		if (Character.isDigit(str.charAt(i))) {
			tmp = Integer.parseInt(str.substring(i,i+1));
			i++;
			while (i < strLength && 
					Character.isDigit(str.charAt(i))) {
				tmp = tmp * 10 + 
					Integer.parseInt(str.substring(i,i+1));
				i++;
			}
			result += tmp;
			tmp = 0;
		}
	}
	return result;
}

