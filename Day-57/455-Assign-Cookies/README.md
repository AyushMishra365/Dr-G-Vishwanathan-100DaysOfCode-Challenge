<div align="center">

# 455. Assign Cookies

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Assume you are an awesome parent and want to give your children some cookies.

Each child has a greed factor, and each cookie has a size. A child can be satisfied only if the assigned cookie's size is greater than or equal to the child's greed factor.

Return the maximum number of content children.

---

## My Approach

### Idea

- Sort both the greed factor array and the cookie size array.
- Use two pointers:
  - One for children.
  - One for cookies.
- If the current cookie satisfies the current child, assign it and move both pointers.
- Otherwise, try a larger cookie by moving only the cookie pointer.
- Count every successful assignment.

---

## Complexity Analysis

```text
Time Complexity : O(n log n + m log m)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Algorithms
- Sorting
- Two Pointers

---

## Performance

```text
Verdict : Accepted

Runtime : 14 ms

Beats : 92.15%

Memory : 51.33 MB

Beats : 74.51%
```

---

## Notes

The greedy choice of assigning the smallest cookie that can satisfy the current child ensures that larger cookies remain available for children with higher greed factors, leading to the maximum possible number of satisfied children.