<div align="center">

# 67. Add Binary

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Strings%20%26%20Simulation-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given two binary strings `a` and `b`, return their sum as a binary string.

The solution must perform binary addition directly without converting the strings into decimal integers.

---

## My Approach

### Idea

Since binary addition is performed from the least significant bit, start from the end of both strings.

Maintain a `carry` value:

- Add the current bits from both strings (if available).
- Add the carry.
- Append `sum % 2` to the answer.
- Update the carry as `sum / 2`.

After processing every digit, reverse the constructed string to obtain the final answer.

---

## Complexity Analysis

```text
Time Complexity : O(max(n, m))

Space Complexity: O(max(n, m))
```

where `n` and `m` are the lengths of the two binary strings.

---

## Concepts Learned

- String Manipulation
- Simulation
- Binary Arithmetic
- Carry Propagation

---

## Performance

```text
Verdict : Accepted

Runtime : 2 ms

Beats : 48.75%

Memory : 43.64 MB

Beats : 38.29%
```

---

## Notes

This solution closely follows the manual process of binary addition. Using a `StringBuilder` avoids repeated string concatenation, and reversing the result at the end produces the correct binary representation efficiently.