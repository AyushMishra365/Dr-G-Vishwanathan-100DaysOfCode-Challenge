<div align="center">

# 136A. Presents

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-success)
![Topic](https://img.shields.io/badge/Topic-Implementation-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Petya remembers which friend gave a gift to each friend.

For every friend, determine who gave them a gift.

---

## My Approach

### Idea

- Read the array where `arr[i]` represents the friend who received a gift from friend `i`.
- Create another array `ans`.
- For every friend `i`, place `i` at index `arr[i]`.
- Finally, print the constructed array.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(n)
```

---

## Concepts Learned

- Arrays
- Reverse Mapping
- Implementation

---

## Performance

```text
Verdict : Accepted

Language : Java 21

Time : 530 ms

Memory : 952 KB
```

---

## Notes

Instead of searching for each friend separately, reverse the mapping while reading the input. This directly constructs the required answer in linear time.