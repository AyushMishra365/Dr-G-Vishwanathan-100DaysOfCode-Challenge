# Day 36

## Platform

- LeetCode

## Problems Solved

- [1288. Remove Covered Intervals](./1288-Remove-Covered-Intervals)

## Key Concepts

- Sorting
- Custom Comparator
- Greedy
- Interval Processing

## Takeaways

- Sorting intervals in the correct order can greatly simplify interval-related problems.
- Custom comparators are useful for handling tie cases elegantly.
- Greedy traversal after sorting often eliminates the need for complex interval comparisons.
- Tracking only the farthest endpoint is enough to identify covered intervals.

---

### Problem Overview

#### 1288. Remove Covered Intervals

Sorted the intervals by starting point in ascending order and ending point in descending order. Then traversed the sorted list while maintaining the maximum ending point seen so far. Any interval whose end did not extend beyond the current maximum was covered by a previous interval and was ignored.

---

## Concepts Practiced

- Sorting
- Custom Comparator
- Greedy Algorithms
- Interval Problems

---

### Why Today Was Important

Today's problem reinforced a common interview pattern: transforming an interval problem into a simple linear scan through careful sorting. It was another reminder that choosing the right ordering often makes the greedy solution almost obvious.

---

Day 36 ✅

Continuing to strengthen interval-based problem solving and greedy thinking.