<div align="center">

# 344A. Magnets

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-1000-success)
![Topic](https://img.shields.io/badge/Topic-Implementation-green)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a sequence of magnets represented by their pole orientations, determine how many groups of magnets are formed.

---

## My Approach

### Key Observation

A new group starts whenever two adjacent magnets have different orientations.

- Store all magnet orientations.
- Compare each magnet with the next one.
- Count every transition between different orientations.
- Start with one group initially.

The final count represents the total number of groups.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(n)
```

---

## Concepts Learned

- Implementation
- Arrays
- Simulation

---

## Problem Link

https://codeforces.com/problemset/problem/344/A
