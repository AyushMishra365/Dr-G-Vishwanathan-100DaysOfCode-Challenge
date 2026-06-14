# Day 02

## Platform

- LeetCode

## Problems Solved

- [217. Contains Duplicate](./217-Contains-Duplicate)
- [56. Merge Intervals](./56-Merge-Intervals)

## Key Concepts

- Sorting
- Arrays
- Intervals
- Pattern Recognition

## Takeaways

- Learned how organizing data through sorting can significantly simplify a problem.
- Understood that constraints play a major role in deciding whether an approach is practical.
- Observed how overlapping intervals naturally become easier to process once they are sorted.
- Reinforced the idea that understanding the reasoning behind an approach is more valuable than memorizing patterns.

---

### Problems Overview

#### 217. Contains Duplicate

A problem that requires determining whether any value appears more than once in an array.

**My Approach**
- Sorted the array.
- Traversed it once and compared adjacent elements.
- Returned true as soon as a duplicate was found.

**Complexity**
- Time Complexity: O(n log n)
- Space Complexity: O(1)

---

#### 56. Merge Intervals

A classic interval problem involving combining overlapping ranges into a set of non-overlapping intervals.

**My Approach**
- Sorted the intervals based on their starting values.
- Compared each interval with the current interval.
- Merged overlapping intervals by updating the ending value.
- Stored completed intervals in the result list.

**Complexity**
- Time Complexity: O(n²)
- Space Complexity: O(n)

---

Day 2 ✅
