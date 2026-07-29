<div align="center">

# 832. Flipping an Image

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Two%20Pointers-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an `n × n` binary matrix, flip the image horizontally and then invert every bit.

- Flipping horizontally reverses every row.
- Inverting changes every `0` to `1` and every `1` to `0`.

Return the transformed image.

---

## My Approach

### Idea

- Process each row independently.
- Use two pointers from both ends of the row.
- While swapping mirrored elements, invert them at the same time.
- If both mirrored values are equal, simply flip them using XOR with `1`.
- This performs both operations in a single traversal without using extra space.

---

## Complexity Analysis

```text
Time Complexity : O(n²)

Space Complexity: O(1)
```

---

## Concepts Learned

- Two Pointers
- Matrix Traversal
- Bit Manipulation (XOR)
- In-place Array Operations

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 45.56 MB

Beats : 87.41%
```

---

## Notes

Instead of first reversing each row and then traversing it again to invert every element, both operations can be merged into a single pass. This reduces unnecessary work while keeping the solution in-place and easy to implement.