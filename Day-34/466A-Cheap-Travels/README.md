<div align="center">

# A. Cheap Travel

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-1000-yellow)
![Topic](https://img.shields.io/badge/Topic-Math%20%26%20Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Ann needs to complete `n` subway rides. A single ride ticket costs `a`, while a special ticket covering `m` rides costs `b`.

Determine the minimum amount of money required.

---

## My Approach

### Idea

Instead of simulating ticket purchases, evaluate every possible purchasing strategy and choose the minimum cost.

### Steps

1. Calculate the cost of buying only single tickets.
2. Calculate the cost of using as many special tickets as possible and buying the remaining rides individually.
3. Calculate the cost of buying only special tickets, even if some rides remain unused.
4. Return the minimum among all three costs.

---

## Complexity Analysis

```text
Time Complexity : O(1)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Thinking
- Mathematical Optimization
- Cost Analysis

---

## Performance

```text
Verdict : Accepted

Runtime : 234 ms

Memory : 816 KB
```

---

## Notes

The key observation is that only three purchasing strategies need to be compared. Evaluating these directly gives the optimal answer without any iteration or simulation.