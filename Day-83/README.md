# 🚀 Day 83/100 of the #DrGVishwanathan Challenge | 100 Days of DSA

## Problems Solved:

### 1. 3116. Kth Smallest Amount With Single Denomination Combination

**Problem:**  
Given an array of coin denominations and an integer `k`, find the `k`th smallest amount that can be made using coins of only one denomination. Coins of different denominations cannot be combined.

**My Approach:**  
Used **binary search** to find the smallest amount that has at least `k` valid amounts. For each candidate value, I counted how many multiples of each coin denomination are less than or equal to that value. I first expanded the upper bound until it contained at least `k` valid amounts, then applied binary search to find the minimum possible value.

**Complexity:**  
- Time Complexity: O(m × log(max))
- Space Complexity: O(1)

---

### 2. 3622. Check Divisibility by Digit Sum and Product

**Problem:**  
Given a positive integer `n`, determine whether `n` is divisible by the sum of its digits plus the product of its digits.

**My Approach:**  
Traversed the digits of `n` using `% 10` and `/ 10`. During the same traversal, calculated both the digit sum and digit product. After processing all digits, checked whether the original number was divisible by `sum + product`. If divisible, returned `true`; otherwise, returned `false`.

**Complexity:**  
- Time Complexity: O(log n)
- Space Complexity: O(1)

---

## Takeaways

- Practiced **Binary Search on Answer**.
- Learned how to count valid values using multiples of coin denominations.
- Strengthened understanding of **digit manipulation** using modulo and division.
- Practiced calculating **digit sum and digit product** in a single traversal.
- Improved understanding of optimizing brute-force approaches using binary search.
- Strengthened problem-solving skills across both **mathematical and algorithmic problems**.

---

## Progress

**Day:** 83/100  
**Challenge:** #DrGVishwanathan  
**Repository:** [Dr. G. Vishwanathan 100 Days of Code Challenge](https://github.com/AyushMishra365/Dr-G-Vishwanathan-100DaysOfCode-Challenge)

Another day of consistent DSA practice completed. 🚀

On to Day 84!

#100DaysOfCode #DSA #LeetCode #Java #DrGVishwanathanChallenge