<div align="center">

# 1260. Shift 2D Grid

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Arrays%20%26%20Matrix-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a 2D grid of size `m × n` and an integer `k`, shift the grid `k` times according to the specified rules and return the resulting grid.

---

## My Approach

### Idea

- Consider the 2D grid as a flattened 1D array.
- Compute each element's original index and its shifted index.
- Convert the shifted index back into row and column coordinates.
- Store the shifted values in a new matrix.
- Convert the matrix into a `List<List<Integer>>` before returning.

---

## Complexity Analysis

```text
Time Complexity : O(m × n)

Space Complexity: O(m × n)
```

---

## Concepts Learned

- Matrix Traversal
- Index Mapping
- Modulo Arithmetic
- Arrays

---

## Performance

```text
Verdict : Accepted

Runtime : 5 ms

Beats : 83.45%

Memory : 47.27 MB

Beats : 44.14%
```

---

## Notes

Instead of performing one shift at a time, each element's final position can be computed directly using its flattened index and modulo arithmetic, making the solution efficient and clean.