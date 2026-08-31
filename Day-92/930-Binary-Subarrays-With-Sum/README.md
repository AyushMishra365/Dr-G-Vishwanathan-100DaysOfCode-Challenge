
## Question README — 930

```markdown
<div align="center">

# 930. Binary Subarrays With Sum

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

![Topic](https://img.shields.io/badge/Topic-Arrays-blue)

![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a binary array `nums` and an integer `goal`, return the number of non-empty subarrays with a sum equal to `goal`.

A subarray is a contiguous part of the array.

---

## Example 1

### Input

```text
nums = [1,0,1,0,1]
goal = 2
```

### Output
4

## Example 2

### Input

```text
nums = [0,0,0,0,0]
goal = 0
```

### Output
15

## My Approach
```text
Used the At Most technique.

First, I calculated the number of subarrays having a sum at most goal.

Then, I calculated the number of subarrays having a sum at most goal - 1.

Finally:

exactly(goal) = atMost(goal) - atMost(goal - 1)

The atMost function uses a sliding window with two pointers.

For every right index, I added the current element to the sum. If the sum became greater than the required value, I moved the left pointer until the window became valid again.

The number of valid subarrays ending at the current index is:

right - left + 1
```

## Complexity Analysis

### Time Complexity : O(n)

### Space Complexity: O(1)

## Concepts Learned
Arrays
Sliding Window
Two Pointers
At Most Technique
Subarray Counting

## Problem Link

https://leetcode.com/problems/binary-subarrays-with-sum/