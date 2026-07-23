<div align="center">

# 57. Insert Interval

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Intervals%20%26%20Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a list of non-overlapping intervals sorted by their starting points and a new interval, insert the new interval into the list while maintaining sorted order and merging any overlapping intervals.

---

## My Approach

### Idea

- Iterate through all existing intervals.
- If the current interval ends before the new interval starts, add it directly.
- If the current interval starts after the new interval ends, insert the new interval first and continue processing.
- Otherwise, merge the overlapping intervals by updating the new interval's boundaries.
- Add the final merged interval to the answer and convert the list into the required 2D array.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(n)
```

---

## Concepts Learned

- Interval Problems
- Greedy Algorithm
- ArrayList
- Interval Merging

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 98.05%

Memory : 46.88 MB

Beats : 89.13%
```

---

## Notes

The key observation is to classify every interval into one of three cases—before, after, or overlapping with the new interval. Handling these cases sequentially produces an efficient one-pass solution.