<div align="center">

# 89. Gray Code

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Bit_Manipulation-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer `n`, generate a valid n-bit Gray Code sequence.

A Gray Code sequence has the property that adjacent numbers differ by exactly one bit.

---

## My Approach

### Key Observation

There is a direct formula to generate Gray Code:

```text
Gray(i) = i ^ (i >> 1)
```

For every integer `i` from:

```text
0 to (2^n - 1)
```

the above expression generates the corresponding Gray Code value.

### Steps

1. Iterate from `0` to `(1 << n) - 1`.
2. Compute:

```java
i ^ (i >> 1)
```

3. Store the value in the answer list.
4. Return the generated sequence.

---

## Complexity Analysis

```text
Time Complexity : O(2^n)

Space Complexity: O(2^n)
```

---

## Concepts Learned

- Gray Code
- Bit Manipulation
- Right Shift Operator
- Binary Number Systems

---

## Performance

```text
Verdict : Accepted

Runtime : 5 ms

Beats : 61.42%

Memory : 53.69 MB
```

---

## Notes

The Gray Code formula is a classic bit manipulation trick worth remembering:

```text
Gray(i) = i ^ (i >> 1)
```

It generates a valid Gray Code sequence without recursion, backtracking, or simulation, making the implementation both elegant and efficient.