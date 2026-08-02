<div align="center">

# 877. Stone Game

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Alice and Bob play a game by taking turns picking a pile of stones from either end of the array.

Both players play optimally. Determine whether Alice wins.

---

## My Approach

### Idea

- Use Dynamic Programming with memoization.
- Define a recursive function that returns the maximum score difference the current player can obtain over the opponent for a given interval.
- At each step:
  - Pick the left pile.
  - Pick the right pile.
- Since the opponent also plays optimally, subtract the opponent's optimal result from the chosen pile.
- Store results for every `(left, right)` interval to avoid recomputation.
- If the final score difference is non-negative, Alice wins.

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
- Interval DP
- Minimax Strategy
- Game Theory

---

## Performance

```text
Runtime : 11 ms

Memory  : 49.91 MB
```

---

## Notes

This solution is almost identical to **LeetCode 486 (Predict the Winner)**. Both problems can be solved by computing the maximum score difference achievable by the current player instead of tracking each player's score separately. Memoization ensures that each interval is solved only once.