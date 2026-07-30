<div align="center">

# B. Petya and Countryside

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-1000-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given the heights of sections in a garden, choose one section to create artificial rain. Water can spread to neighboring sections as long as their heights do not increase in the direction of flow.

Find the maximum number of sections that can be watered.

---

## My Approach

### Idea

- Treat every section as the starting point.
- Expand to the left while heights are non-increasing.
- Expand to the right while heights are non-increasing.
- Count the total reachable sections and keep track of the maximum.

---

## Complexity Analysis

```text
Time Complexity : O(n²)

Space Complexity: O(1)
```

---

## Concepts Learned

- Brute Force
- Array Traversal
- Simulation
- Greedy Expansion

---

## Performance

```text
Verdict : Accepted
```

---

## Notes

Since `n ≤ 1000`, checking every position as the starting point is efficient enough. For each index, simulate water flowing in both directions and record the maximum reachable length.