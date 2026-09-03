# <div align="center">Day 95 — Problem Solutions</div>

---

# 3876. Construct Uniform Parity Array II

## 🔗 Problem Link

[LeetCode 3876 – Construct Uniform Parity Array II](https://leetcode.com/problems/construct-uniform-parity-array-ii/)

**Platform:** LeetCode  
**Difficulty:** Medium  
**Status:** Accepted

## 📝 Problem Statement

You are given an array of distinct integers `nums1`.

You need to construct another array `nums2` such that all elements of `nums2` are either **all odd or all even**.

For each index, you can either keep the original value or subtract another element from the array, subject to the given conditions.

Return `true` if it is possible to construct such an array; otherwise, return `false`.

## 💡 My Approach

### Idea

I first find the **minimum element** in the array.

- If the minimum element is odd, it is possible to construct an all-odd array.
- Otherwise, I check whether any element is odd.
- If an odd element exists when the minimum is even, the required uniform parity cannot be achieved.

This allows the parity condition to be checked efficiently without explicitly constructing `nums2`.

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

## 📚 Concepts Learned

- Parity checking
- Array traversal
- Mathematical reasoning
- Conditional logic

## ⚡ Performance

- **Language:** Java
- **Runtime:** 2 ms
- **Runtime Beats:** 100.00%
- **Memory:** 121.59 MB
- **Memory Beats:** 74.64%
- **Test Cases:** 1019 / 1019

---

# 204. Count Primes

## 🔗 Problem Link

[LeetCode 204 – Count Primes](https://leetcode.com/problems/count-primes/)

**Platform:** LeetCode  
**Difficulty:** Medium  
**Status:** Accepted

## 📝 Problem Statement

Given an integer `n`, return the number of prime numbers that are **strictly less than `n`**.

For example:

```text
Input:  n = 10
Output: 4
The prime numbers less than 10 are:

2, 3, 5, 7
```

## 💡 My Approach
### Idea

I used the Sieve of Eratosthenes.

Create a boolean array used to mark composite numbers.
Start from 2.
If a number is not marked, it is prime.
Mark all of its multiples as composite.
Finally, count all numbers that remain unmarked.

The inner loop starts from i * i because smaller multiples of i have already been marked by smaller prime numbers.

## ⏱️ Complexity Analysis

### Time Complexity: O(n log log n)
### Space Complexity: O(n)


## 📚 Concepts Learned
Prime numbers
Sieve of Eratosthenes
Boolean arrays
Multiples
Mathematical optimization

## ⚡ Performance
Language: Java
Runtime: 619 ms
Runtime Beats: 25.37%
Memory: 79.38 MB
Memory Beats: 26.30%
Test Cases: 385 / 385