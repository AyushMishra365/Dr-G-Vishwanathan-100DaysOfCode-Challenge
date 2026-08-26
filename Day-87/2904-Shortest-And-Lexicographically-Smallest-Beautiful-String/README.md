<div align="center">

# 2904. Shortest and Lexicographically Smallest Beautiful String

**Platform:** LeetCode  
**Difficulty:** Medium  
**Status:** Accepted ✅

</div>

## 📝 Problem Statement

You are given a binary string `s` and a positive integer `k`.

A substring of `s` is called **beautiful** if it contains exactly `k` occurrences of `1`.

Let `len` be the length of the shortest beautiful substring.

The task is to return the **lexicographically smallest** beautiful substring having this minimum length.

If no beautiful substring exists, return an empty string.

## 💡 My Approach

### Idea

I used the **Sliding Window / Two Pointer** technique.

1. Maintain two pointers, `left` and `right`, representing the current window.
2. Keep track of the number of `1`s in the current window.
3. Expand the window by moving `right`.
4. Whenever the window contains exactly `k` ones:
   - Calculate its length.
   - Compare it with the best substring found so far.
   - Prefer the shorter substring.
   - If lengths are equal, choose the lexicographically smaller substring.
5. Shrink the window from the left while maintaining the required condition.
6. Return the best substring found.

This allows the string to be processed efficiently without checking every possible substring separately.

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n²)` in the worst case due to substring creation and lexicographical comparison.
- **Space Complexity:** `O(n)` for the substring operations.

## 📚 Concepts Learned

- Sliding Window
- Two Pointer Technique
- String Comparison
- Lexicographical Ordering
- Maintaining a count inside a moving window

## ⚡ Performance

- **Runtime:** 2 ms
- **Beats:** 40.94%
- **Memory:** 43.88 MB
- **Memory Beats:** 87.25%

## 📝 Notes

The key observation is that once a window contains exactly `k` ones, shrinking it from the left helps identify the shortest possible beautiful substring ending at the current position.

When multiple beautiful substrings have the same minimum length, lexicographical comparison is used to select the smallest one.