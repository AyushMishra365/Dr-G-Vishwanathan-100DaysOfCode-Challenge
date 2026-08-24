<div align="center">

**# 657. Robot Return to Origin**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

There is a robot starting at the position `(0, 0)`, the origin, on a 2D plane.

Given a string `moves` representing the sequence of the robot's moves, determine whether the robot ends up at `(0, 0)` after completing all of its moves.

The valid moves are:

- `R` → Right
- `L` → Left
- `U` → Up
- `D` → Down

Return `true` if the robot returns to the origin after completing all of its moves. Otherwise, return `false`.

---

**## My Approach**

**### Idea**

- Convert the `moves` string into a character array.
- Use four counters to keep track of the number of `U`, `D`, `L`, and `R` movements.
- Traverse the entire character array.
- Increment the corresponding counter for each movement.
- At the end:
  - `U` movements must equal `D` movements.
  - `L` movements must equal `R` movements.
- If both conditions are satisfied, the robot returns to the origin.

---

**## Complexity Analysis**

```text
Time Complexity : O(n)
Space Complexity : O(1)