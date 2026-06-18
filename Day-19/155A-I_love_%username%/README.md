<div align="center">

# 155A. I_love_%username%

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-success)
![Topic](https://img.shields.io/badge/Topic-Implementation-green)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

A performance is considered amazing when the contestant achieves a score strictly higher than all previous scores or strictly lower than all previous scores.

Count the number of amazing performances.

---

## My Approach

### Key Observation

Maintain:

- Current maximum score
- Current minimum score

Whenever a new score exceeds the maximum or drops below the minimum:

- Increment the answer.
- Update the corresponding record.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Arrays
- Tracking Extremes
- Implementation

---

## Problem Link

https://codeforces.com/problemset/problem/155/A