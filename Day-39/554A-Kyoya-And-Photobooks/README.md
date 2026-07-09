<div align="center">

# 554A. Kyoya and Photobooks

![Platform](https://img.shields.io/badge/Platform-Codeforces-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-800-blue)
![Topic](https://img.shields.io/badge/Topic-Strings-green)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a string, determine how many distinct strings can be formed by inserting exactly one lowercase English letter at any position.

---

## My Approach

### Idea

Instead of generating every possible string, observe that:

- There are `length + 1` possible insertion positions.
- Each position allows 26 letters.
- Inserting the same character beside itself creates duplicate strings.

Using this observation, the answer becomes:

```
26 × (length + 1) − length
```

### Steps

1. Read the input string.
2. Compute its length.
3. Apply the formula.
4. Print the result.

---

## Complexity Analysis

```text
Time Complexity : O(1)

Space Complexity: O(1)
```

---

## Concepts Learned

- Strings
- Mathematical Observation
- Counting

---

## Performance

```text
Verdict : Accepted

Runtime : 250 ms

Memory : 1616 KB
```

---

## Notes

This problem is a great example of replacing brute-force generation with a simple counting observation. Recognizing the duplicate insertions leads directly to the optimal constant-time solution.