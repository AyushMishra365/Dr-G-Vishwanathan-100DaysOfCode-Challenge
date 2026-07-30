<div align="center">

# 3014. Minimum Number of Pushes to Type Word I

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a string consisting of distinct lowercase English letters, remap the telephone keypad to minimize the total number of key presses required to type the word.

Return the minimum number of pushes needed.

---

## My Approach

### Idea

- A keypad has **8 available keys (2–9)**.
- Assign the most frequently used positions first. Since every character appears exactly once, simply assign:
  - First 8 letters → 1 push
  - Next 8 letters → 2 pushes
  - Remaining letters → 3 or more pushes if needed.
- Traverse the string and add `(index / 8) + 1` for each character.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Algorithm
- Observation-based Optimization
- Simple Mathematical Formula

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 42.88 MB

Beats : 95.69%
```

---

## Notes

The key observation is that every character is unique, so only its position in the optimal assignment matters. A simple formula computes the answer without explicitly constructing the keypad mapping.