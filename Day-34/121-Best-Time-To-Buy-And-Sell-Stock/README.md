<div align="center">

# 121. Best Time to Buy and Sell Stock

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an array where each element represents the stock price on a particular day, determine the maximum profit that can be earned by buying once and selling once in the future.

---

## My Approach

### Idea

Traverse the array while maintaining the lowest price encountered so far. At each step, calculate the profit obtained by selling on the current day and update the maximum profit.

### Steps

1. Store the first day's price as the current minimum.
2. Traverse the remaining prices.
3. Update the minimum price whenever a smaller value appears.
4. Compute the profit using the current price.
5. Keep track of the maximum profit.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Algorithm
- Prefix Minimum
- Array Traversal

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 99.94%

Memory : 94.36 MB

Beats : 69.94%
```

---

## Notes

Instead of checking every buying and selling pair, maintaining the minimum price seen so far is enough to obtain the optimal solution in a single traversal.