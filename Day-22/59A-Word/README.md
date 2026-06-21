<div align="center">

# 59A. Word

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-1000-success)
![Topic](https://img.shields.io/badge/Topic-Strings-orange)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a word consisting of uppercase and lowercase letters, convert the entire word to:

- Uppercase if it contains more uppercase letters.
- Lowercase otherwise.

If the number of uppercase and lowercase letters is equal, convert the word to lowercase.

---

## My Approach

### Key Observation

The decision depends only on the count of uppercase and lowercase letters.

Steps:

1. Traverse the string.
2. Count uppercase characters.
3. Count lowercase characters.
4. Compare the two counts.
5. Convert the entire string accordingly.

Java's built-in methods `toUpperCase()` and `toLowerCase()` make the conversion straightforward.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- String Traversal
- Character Processing
- Case Conversion
- Implementation

---

## Performance

```text
Runtime : 500 ms
Memory  : 2120 KB
```

---

## Problem Link

https://codeforces.com/problemset/problem/59/A
