<div align="center">

# 3499. Maximize Active Section with Trade I

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Strings%20%26%20Simulation-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a binary string, perform at most one valid trade to maximize the number of active (`1`) sections.

---

## My Approach

### Idea

- Count the initial number of active sections.
- Identify every valid block of `1`s surrounded by `0`s.
- Determine the adjacent inactive blocks that can be converted into active sections after removing the selected block.
- Compute the resulting active count and keep the maximum answer.

---

## Complexity Analysis

```text
Time Complexity : O(n²)

Space Complexity: O(1)
```

---

## Concepts Learned

- String Traversal
- Simulation
- Consecutive Block Processing
- Greedy Observation

---

## Performance

```text
Verdict : Accepted

Runtime : 131 ms

Beats : 36.62%

Memory : 47.82 MB

Beats : 83.10%
```

---

## Notes

The solution evaluates every removable block of active sections and calculates the gain achievable from activating the neighboring inactive blocks after one valid trade.