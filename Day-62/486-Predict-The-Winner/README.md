<div align="center">

# 486. Predict the Winner

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Two players take turns choosing a number from either the beginning or the end of an array. Both players play optimally.

Determine whether Player 1 can win (or tie) the game.

---

## My Approach

### Idea

- Define a recursive function that returns the maximum score difference the current player can achieve over the opponent for a given subarray.
- At every step, the player has two choices:
  - Pick the leftmost element.
  - Pick the rightmost element.
- Since the opponent also plays optimally, subtract the opponent's best possible score difference from the chosen value.
- Store results for each `(left, right)` pair using memoization to avoid recomputation.
- If the final score difference is non-negative, Player 1 can win or tie.

---

## Complexity Analysis

```text
Time Complexity : O(n²)

Space Complexity: O(n²)
```

---

## Concepts Learned

- Dynamic Programming
- Memoization
- Recursion
- Minimax Strategy
- Interval DP

---

## Performance

```text
Runtime : 0 ms (Beats 100.00%)

Memory  : 43.09 MB (Beats 10.58%)
```

---

## Notes

Instead of computing the absolute scores of both players, the solution tracks the **maximum score difference** the current player can secure. This simplifies the implementation and naturally models optimal play from both players.