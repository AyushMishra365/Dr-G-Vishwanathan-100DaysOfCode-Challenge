<div align="center">

# 734A. Anton and Danik

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-success)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Anton and Danik play **n** chess games. Each game is won by either Anton (`'A'`) or Danik (`'D'`).

Given the sequence of winners, determine:

- `"Anton"` if Anton wins more games,
- `"Danik"` if Danik wins more games,
- `"Friendship"` if both win the same number of games.

---

## My Approach

### Idea

- Traverse the string once.
- Count the number of `'A'` characters and `'D'` characters.
- Compare the two counts:
  - If Anton's count is greater, print `"Anton"`.
  - If Danik's count is greater, print `"Danik"`.
  - Otherwise, print `"Friendship"`.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- String Traversal
- Frequency Counting
- Conditional Logic

---

## Performance

```text
Time   : 281 ms

Memory : 1876 KB
```

---

## Notes

The solution only requires a single pass through the input string. By maintaining separate counters for Anton's and Danik's victories, the winner can be determined efficiently after the traversal is complete.