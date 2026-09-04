<div align="center">

# 3903. Smallest Stable Index I

### Platform: LeetCode
### Difficulty: Easy
### Status: Accepted

</div>

## 🔗 Problem Link

[LeetCode – Smallest Stable Index I](https://leetcode.com/problems/smallest-stable-index-i/)

## 📝 Problem Statement

Given an integer array `nums` and an integer `k`, the instability score of an index `i` is:

`max(nums[0..i]) - min(nums[i..n-1])`

An index is stable if its instability score is less than or equal to `k`.

Return the smallest stable index. If no stable index exists, return `-1`.

## 💡 My Approach

### Idea

I used a suffix minimum array to store the minimum value from every index to the end of the array.

Then, I traversed the array from left to right while maintaining the maximum value seen so far.

For every index `i`:

- Update the prefix maximum.
- Use `suffixMin[i]` to get the minimum value from `i` to the end.
- Check whether `max - suffixMin[i] <= k`.
- Return the first index satisfying the condition.

If no index is stable, return `-1`.

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## 📚 Concepts Learned

- Prefix Maximum
- Suffix Minimum
- Array Traversal
- Greedy Approach

## ⚡ Performance

- Runtime: **1 ms**
- Beats: **99.79%**
- Memory: **46.26 MB**
- Beats: **70.85%**

## 📝 Notes

The key observation is that the instability score requires information from both sides of the current index. Precomputing suffix minimums and maintaining the prefix maximum allows each index to be checked in constant time.