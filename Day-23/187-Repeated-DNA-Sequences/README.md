<div align="center">

# 187. Repeated DNA Sequences

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-warning)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a DNA string consisting of characters `A`, `C`, `G`, and `T`, return all 10-letter-long sequences that occur more than once.

---

## My Approach

### Key Observation

Every valid DNA sequence has length 10.

Steps:

1. Generate every possible substring of length 10.
2. Store them in an array.
3. Sort the array.
4. Traverse the sorted array and compare adjacent elements.
5. If two adjacent sequences are equal, add them to the answer while avoiding duplicates.

This approach leverages sorting to group identical DNA sequences together.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(n)
```

---

## Concepts Learned

- String Manipulation
- Substrings
- Sorting
- Duplicate Detection

---

## Performance

```text
Runtime : 63 ms
Beats   : 5.68%

Memory  : 52.28 MB
Beats   : 96.20%
```

---

## Problem Link

https://leetcode.com/problems/repeated-dna-sequences/
