<div align="center">

# 283. Move Zeroes

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Two%20Pointers-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer array `nums`, move all `0`s to the end while maintaining the relative order of the non-zero elements. The operation must be performed in-place.

---

## My Approach

### Idea

Maintain two pointers:

- `left` points to the position where the next non-zero element should be placed.
- `right` scans the array.

Whenever a non-zero element is found, swap it with the element at `left` and increment `left`.

### Steps

1. Initialize `left = 0`.
2. Traverse the array using `right`.
3. If `nums[right]` is non-zero:
   - Swap `nums[left]` and `nums[right]`.
   - Increment `left`.
4. Continue until the end of the array.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Two Pointers
- In-place Array Manipulation
- Swapping

---

## Performance

```text
Verdict : Accepted

Runtime : 2 ms

Beats : 92.20%

Memory : 47.87 MB

Beats : 38.15%
```

---

## Notes

The two-pointer approach preserves the order of non-zero elements while completing the operation in a single traversal with constant extra space.