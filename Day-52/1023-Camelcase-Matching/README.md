<div align="center">

# 1023. Camelcase Matching

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Strings%20%26%20Two%20Pointers-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an array of query strings and a pattern, determine whether each query matches the pattern according to the camelcase matching rules.

---

## My Approach

### Idea

- Process every query independently.
- Use two pointers to compare the query with the pattern.
- Match characters whenever possible.
- Ignore extra lowercase letters.
- If an unmatched uppercase letter appears in the query, the query cannot match.
- The pattern must be completely matched by the end.

---

## Complexity Analysis

```text
Time Complexity : O(n × m)

Space Complexity: O(1) (excluding output)
```

---

## Concepts Learned

- Two Pointers
- String Traversal
- Character Matching

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 30.66%

Memory : 43.05 MB

Beats : 41.61%
```

---

## Notes

A two-pointer approach efficiently validates every query while correctly handling extra lowercase characters and invalid uppercase letters.