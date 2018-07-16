public String withoutString(String base, String remove) {
	String baseLower = base.toLowerCase();
	remove = remove.toLowerCase();
  
	char[] baseList = baseLower.toCharArray();
	char[] removeList = remove.toCharArray();
  
	StringBuilder result = new StringBuilder();
  
	int baseLength = baseList.length;
	int removeLength = removeList.length;
	int index = 0;
	int x = 1;
  
	boolean found = false;
  
	for (int i = 0; i < baseLength; i++) {
		if (baseList[i] == removeList[0]) {
			found = true;
			x = 1;
			while (x < removeLength) {
				if (baseLength == i+x || 
					removeList[x] != baseList[i+x]) {
					found = false;
				}
				x++;
			}
		}
 
		if (found) {
			i += (removeLength - 1);
			found = false;
		}
		else {
			result.append(base.charAt(i));
			found = false;
		}
	}
	return result.toString();
}
