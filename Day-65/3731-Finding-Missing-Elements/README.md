<div align="center">

# 3731. Find Missing Elements

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

You are given an array of unique integers that originally contained every integer within a continuous range. Some values are missing.

Return all missing integers in sorted order.

---

## My Approach

### Idea

- Sort the array.
- Start from the smallest element.
- Traverse through the sorted array while maintaining the expected number.
- If the expected number matches the current array element, move to the next element.
- Otherwise, add the expected number to the answer and continue checking until all missing numbers are found.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(1)
```

*(Ignoring the output list.)*

---

## Concepts Learned

- Array Traversal
- Sorting
- Missing Number Detection

---

## Performance

```text
Runtime : 7 ms (Beats 22.50%)

Memory  : 47.24 MB (Beats 18.67%)
```

---

## Notes

Sorting simplifies the problem by allowing sequential comparison between the expected value and the current element. Every mismatch directly represents a missing integer in the original range.