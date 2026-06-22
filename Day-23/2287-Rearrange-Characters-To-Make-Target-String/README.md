<div align="center">

# 2287. Rearrange Characters to Make Target String

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Frequency_Counting-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given two strings `s` and `target`, determine the maximum number of copies of `target` that can be formed using the characters of `s`.

Each character may only be used once.

---

## My Approach

### Key Observation

The answer depends on the frequency of each character.

Steps:

1. Count frequencies of all characters in `s`.
2. Count frequencies of all characters in `target`.
3. For every character required in `target`, calculate:

```text
available frequency / required frequency
```

4. The minimum of these values gives the maximum number of copies that can be formed.

---

## Complexity Analysis

```text
Time Complexity : O(n + m)

Space Complexity: O(1)
```

---

## Concepts Learned

- Frequency Arrays
- Greedy Counting
- String Processing

---

## Performance

```text
Runtime : 0 ms
Beats   : 100.00%

Memory  : 43.04 MB
```

---

## Problem Link

https://leetcode.com/problems/rearrange-characters-to-make-target-string/
