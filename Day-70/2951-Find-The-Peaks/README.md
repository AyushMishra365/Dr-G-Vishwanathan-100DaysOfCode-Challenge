<div align="center">

# 2951. Find the Peaks

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a 0-indexed integer array `mountain`, find all the peaks in the array.

An element is considered a peak if it is **strictly greater than both of its neighboring elements**.

The first and last elements cannot be peaks.

Return the indices of all peaks.

---

## My Approach

Traverse the array from index `1` to `n - 2`.

For every element, check:

```text
mountain[i - 1] < mountain[i]
AND
mountain[i] > mountain[i + 1]