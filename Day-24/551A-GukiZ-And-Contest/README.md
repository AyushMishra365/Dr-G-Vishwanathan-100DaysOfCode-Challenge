<div align="center">

# 551A. GukiZ and Contest

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-1200-orange)
![Topic](https://img.shields.io/badge/Topic-Implementation-green)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

GukiZ wants to determine the final position of each student after a contest.

A student's rank is defined as:

```text
1 + (number of students having a strictly higher rating)
```

Students with equal ratings receive the same rank.

---

## My Approach

### Key Observation

For every student:

- Start with rank = 1.
- Compare their rating with every other student's rating.
- Increase the rank whenever a higher rating is found.
- Print the final rank.

Since the constraints are small, a simple nested-loop comparison is sufficient.

---

## Complexity Analysis

```text
Time Complexity : O(n²)

Space Complexity: O(1)
```

---

## Concepts Learned

- Ranking Systems
- Nested Loop Comparisons
- Array Traversal
- Brute Force Implementation

---

## Performance

```text
Verdict : Accepted

Language : Java 21

Time : 281 ms

Memory : 1824 KB
```

---

## Problem Link

https://codeforces.com/problemset/problem/551/A

---

## Notes

This problem demonstrates how ranking can be derived directly from pairwise comparisons. Although sorting-based solutions are possible, the straightforward O(n²) implementation easily satisfies the constraints.
