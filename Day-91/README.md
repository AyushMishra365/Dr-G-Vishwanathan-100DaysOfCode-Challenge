# Day 91

---

## Platform

- LeetCode

## Problems Solved

- [2091. Removing Minimum and Maximum From Array](./2091-Removing-Minimum-and-Maximum-From-Array)

## Key Concepts

- Arrays
- Minimum and Maximum
- Index Tracking
- Greedy
- Deletion Strategies

## Takeaways

- Today's problem focused on finding the minimum and maximum elements efficiently.
- Learned how tracking the indices of important elements can simplify array deletion problems.
- Compared different ways of removing elements from the front and back of an array.
- Practiced choosing the minimum number of operations among multiple possible strategies.

---

### Problems Overview

#### 2091. Removing Minimum and Maximum From Array

A problem where the goal is to remove both the minimum and maximum elements from an array using the minimum possible number of deletions from either end.

**My Approach**

- Traversed the array to find the indices of the minimum and maximum elements.
- Considered three possible deletion strategies:
  - Remove both elements from the front.
  - Remove both elements from the back.
  - Remove the smaller-indexed element from the front and the other from the back.
- Calculated the number of deletions required for each strategy.
- Returned the minimum among the three possibilities.

**What I Learned**

When elements can be removed from either end, comparing all valid deletion strategies can lead to a simple and optimal solution.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

### Why Today Was Important

Today's problem strengthened my understanding of index-based problem solving and greedy decision making.

Rather than actually performing deletions, identifying the positions of the minimum and maximum elements allowed the problem to be reduced to comparing only three possible strategies.

---

Day 91 ✅

Ninety-one days into the challenge, and array problems are becoming much easier to reason about by focusing on indices and possible operations. Looking forward to strengthening more problem-solving patterns tomorrow.