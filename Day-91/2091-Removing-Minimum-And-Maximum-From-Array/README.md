<div align="center">

# 2091. Removing Minimum and Maximum From Array

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

![Topic](https://img.shields.io/badge/Topic-Arrays-blue)

![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

You are given a 0-indexed array of distinct integers.

The array contains one minimum element and one maximum element.

In one deletion, you can remove an element from either the front or the back of the array.

Find the minimum number of deletions required to remove both the minimum and maximum elements from the array.

---

## Example 1

### Input

```text
nums = [2,10,7,5,4,1,8,6]

Output
5
Explanation

The minimum element is 1 at index 5.

The maximum element is 10 at index 1.

We can remove both elements using the minimum number of deletions by choosing the best combination of removing elements from the front and back.

My Approach

First, I traversed the array to find the indices of the minimum and maximum elements.

After finding their positions, I considered three possible strategies:

Remove both elements from the front.
Remove both elements from the back.
Remove one element from the front and the other from the back.

For the third case, I used the smaller index as the element removed from the front and the larger index as the element removed from the back.

Then I calculated the number of deletions required for all three cases and returned the minimum.

Complexity Analysis
Time Complexity : O(n)

Space Complexity: O(1)
Concepts Learned
Arrays
Minimum and Maximum
Index Tracking
Greedy
Deletion Strategies
Problem Link

https://leetcode.com/problems/removing-minimum-and-maximum-from-array/