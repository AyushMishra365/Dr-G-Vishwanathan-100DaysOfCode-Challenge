<div align="center">

# 2447. Number of Subarrays With GCD Equal to K

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Math & Arrays-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer array `nums` and an integer `k`, return the number of contiguous subarrays whose greatest common divisor equals `k`.

---

## My Approach

### Idea

- Consider every possible starting index.
- Extend the subarray one element at a time.
- Continuously update the current GCD using the Euclidean Algorithm.
- If the current GCD becomes `k`, increment the answer.
- If the GCD becomes smaller than `k`, stop exploring that subarray because it can never increase again.

---

## Complexity Analysis

```text
Time Complexity : O(n² × log M)

Space Complexity: O(1)
```

where `M` is the maximum element in the array.

---

## Concepts Learned

- Euclidean Algorithm
- Greatest Common Divisor (GCD)
- Nested Loops
- Arrays
- Number Theory

---

## Performance

```text
Verdict : Accepted

Runtime : 6 ms

Beats : 62.26%

Memory : 43.73 MB

Beats : 70.43%
```

---

## Notes

A useful observation is that the GCD of a subarray can only stay the same or decrease as more elements are added. This property allows early termination once the GCD drops below `k`, reducing unnecessary computations.