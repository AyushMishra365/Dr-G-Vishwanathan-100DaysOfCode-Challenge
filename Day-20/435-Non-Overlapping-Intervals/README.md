<div align="center">

# 435. Non-overlapping Intervals

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Greedy-purple)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a collection of intervals, determine the minimum number of intervals that must be removed so that the remaining intervals do not overlap.

---

## My Approach

### Key Observation

To keep as many intervals as possible:

- Sort intervals according to their ending times.
- Always keep the interval that finishes earliest.
- Whenever an overlap occurs, count it as a removal.

This greedy strategy guarantees the minimum number of removals.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Algorithms
- Interval Scheduling
- Sorting

---

## Problem Link

https://leetcode.com/problems/non-overlapping-intervals/
