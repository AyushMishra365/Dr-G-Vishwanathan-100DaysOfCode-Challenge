<div align="center">

# 1189. Maximum Number of Balloons

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a string `text`, determine the maximum number of times the word `"balloon"` can be formed using the characters of the string.

Each character can only be used once.

---

## My Approach

### Key Observation

The word `"balloon"` requires:

- b → 1
- a → 1
- l → 2
- o → 2
- n → 1

I counted the occurrences of these characters and determined how many complete copies of `"balloon"` could be formed by finding the minimum available frequency after accounting for repeated letters.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Frequency Counting
- Character Processing
- String Traversal

---

## Performance

```text
Runtime : 3 ms
Beats   : 70.35%

Memory  : 43.30 MB
Beats   : 79.23%
```

---

## Problem Link

https://leetcode.com/problems/maximum-number-of-balloons/
