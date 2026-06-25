<div align="center">

# 119. Pascal's Triangle II

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Dynamic_Programming-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer `rowIndex`, return the `rowIndexᵗʰ` (0-indexed) row of Pascal's Triangle.

Each number in Pascal's Triangle is formed by adding the two numbers directly above it.

---

## My Approach

### Idea

Instead of generating the complete triangle, build one row at a time.

Each new row:
- Starts with `1`
- Ends with `1`
- Every middle element is the sum of the two adjacent elements from the previous row

Continue updating the current row until the required row index is reached.

### Steps

1. Initialize the first row as `[1]`.
2. Iterate from row `1` to `rowIndex`.
3. Create a new row.
4. Fill the middle values using the previous row.
5. Replace the current row with the new row.
6. Return the final row.

---

## Complexity Analysis

```text
Time Complexity : O(n²)

Space Complexity: O(n)
```

where `n = rowIndex`.

---

## Concepts Learned

- Dynamic Programming
- Pascal's Triangle
- Iterative Construction
- List Operations

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 70.95%

Memory : 42.51 MB
```

---

## Notes

This problem is a classic example of dynamic programming where each row depends only on the previous one. Since only the current row is required, storing the entire triangle is unnecessary, allowing the solution to use only linear extra space.