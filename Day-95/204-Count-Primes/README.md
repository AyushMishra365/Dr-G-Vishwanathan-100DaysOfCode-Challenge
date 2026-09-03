# <div align="center">204. Count Primes</div>

<div align="center">

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange)
![Status](https://img.shields.io/badge/Status-Accepted-success)

</div>

## 🔗 Problem Link

[LeetCode 204 – Count Primes](https://leetcode.com/problems/count-primes/)

## 📝 Problem Statement

Given an integer `n`, return the number of prime numbers that are **strictly less than `n`**.

### Example

```text
Input:
n = 10

Output:
4
The prime numbers less than 10 are:

2, 3, 5, 7
```

## 💡 My Approach
Idea

I used the Sieve of Eratosthenes to find all prime numbers less than n.

Create a boolean array used of size n.
Start checking numbers from 2.
If a number is not marked, it is considered prime.
Mark all multiples of that number as non-prime.
Finally, count all unmarked numbers from 2 to n - 1.

The multiples are marked starting from i * i because all smaller multiples have already been handled by smaller numbers.

## ⏱️ Complexity Analysis

### Time Complexity: O(n log log n)
### Space Complexity: O(n)


## 📚 Concepts Learned
Prime numbers
Sieve of Eratosthenes
Boolean arrays
Array traversal
Mathematical optimization
Marking multiples


## ⚡ Performance
Language: Java
Runtime: 619 ms
Runtime Beats: 25.37%
Memory: 79.38 MB
Memory Beats: 26.30%
Test Cases: 385 / 385
Status: Accepted