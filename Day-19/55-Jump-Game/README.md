<div align="center">

# 55. Jump Game

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Greedy-purple)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an array where each element represents the maximum jump length from that position, determine whether the last index can be reached.

---

## My Approach

### Key Observation

Maintain the farthest position reachable so far.

For each index:

- If the current index exceeds the farthest reachable position, reaching the end is impossible.
- Otherwise update:

```text
farthest = max(farthest, i + nums[i])
```

If traversal completes successfully, the last index is reachable.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy
- Reachability
- Arrays
- Optimization

---

## Problem Link

https://leetcode.com/problems/jump-game/