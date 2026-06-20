<div align="center">

# 78. Subsets

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Backtracking-purple)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an array of unique integers, generate all possible subsets (the power set).

The solution must not contain duplicate subsets and can be returned in any order.

---

## My Approach

### Key Observation

Every element has two choices:

- Include it in a subset.
- Exclude it from a subset.

Instead of using recursion, I used an iterative approach:

1. Start with the empty subset.
2. For every number in the array:
   - Copy all existing subsets.
   - Add the current number to each copied subset.
   - Append these new subsets to the result.

This gradually builds the complete power set.

---

## Complexity Analysis

```text
Time Complexity : O(n × 2ⁿ)

Space Complexity: O(2ⁿ)
```

---

## Concepts Learned

- Power Set Generation
- Iterative Subset Construction
- Arrays
- Combinatorics

---

## Performance

```text
Runtime : 1 ms
Beats   : 88.83%

Memory  : 44.30 MB
Beats   : 38.54%
```

---

## Problem Link

https://leetcode.com/problems/subsets/
