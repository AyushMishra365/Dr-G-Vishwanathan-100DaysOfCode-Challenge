<div align="center">

# 1331. Rank Transform of an Array

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-HashMap%20%26%20Sorting-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer array `arr`, replace every element with its rank.

The ranking rules are:

- Rank starts from **1**.
- Larger values receive larger ranks.
- Equal values receive the same rank.
- The ranking should be as small as possible.

---

## My Approach

### Idea

Instead of sorting the original array directly, create a copy and sort it.

Traverse the sorted array and assign increasing ranks only to elements that have not been seen before. Store these mappings inside a `HashMap`.

Finally, traverse the original array and replace each element with its corresponding rank from the map.

### Steps

1. Create a copy of the original array.
2. Sort the copied array.
3. Initialize a `HashMap<Integer, Integer>`.
4. Assign ranks only to unique values.
5. Traverse the original array and replace each value with its mapped rank.
6. Return the transformed array.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(n)
```

---

## Concepts Learned

- Sorting
- HashMap
- Coordinate Compression
- Arrays

---

## Performance

```text
Verdict : Accepted

Runtime : 33 ms

Beats : 45.97%

Memory : 76.71 MB

Beats : 42.82%
```

---

## Notes

The key observation is that sorting the array determines the order of ranks, while a HashMap allows every original element to retrieve its assigned rank in constant time. This approach is a classic example of **coordinate compression**, where values are replaced by their relative ordering instead of their actual magnitude.