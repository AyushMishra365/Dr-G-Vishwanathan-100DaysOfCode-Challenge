<div align="center">

# 1846. Maximum Element After Decreasing and Rearranging

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an array of positive integers, perform rearrangement and decrement operations so that:

- The first element is 1.
- The absolute difference between adjacent elements is at most 1.

Return the maximum possible value of the largest element after applying these operations.

---

## My Approach

### Idea

Sort the array first.

Set the first element to `1`, then greedily process the remaining elements. If the current value is greater than the previous value plus one, reduce it to `previous + 1`. Otherwise, leave it unchanged.

The final element after this process is the maximum possible answer.

### Steps

1. Sort the array.
2. Set the first element to `1`.
3. Traverse the array:
   - If `arr[i] > arr[i-1] + 1`, replace it with `arr[i-1] + 1`.
4. Return the last element.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Algorithms
- Sorting
- Array Manipulation

---

## Performance

```text
Verdict : Accepted

Runtime : 8 ms

Beats : 82.92%

Memory : 77.41 MB

Beats : 61.67%
```

---

## Notes

Sorting guarantees that elements are processed in increasing order, allowing each value to be greedily adjusted while preserving the maximum possible final element.