<div align="center">

# 1288. Remove Covered Intervals

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Intervals-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an array of intervals, remove every interval that is completely covered by another interval and return the number of remaining intervals.

---

## My Approach

### Idea

First sort the intervals by their starting point in ascending order. If two intervals have the same starting point, place the one with the larger ending point first. Then scan the intervals while keeping track of the maximum endpoint encountered. Whenever an interval extends beyond the current maximum endpoint, it is not covered and is counted.

### Steps

1. Sort intervals by:
   - Increasing start.
   - Decreasing end when starts are equal.
2. Initialize the current maximum endpoint.
3. Traverse all intervals.
4. If the current interval extends beyond the maximum endpoint:
   - Count it.
   - Update the maximum endpoint.
5. Return the total count.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(1)
```

*(Ignoring the space used by the sorting algorithm.)*

---

## Concepts Learned

- Interval Sorting
- Custom Comparator
- Greedy Traversal
- Sweep Line Technique

---

## Performance

```text
Verdict : Accepted

Runtime : 6 ms

Beats : 93.21%

Memory : 46.34 MB

Beats : 82.87%
```

---

## Notes

The custom sorting order is the key observation. Sorting by increasing start and decreasing end ensures that any covered interval appears after the interval covering it, allowing a single linear traversal to identify the remaining intervals.