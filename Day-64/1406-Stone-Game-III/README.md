<div align="center">

# 1406. Stone Game III

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Alice and Bob play a game with stones arranged in a row. On each turn, a player may take the first **1, 2, or 3 stones** from the remaining row.

Each stone has an associated value, and both players play optimally.

Return:

- `"Alice"` if Alice wins,
- `"Bob"` if Bob wins,
- `"Tie"` if both players finish with the same score.

---

## My Approach

### Idea

- Use Dynamic Programming with memoization.
- Define a recursive function that returns the **maximum score difference** the current player can achieve starting from a given index.
- At each position:
  - Try taking 1 stone.
  - Try taking 2 stones.
  - Try taking 3 stones.
- For every choice:
  - Add the value of the stones taken.
  - Subtract the opponent's optimal score difference from the next state.
- Store the result for every starting index to avoid recomputation.
- The final score difference determines the winner.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(n)
```

---

## Concepts Learned

- Dynamic Programming
- Memoization
- Recursion
- Game Theory
- Score Difference DP

---

## Performance

```text
Runtime : 41 ms (Beats 34.94%)

Memory  : 94.50 MB (Beats 18.18%)
```

---

## Notes

This problem is a natural extension of previous Stone Game variants. Unlike earlier versions where only one stone or one pile is chosen each turn, this version introduces three possible moves, increasing the decision space. Using score-difference DP with memoization efficiently models optimal play while avoiding repeated computations.