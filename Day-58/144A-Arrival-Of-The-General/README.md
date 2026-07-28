<div align="center">

# 144A. Arrival of the General

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Implementation-orange)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given the heights of soldiers standing in a line, determine the minimum number of adjacent swaps required to bring the tallest soldier to the beginning of the line and the shortest soldier to the end.

If there are multiple tallest soldiers, choose the leftmost one. If there are multiple shortest soldiers, choose the rightmost one.

---

## My Approach

### Idea

- Traverse the array once to record:
  - The **leftmost occurrence** of the maximum height.
  - The **rightmost occurrence** of the minimum height.
- The tallest soldier requires `maxIndex` swaps to reach the front.
- The shortest soldier requires `(n - 1 - minIndex)` swaps to reach the end.
- If the tallest soldier originally appears after the chosen shortest soldier, moving the tallest first shifts the shortest one left by one position, so subtract one from the total swaps.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Array Traversal
- Index Manipulation
- Greedy Observation
- Implementation

---

## Performance

```text
Verdict : Accepted

Time   : 624 ms

Memory : 2596 KB
```

---

## Notes

The key observation is that actually performing swaps is unnecessary. Simply tracking the indices of the leftmost tallest soldier and the rightmost shortest soldier is enough to compute the minimum number of swaps mathematically.