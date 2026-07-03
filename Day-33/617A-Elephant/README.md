<div align="center">

# A. Elephant

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

An elephant can move 1 to 5 units in a single step.

Find the minimum number of steps required to reach position `x`.

---

## My Approach

### Idea

Always take the largest possible step of 5 units.

After exhausting all full 5-step moves, one additional move is needed if any distance remains.

### Steps

1. Repeatedly subtract 5 while possible.
2. Count each move.
3. If some distance is left, add one final move.

---

## Complexity Analysis

```text
Time Complexity : O(x/5)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Algorithm
- Simulation

---

## Performance

```text
Verdict : Accepted

Runtime : 234 ms

Memory : 2008 KB
```

---

## Notes

The solution is based on a simple greedy observation that choosing the maximum possible move always minimizes the total number of steps.