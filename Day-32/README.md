# Day 32

## Platform

- LeetCode

## Problems Solved

- [1822. Sign of the Product of an Array](./1822-Sign-of-the-Product-of-an-Array)
- [633. Sum of Square Numbers](./633-Sum-of-Square-Numbers)

## Key Concepts

- Array Traversal
- Mathematical Observation
- Two Pointers
- Number Theory

## Takeaways

- Sometimes computing the actual product is unnecessary when only its sign is required.
- Counting negative numbers and checking for zero can solve sign-related problems in linear time.
- Two pointers can efficiently solve mathematical search problems without brute force.
- Using `long` while squaring integers helps prevent overflow.

---

### Problem Overview

#### 1822. Sign of the Product of an Array

Traversed the array once, immediately returning `0` if any element was zero. Otherwise, counted negative numbers to determine whether the overall product is positive or negative.

#### 633. Sum of Square Numbers

Applied the two-pointer technique by checking pairs of squares from `0` to `√c`, adjusting the pointers based on the current sum until a valid pair was found or all possibilities were exhausted.

---

## Concepts Practiced

- Sign Determination
- Two Pointer Technique
- Mathematical Reasoning
- Overflow Handling

---

### Why Today Was Important

Today's problems reinforced that recognizing mathematical properties can greatly simplify implementation. Instead of unnecessary computations, both solutions relied on observations that reduced the logic to efficient linear or square-root time algorithms.

---

Day 32 ✅

Another day focused on mathematical thinking, efficient searching, and writing clean, optimized solutions.