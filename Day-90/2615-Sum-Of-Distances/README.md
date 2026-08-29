**# 2615. Sum of Distances**

---

**## Problem Statement**

You are given a `0-indexed` integer array `nums`.

For every index `i`, calculate the sum of the distances between `i` and every other index `j` such that:

`nums[i] == nums[j]` and `i != j`.

If there is no other index with the same value, the answer for that index is `0`.

Return the resulting array.

---

**## My Approach**

I first stored each element along with its original index in a 2D array.

Then I sorted this array based on the values of `nums`.

This groups all equal values together.

For each group of equal values:

\- I calculated the sum of all original indices in that group.

\- Then, for every index in the group, I calculated the sum of distances from that index to all other indices.

\- The result for each original index is stored in the corresponding position of the answer array.

For example:

```text
nums = [1,3,1,1,2]

Indices of 1 = [0,2,3]

For index 0:

|0-2| + |0-3| = 5

For index 2:

|2-0| + |2-3| = 3

For index 3:

|3-0| + |3-2| = 4

## Example

Input:

nums = [1,3,1,1,2]

Output:

[5,0,3,4,0]

## Complexity Analysis

Time Complexity : O(n log n)

Space Complexity: O(n)

Sorting the indexed array takes O(n log n), while processing all groups takes O(n) overall.

## Concepts Learned

- Arrays

- Sorting

- Grouping

- Index Tracking

- Absolute Difference

- Distance Calculation

## Problem Link

https://leetcode.com/problems/sum-of-distances/