<div align="center">

# 459B. Pashmak and Flowers

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-1200-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Find the maximum possible beauty difference between two flowers and the number of pairs that achieve this maximum difference.

---

## My Approach

### Idea

Sort the flowers to easily identify the minimum and maximum beauty values. Count how many times each appears and compute the number of valid pairs.

### Steps

1. Sort the array.
2. Compute the maximum beauty difference.
3. If all flowers have equal beauty:
   - Return **n × (n − 1) / 2**.
4. Count occurrences of the minimum and maximum values.
5. Multiply their frequencies to obtain the total number of valid pairs.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(1)
```

*(Ignoring sorting space.)*

---

## Concepts Learned

- Sorting
- Frequency Counting
- Greedy Observation
- Combinatorics

---

## Notes

The key observation is that only the minimum and maximum beauty values can produce the maximum possible difference, so counting their frequencies directly yields the answer.