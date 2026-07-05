<div align="center">

# A. Stones on the Table

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a row of colored stones, determine the minimum number of stones that must be removed so that no two adjacent stones have the same color.

---

## My Approach

### Idea

Traverse the string once and compare each stone with the next one. Every pair of adjacent stones having the same color contributes one removal.

### Steps

1. Read the string of stone colors.
2. Traverse from left to right.
3. Compare each character with the next one.
4. Increment the answer whenever both colors are identical.
5. Output the total count.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Algorithm
- String Traversal
- Simulation

---

## Performance

```text
Verdict : Accepted

Runtime : 530 ms

Memory : 1704 KB
```

---

## Notes

A straightforward linear scan is sufficient because every adjacent equal pair independently requires one stone to be removed.