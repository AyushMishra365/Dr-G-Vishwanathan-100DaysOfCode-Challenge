# 🚀 Day 82/100 of the #DrGVishwanathan Challenge | 100 Days of DSA

## Problems Solved:

### 1. 3918. Sum of Primes Between Number and Its Reverse

**Problem:**  
Given an integer `n`, reverse its digits to obtain `r`, then calculate the sum of all prime numbers between `min(n, r)` and `max(n, r)`, inclusive.

**My Approach:**  
First, I reversed the digits of `n` using the modulo and division operations. I then found the minimum and maximum values between the original number and its reverse to define the range. For every number in this range, I checked whether it was prime using a separate prime-checking method. If the number was prime, I added it to the sum.

**Complexity:**  
- Time Complexity: O((max - min) × √max)
- Space Complexity: O(1)

---

## Takeaways

- Practiced **Number Reversal** using modulo and division.
- Learned how to determine the range using `Math.min()` and `Math.max()`.
- Practiced **Prime Number Checking**.
- Used the optimization of checking divisors only up to `√n`.
- Strengthened understanding of **loops, conditions, and mathematical operations**.

---

## Progress

**Day:** 82/100  
**Challenge:** #DrGVishwanathan  
**Repository:** [Dr. G. Vishwanathan 100 Days of Code Challenge](https://github.com/AyushMishra365/Dr-G-Vishwanathan-100DaysOfCode-Challenge)

Another day of consistent DSA practice completed. 🚀

On to Day 83!

#100DaysOfCode #DSA #LeetCode #Java #DrGVishwanathanChallenge