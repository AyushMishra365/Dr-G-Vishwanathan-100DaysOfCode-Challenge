# Day 53 - Dr. G. Viswanathan 100 Days of Code Challenge

## Problems Solved

### LeetCode
1. 57. Insert Interval (Medium)

---

## Problem 1: Insert Interval

**Approach:**
- Traversed the existing intervals one by one.
- Added intervals that came completely before the new interval.
- If an interval came completely after the new interval, inserted the new interval and continued with the remaining intervals.
- For overlapping intervals, merged them by updating the start and end points.
- Finally converted the list back into a 2D array.

**Time Complexity:** O(n)

**Space Complexity:** O(n)

**Performance**
- Runtime: **1 ms** (Beats **98.05%**)
- Memory: **46.88 MB** (Beats **89.13%**)

---

## Day 53 Takeaways

- Strengthened understanding of interval-based problems.
- Practiced handling the three interval cases: before, after, and overlapping.
- Reinforced how greedy merging simplifies interval manipulation.

---

## GitHub Progress

Added today's solution and updated the repository.

**Repository:**  
👉 https://github.com/AyushMishra365/Dr-G-Vishwanathan-100DaysOfCode-Challenge

---

Day 53 ✅

On to Day 54. 🚀