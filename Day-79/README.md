# 🚀 Day 79/100 of the #DrGVishwanathan Challenge | 100 Days of DSA

## Problems Solved:

### 1. 3471. Find the Largest Almost Missing Integer

**Problem:**  
Given an integer array `nums` and an integer `k`, find the largest integer that appears in exactly one subarray of size `k`. If no such integer exists, return `-1`.

**My Approach:**  
Handled the problem using different cases based on the value of `k`.

- When `k == n`, there is only one subarray, so the largest element in the array is the answer.
- When `k == 1`, each element forms an individual subarray, so I count the occurrences of each element and select the largest one appearing exactly once.
- For other values of `k`, I identify possible candidates and check their occurrences to determine whether they appear in exactly one valid subarray.
- Finally, I return the largest valid candidate.

**Complexity:**  
- Time Complexity: O(n²)
- Space Complexity: O(n)

---

## Takeaways

- Practiced **Array and Subarray Problems**.
- Learned how elements can occur across multiple fixed-size subarrays.
- Practiced **frequency counting** to identify valid candidates.
- Strengthened understanding of **edge cases**, especially `k = 1` and `k = n`.
- Improved problem-solving by breaking the problem into different cases.

---

## Progress

**Day:** 79/100  
**Challenge:** #DrGVishwanathan  
**Repository:** [Dr. G. Vishwanathan 100 Days of Code Challenge](https://github.com/AyushMishra365/Dr-G-Vishwanathan-100DaysOfCode-Challenge)

Another day of consistent DSA practice completed. 🚀

On to Day 80!

#100DaysOfCode #DSA #LeetCode #Java #DrGVishwanathanChallenge