<div align="center">

# 136. Single Number

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-BitManipulation-red)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a non-empty array of integers, every element appears twice except for one.

Find and return that single element.

---

## Example 1

### Input

```text
nums = [2,2,1]
```

### Output

```text
1
```

---

## Example 2

### Input

```text
nums = [4,1,2,1,2]
```

### Output

```text
4
```

---

## My Approach

Used XOR on all elements.

```text
x ^ x = 0
x ^ 0 = x
```

All duplicate elements cancel each other out, leaving only the unique element.

---

## Complexity Analysis

```text
Time Complexity : O(n)
Space Complexity: O(1)
```

---

## Concepts Learned

- XOR
- Bit Manipulation
- Pattern Recognition

---

## Problem Link

https://leetcode.com/problems/single-number/
