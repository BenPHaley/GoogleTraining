public String stringSplosion(String str) {
	String text = "";
  
	for (int i = 0; i <= str.length(); i++) {
		text = text.concat(str.substring(0,i));
	}
	return text;
}

