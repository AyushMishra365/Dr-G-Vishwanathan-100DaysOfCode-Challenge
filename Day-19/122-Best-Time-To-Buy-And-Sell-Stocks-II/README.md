<div align="center">

# 122. Best Time to Buy and Sell Stock II

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Greedy-purple)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

You may buy and sell the stock multiple times.

Find the maximum profit that can be achieved.

---

## My Approach

### Key Observation

Every increasing segment contributes profit.

Instead of searching for every buy and sell pair:

```text
profit += prices[i] - prices[i-1]
```

whenever:

```text
prices[i] > prices[i-1]
```

This captures all profitable opportunities.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy
- Arrays
- Optimization

---

## Problem Link

https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/