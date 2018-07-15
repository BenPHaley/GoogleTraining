## Question

Given a string ```S``` and a set of words ```D```, find the longest word ```D``` that
is a subsequence of ```S```.

Word ```W``` is a subsequence of ```S``` if some number of characters, possibly zero, can
be deleted from ```S``` to form ```W```, without reordering the remaining characters.

Note: ```D``` can appear in any format (list, hash table, prefix tree, etc.)

For example, given the input ```S = "abppplee"``` and ```D = {"able", "ale", "apple",
"bale", "kangaroo"}``` the correct output would be ```"apple"```

* The words "able and "ale" are both subsequences of S, byt they are shorter than apple.
* The word "bale" is not a subsequence of S because even though S has all the right letters,
they are not in the right order.
* The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.

##Learning Objectices

This question give you the chance to practice with algotithms and data structures. It's also
a good example of why careful Big-O performance is often worthwhile, as is careful 
exploration of common and worst-case inputs.


## My Solution

#### Solution 1
Begin a loop of all the words in ```D````: 

Compare the first letter of the first word in ```D``` to the first letter of
```S```. 

If they are **not** equal move to the next letter in ```S```.
If they are equal move to the next letter of the current word in ```D``` and the next letter 
in ```S```.<sup>1</sup>

Loop through this if statement until either string reaches its end. 

If ```S``` reaches the end first the current word in ```D``` is **not** a subsequence 
of ```S```. If the current word in ```D``` reaches its end first then it is a subsequence 
of ```S```. In this case the length of the current word in ```D``` needs to be compared 
in length to the current largest subsequence of ```S```.

Once the loop goes through all the strings in ```D``` the current largest subsequence of 
```S``` becomes the largest subsequece of ```S``` in ```D```. 



#### Initial Analysis


#### Brute Force algorithm
