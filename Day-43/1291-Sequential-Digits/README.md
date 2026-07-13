<div align="center">

# 1291. Sequential Digits

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Strings%20%26%20Simulation-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

An integer has **sequential digits** if every digit is exactly one greater than the previous digit.

Given two integers `low` and `high`, return a sorted list of all sequential digit numbers in the inclusive range `[low, high]`.

---

## My Approach

### Idea

Every sequential digit number is already contained as a substring of the fixed string:

```text
123456789
```

Generate all possible substrings of lengths **2 to 9**, convert each into an integer, and include it in the answer if it lies within the required range.

### Steps

1. Store `"123456789"` in a string.
2. Try every possible substring length from **2** to **9**.
3. Generate every substring of that length.
4. Convert the substring into an integer.
5. If the number lies between `low` and `high`, add it to the answer.
6. Return the generated list.

---

## Complexity Analysis

```text
Time Complexity : O(1)

Space Complexity: O(1)
```

Since there are only **36 possible sequential digit numbers**, the algorithm always performs a constant amount of work regardless of the input range.

---

## Concepts Learned

- Strings
- Substrings
- Simulation
- Pattern Generation

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 42.43 MB

Beats : 36.36%
```

---

## Notes

Instead of checking every number between `low` and `high`, only the valid sequential numbers are generated. Since the set of possible sequential digit numbers is fixed and very small, this solution is both simple and optimal.