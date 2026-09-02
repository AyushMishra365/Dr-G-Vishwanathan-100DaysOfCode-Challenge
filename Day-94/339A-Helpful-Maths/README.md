# <div align="center">339A. Helpful Maths</div>

<div align="center">

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)
![Status](https://img.shields.io/badge/Status-Accepted-success)

</div>

## 🔗 Problem Link

[Codeforces 339A – Helpful Maths](https://codeforces.com/problemset/problem/339/A)

## 📝 Problem Statement

You are given a mathematical expression containing only the numbers `1`, `2`, `3` and the `+` sign.

Rearrange the numbers so that they appear in **non-decreasing order**, allowing the expression to be easily calculated.

For example:

```text
Input:  3+2+1
Output: 1+2+3
```

## 💡 My Approach
### Idea
Read the input string.
Remove all + signs from the string.
Convert the remaining characters into a character array.
Sort the character array using Arrays.sort().
Print the sorted digits with + signs between them.

### Example
## Input:
3+2+1

After removing '+':
321

After sorting:
123

## Output:
1+2+3

### ⏱️ Complexity Analysis

## Time Complexity: O(n log n)
## Space Complexity: O(n)

where n is the length of the input string.

#### 📚 Concepts Learned
String manipulation
Character arrays
Sorting
Arrays.sort()
Constructing formatted output


### ⚡ Performance
Language: Java 21
Verdict: Accepted
Submission: Accepted

### 📌 Notes

This problem is a simple application of string manipulation + sorting.
The key observation is that the + signs do not affect the ordering of the numbers, so they can be removed first and added back while printing.