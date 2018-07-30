## Max-1

Modify and return the given map as follows: if the key "a" has a value, set 
the key "b" to have that same value. In all cases remove the key "c", leaving 
the rest of the map unchanged.


	mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
	mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
	mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

[Source Site](codingbat.com/prob/p148813)

#### Java Map API

// Make a new empty map
Map<String, String> map = new HashMap<String, String>();

`map.get(key)` -- retrieves the stored value for a key, or null if that key 
is not present in the map.

`map.put(key, value)` -- stores a new key/value pair in the map. Overwrites 
any existing value for that key.

`map.containsKey(key)` -- returns true if the key is in the map, false otherwise.

`map.remove(key)` -- removes the key/value pair for this key if present. 
Does nothing if the key is not present. 

