# 191. Number of 1 Bits

## Platform

- LeetCode

## Problem Statement

Given a positive integer, return the number of set bits in its binary representation.

## Approach

- Used Brian Kernighan's algorithm.
- Repeatedly removed the lowest set bit using `n & (n - 1)`.
- Counted how many removals were needed until the number became `0`.

## Problem Link

https://leetcode.com/problems/number-of-1-bits/
