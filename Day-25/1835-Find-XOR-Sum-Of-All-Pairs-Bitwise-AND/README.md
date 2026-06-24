<div align="center">

# 1835. Find XOR Sum of All Pairs Bitwise AND

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)
![Topic](https://img.shields.io/badge/Topic-Bit_Manipulation-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given two arrays, compute the XOR sum of every possible value formed by:

```text
arr1[i] & arr2[j]
```

for all valid pairs.

Return the XOR sum of the resulting values.

---

## My Approach

### Key Observation

Instead of generating every pair, we use the identity:

```text
(a1 ⊕ a2 ⊕ ... ⊕ an) & (b1 ⊕ b2 ⊕ ... ⊕ bm)
```

which is equivalent to the XOR sum of all pairwise AND operations.

### Steps

1. XOR all elements of `arr1`.
2. XOR all elements of `arr2`.
3. Perform bitwise AND of both XOR results.
4. Return the answer.

---

## Complexity Analysis

```text
Time Complexity : O(n + m)

Space Complexity: O(1)
```

---

## Concepts Learned

- XOR Properties
- Bit Manipulation
- Mathematical Reduction
- Binary Operations

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 100.00%

Memory : 87.45 MB
```

---

## Notes

This problem looks intimidating at first because it involves all possible pairs. The important insight is recognizing the XOR-AND distributive property, which reduces the solution to just a few operations.