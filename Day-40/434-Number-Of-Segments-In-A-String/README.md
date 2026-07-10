<div align="center">

# 434. Number of Segments in a String

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a string `s`, return the number of segments (words) present in the string.

A segment is a contiguous sequence of non-space characters.

---

## My Approach

### Idea

A new word always begins when:

- the current character is **not** a space, and
- either it is the first character of the string or the previous character is a space.

Instead of splitting the string, simply count every such starting position.

### Steps

1. Initialize `count = 0`.
2. Traverse the string.
3. If the current character is not a space and:
   - it is the first character, or
   - the previous character is a space,
   increment `count`.
4. Return `count`.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- String Traversal
- Pattern Recognition
- Conditional Counting

---

## Notes

This approach avoids using `split()`, `trim()`, or extra memory. It works correctly even when there are multiple consecutive spaces, leading spaces, or trailing spaces because it only counts the **starting character of each word**.