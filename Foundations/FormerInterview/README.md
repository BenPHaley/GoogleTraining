## Question

Given a string ```S``` and a set of words ```D```, find the longest word 
```D``` that is a subsequence of ```S```.

Word ```W``` is a subsequence of ```S``` if some number of characters, 
possibly zero, can be deleted from ```S``` to form ```W```, without 
reordering the remaining characters.

Note: ```D``` can appear in any format (list, hash table, prefix tree, etc.)

For example, given the input ```S = "abppplee"``` and ```D = {"able", "ale", 
"apple", "bale", "kangaroo"}``` the correct output would be ```"apple"```

* The words "able and "ale" are both subsequences of S, byt they are shorter 
than apple.
* The word "bale" is not a subsequence of S because even though S has all the 
right letters,
they are not in the right order.
* The word "kangaroo" is the longest word in D, but it isn't a subsequence of 
S.

## Learning Objectices

This question give you the chance to practice with algotithms and data 
structures. It's also a good example of why careful Big-O performance is 
often worthwhile, as is careful exploration of common and worst-case inputs.



## My Solutions

#### Solution 1
Begin a loop of all the words in ```D```: 

Compare the first letter of the first word in ```D``` to the first letter of
```S```. 

If they are **not** equal move to the next letter in ```S```.
If they are equal move to the next letter of the current word in ```D``` and 
the next letter in ```S```.<sup>1</sup>

Loop through the above if-else until either string reaches its end. 

If ```S``` reaches the end first the current word in ```D``` is **not** a 
subsequence of ```S```. If the current word in ```D``` reaches its end first 
then it is a subsequence of ```S```. In this case the length of the current 
word in ```D``` needs to be compared in length to the current largest 
subsequence of ```S```.

Once the loop goes through all the strings in ```D``` the current largest 
subsequence of ```S``` becomes the largest subsequece of ```S``` in ```D```. 


**Worst-Case analysis:**

Worst case the string ```S``` will be traversed ```length(D)``` times. 
Let ```n = length(D)``` and ```m = length(S)```. Thus far the running time 
is *n\*m*.
There is another comparison per outer loop iteration to determine which 
string ended first. This adds m to our running time which results in 
*(n+1)\*m*.


<sup>1</sup> In both cases of the if statement, we move to the next letter in 
```S```. So rather than having an if-else we can just have an if that is 
entered if the characters are the same. That would move to the next letter in 
the current string in ```D```. Then outside the if we would move to the next 
letter in ```S```. The number of comparisons is the same; however, there will 
be less code. 


#### Solution 2
Just a slight addition to solution 1. 
After discovering the first string in ```D``` that is a subsequence of 
```S```, compare its length with future strings in ```D``` and only process
the string if it is longer than the current largest subsequence. 

This will not change the Big-O class of *Solution 1* but will improve the 
average case running time. 

