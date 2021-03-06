## Map-2


#### word0.java

Given an array of strings, return a Map<String, Integer> containing a key for 
every different string in the array, always with the value 0. For example the 
string "hello" makes the pair "hello":0. We'll do more complicated counting 
later, but for this problem the value is simply 0.


	word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
	word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
	word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}


#### strLen.java

Given an array of strings, return a Map<String, Integer> containing a key 
for every different string in the array, and the value is that string's length.

	wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
	wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, 
"this": 4}
	wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}


#### pairs.java

Given an array of non-empty strings, create and return a Map<String, String> 
as follows: for each string add its first character as a key with its last 
character as the value.

	pairs(["code", "bug"]) → {"b": "g", "c": "e"}
	pairs(["man", "moon", "main"]) → {"m": "n"}
	pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": 
"t"}


#### wordCount.java

The classic word-count algorithm: given an array of strings, return a 
Map<String, Integer> with a key for each different string, with the value 
the number of times that string appears in the array.

	wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
	wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
	wordCount(["c", "c", "c", "c"]) → {"c": 4}


#### Java Map API

// Make a new empty map
Map<String, String> map = new HashMap<String, String>();

map.get(key) -- retrieves the stored value for a key, or null if that key 
is not present in the map.

map.put(key, value) -- stores a new key/value pair in the map. Overwrites 
any existing value for that key.

map.containsKey(key) -- returns true if the key is in the map, false 
otherwise.

map.remove(key) -- removes the key/value pair for this key if present. 
Does nothing if the key is not present. 
