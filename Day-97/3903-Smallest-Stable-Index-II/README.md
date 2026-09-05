<div align="center">

# 3904. Smallest Stable Index II

### Platform: LeetCode
### Difficulty: Medium
### Status: Accepted

</div>

## 🔗 Problem Link

[LeetCode – Smallest Stable Index II](https://leetcode.com/problems/smallest-stable-index-ii/)

## 📝 Problem Statement

Given an integer array `nums` and an integer `k`, the instability score of an index `i` is:

`max(nums[0..i]) - min(nums[i..n-1])`

An index is considered stable if its instability score is less than or equal to `k`.

Return the smallest stable index. If no such index exists, return `-1`.

## 💡 My Approach

### Idea

I first created a suffix minimum array where `suffixMin[i]` stores the minimum element from index `i` to the end of the array.

Then, I traversed the array from left to right while maintaining the maximum value encountered so far.

For every index:

1. Update the prefix maximum.
2. Get the suffix minimum from `suffixMin[i]`.
3. Calculate the instability score as `max - suffixMin[i]`.
4. If the score is at most `k`, return the current index.

If no index satisfies the condition, return `-1`.

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## 📚 Concepts Learned

- Prefix Maximum
- Suffix Minimum
- Array Traversal
- Greedy Approach
- Precomputation

## ⚡ Performance

- Runtime: **4 ms**
- Beats: **88.55%**
- Memory: **133.45 MB**
- Beats: **8.01%**

## 📝 Notes

This problem is a good application of prefix and suffix techniques. Instead of repeatedly calculating the maximum and minimum for every index, the required information is maintained efficiently, allowing each index to be checked in constant time.