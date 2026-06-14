# Day 05

## Platform

- LeetCode

## Problems Solved

- [15. 3Sum](./15-3Sum)
- [16. 3Sum Closest](./16-3Sum-Closest)

## Key Concepts

- Sorting
- Two Pointers
- Arrays
- Pattern Recognition

## Takeaways

- Today's focus was less about solving individual problems and more about understanding the overall **3Sum pattern**.
- Learned how sorting combined with two pointers can significantly reduce unnecessary comparisons.
- Observed how a small change in a problem statement can require a different way of thinking while still using the same underlying approach.
- Reinforced the importance of recognizing patterns instead of memorizing solutions.

---

### Problems Overview

#### 15. 3Sum

A classic array problem that requires finding all unique triplets whose sum equals zero.

**My Approach**

- Sorted the array first.
- Fixed one element at a time.
- Used two pointers to search for the remaining two elements.
- Carefully handled duplicate values to avoid repeated triplets in the final answer.

**What I Learned**

The most important part of this problem wasn't finding triplets—it was learning how to eliminate duplicates efficiently after sorting.

**Complexity**

- Time Complexity: O(n²)
- Space Complexity: O(1) (excluding the output list)

---

#### 16. 3Sum Closest

A variation of the 3Sum problem where the goal is to find the triplet whose sum is closest to a target value.

**My Approach**

- Sorted the array.
- Applied the same two-pointer strategy used in 3Sum.
- Instead of looking for an exact match, continuously tracked the closest sum encountered so far.
- Updated the answer whenever a better candidate was found.

**What I Learned**

Although the structure looked almost identical to 3Sum, the thinking process was different. Instead of searching for exact solutions, I had to focus on minimizing the difference between the current sum and the target value.

**Complexity**

- Time Complexity: O(n²)
- Space Complexity: O(1)

---

### Why Today Was Important

Both problems belonged to the same family, which made today more about understanding a pattern than learning two separate solutions.

By solving both questions together, I gained a much better understanding of how:

- Sorting simplifies array problems.
- Two pointers help reduce brute-force approaches.
- Similar-looking problems can often share the same foundation while requiring different observations.

---

Day 5 ✅

Today's biggest takeaway was that understanding the underlying pattern is far more valuable than memorizing individual solutions. Once the 3Sum pattern becomes clear, many related problems become much easier to approach.
