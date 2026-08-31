# Day 92

---

## Platform

- LeetCode

## Problems Solved

- [930. Binary Subarrays With Sum](./930-Binary-Subarrays-With-Sum)

- [1248. Count Number of Nice Subarrays](./1248-Count-Number-of-Nice-Subarrays)

## Key Concepts

- Arrays
- Sliding Window
- Two Pointers
- Prefix Sum
- At Most Technique
- Subarray Counting

## Takeaways

- Today's problems focused on counting subarrays satisfying a specific condition.
- Learned how the At Most technique can be used to count subarrays with an exact sum or exact number of odd elements.
- Practiced using sliding window and two-pointer techniques for efficient subarray problems.
- Understood how subtracting two At Most results can give the exact number of valid subarrays.

---

### Problems Overview

#### 930. Binary Subarrays With Sum

A binary array problem where the goal is to count the number of non-empty subarrays whose sum is equal to a given goal.

**My Approach**

Used the At Most technique to count subarrays with sum at most `goal` and subtract the number of subarrays with sum at most `goal - 1`.

This gives the number of subarrays with sum exactly equal to `goal`.

**What I Learned**

The relation:

```text
exactly(goal) = atMost(goal) - atMost(goal - 1)
can simplify many exact-sum subarray counting problems.
```

**Complexity**

Time Complexity: O(n)
Space Complexity: O(1)


### 1248. Count Number of Nice Subarrays

A problem where a subarray is called nice if it contains exactly k odd numbers.

**My Approach**

Used the same At Most technique by treating odd numbers as 1 and even numbers as 0.

Counted subarrays containing at most k odd numbers and subtracted the number containing at most k - 1 odd numbers.

The difference gives the number of subarrays containing exactly k odd numbers.

**What I Learned**

Problems involving an exact number of elements satisfying a condition can often be transformed into two At Most counting problems.

**Complexity**

Time Complexity: O(n)
Space Complexity: O(1)
Why Today Was Important

```text
Today's problems strengthened my understanding of the At Most technique and sliding window.

Both problems looked different at first, but the same core idea could be applied to transform an exact-condition problem into two easier At Most problems.

Day 92 ✅

Ninety-two days into the challenge, and I'm starting to recognize patterns that can be reused across different problems. Learning these techniques is making subarray problems much more manageable.
```
