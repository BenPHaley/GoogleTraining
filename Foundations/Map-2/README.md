## Map-2

Given an array of strings, return a Map<String, Integer> containing a key for 
every different string in the array, always with the value 0. For example the 
string "hello" makes the pair "hello":0. We'll do more complicated counting 
later, but for this problem the value is simply 0.


	word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
	word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
	word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}

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
