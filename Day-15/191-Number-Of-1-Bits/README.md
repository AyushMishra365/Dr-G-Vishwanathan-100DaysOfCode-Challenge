<div align="center">

# 191. Number of 1 Bits

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-BitManipulation-red)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Write a function that returns the number of set bits (1s) in the binary representation of a number.

---

## Example 1

### Input

```text
n = 11
```

### Output

```text
3
```

### Explanation

```text
1011
```

contains three set bits.

---

## My Approach

Used Brian Kernighan's Algorithm.

Repeatedly applied:

```text
n & (n - 1)
```

which removes the rightmost set bit in each iteration.

---

## Complexity Analysis

```text
Time Complexity : O(k)
Space Complexity: O(1)
```

where k is the number of set bits.

---

## Concepts Learned

- Bit Manipulation
- Brian Kernighan's Algorithm
- Binary Representation

---

## Problem Link

https://leetcode.com/problems/number-of-1-bits/
