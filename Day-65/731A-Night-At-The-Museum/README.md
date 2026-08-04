<div align="center">

# 731A. Night at the Museum

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-success)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Starting from the letter **'a'**, rotate a circular alphabet wheel to print a given string.

For every character, choose the minimum number of clockwise or anticlockwise rotations needed to reach the target letter.

Return the minimum total rotations.

---

## My Approach

### Idea

- Keep track of the current pointer position.
- For each character:
  - Compute clockwise distance.
  - Compute anticlockwise distance.
  - Add the smaller distance to the answer.
- Update the current position to the printed character.
- Repeat until the entire string is processed.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Simulation
- Circular Traversal
- Greedy Choice
- Character Manipulation

---

## Performance

```text
Time   : 234 ms

Memory : 868 KB
```

---

## Notes

The key observation is that the alphabet forms a circle, so for every movement there are always two possible directions. Choosing the minimum of the clockwise and anticlockwise distances at each step guarantees the optimal total number of rotations.