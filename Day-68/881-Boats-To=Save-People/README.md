<div align="center">

# 881. Boats to Save People

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

You are given an array `people`, where each element represents a person's weight, and an integer `limit` representing the maximum weight a boat can carry.

Each boat can carry at most two people, provided their combined weight does not exceed `limit`.

Return the minimum number of boats required to rescue everyone.

---

## My Approach

### Idea

- Sort the array of people's weights.
- Use two pointers:
  - `left` points to the lightest remaining person.
  - `right` points to the heaviest remaining person.
- If the lightest and heaviest can share a boat, move both pointers.
- Otherwise, the heaviest person must occupy a boat alone, so only move the `right` pointer.
- Count one boat for each iteration until everyone is assigned.

This greedy strategy guarantees the minimum number of boats.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)
```

- Sorting the array takes **O(n log n)**.
- The two-pointer traversal takes **O(n)**.

```text
Space Complexity: O(1)
```

(Excluding the space used by the sorting algorithm.)

---

## Concepts Learned

- Greedy Algorithm
- Two Pointers
- Sorting
- Arrays

---

## Performance

```text
Runtime : 20 ms (Beats 83.38%)

Memory  : 56.71 MB (Beats 9.18%)
```

---

## Notes

The key observation is that the heaviest remaining person should always be considered first. If they cannot be paired with the lightest remaining person, they cannot be paired with anyone else and must go alone. This greedy observation makes the two-pointer solution both correct and efficient.