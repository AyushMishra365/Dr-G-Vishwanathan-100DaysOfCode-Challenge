<div align="center">

# 1248. Count Number of Nice Subarrays

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

![Topic](https://img.shields.io/badge/Topic-Arrays-blue)

![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an array of integers `nums` and an integer `k`, a continuous subarray is called nice if there are exactly `k` odd numbers in it.

Return the number of nice subarrays.

---

## Example 1

### Input

```text
nums = [1,1,2,1,1]
k = 3
```

### Output
2

### Explanation
```text
The two nice subarrays are:

[1,1,2,1]
[1,2,1,1]

Each contains exactly three odd numbers.
```

## Example 2

### Input
```text
nums = [2,4,6]
k = 1
```

### Output
0

### Explanation

There are no odd numbers in the array.


## My Approach
```text
Used the At Most technique.

I treated odd numbers as 1 and even numbers as 0.

First, I counted the number of subarrays containing at most k odd numbers.

Then, I counted the number of subarrays containing at most k - 1 odd numbers.

Finally:

exactly(k) = atMost(k) - atMost(k - 1)

The atMost function uses a sliding window. Whenever the number of odd elements becomes greater than k, I move the left pointer until the window becomes valid again.

For every valid window, the number of subarrays ending at the current index is:

right - left + 1
```

## Complexity Analysis

## Time Complexity : O(n)

## Space Complexity: O(1)

## Concepts Learned
Arrays
Sliding Window
Two Pointers
At Most Technique
Subarray Counting
Odd and Even Numbers

## Problem Link

https://leetcode.com/problems/count-number-of-nice-subarrays/