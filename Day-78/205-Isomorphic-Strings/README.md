<div align="center">

**# 205. Isomorphic Strings**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

Given two strings `s` and `t`, determine if they are isomorphic.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters.

No two characters may map to the same character, but a character may map to itself.

---

**## My Approach**

**### Idea**

- First, check whether the lengths of `s` and `t` are equal. If not, return `false`.
- Use two arrays to keep track of the mappings between characters in `s` and `t`.
- Traverse both strings simultaneously.
- For each character:
  - Check whether the previous mapping of the character from `s` matches the previous mapping of the corresponding character from `t`.
  - If the mappings are inconsistent, return `false`.
  - Otherwise, update the mapping for both characters.
- If all characters maintain a consistent mapping, return `true`.

---

**## Complexity Analysis**

```text
Time Complexity : O(n)