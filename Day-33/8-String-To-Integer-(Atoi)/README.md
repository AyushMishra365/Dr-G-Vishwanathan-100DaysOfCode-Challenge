<div align="center">

# 8. String to Integer (atoi)

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-String-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Implement the `atoi` function that converts a string into a 32-bit signed integer while handling whitespace, optional sign, invalid characters, and overflow.

---

## My Approach

### Idea

Process the string character by character while following the problem's rules.

Handle leading spaces, determine the sign, build the number digit by digit, and check for overflow before every multiplication.

### Steps

1. Skip leading whitespaces.
2. Detect the optional sign.
3. Read consecutive digits.
4. Check for overflow before updating the result.
5. Return the signed integer.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- String Parsing
- Overflow Handling
- Character Processing

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 100.00%

Memory : 43.19 MB

Beats : 99.33%
```

---

## Notes

This is an implementation-focused problem where carefully handling every edge case is more important than using complex algorithms.