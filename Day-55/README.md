# Day 55 - Dr. G. Viswanathan 100 Days of Code Challenge

## Problems Solved

### LeetCode
1. 3536. Maximum Product of Two Digits (Easy)
2. 1840. Maximum Building Height (Hard)

---

## Problem 1: Maximum Product of Two Digits

**Approach:**
- Traversed each digit of the given number.
- Kept track of the largest and second-largest digits encountered.
- Returned the product of these two digits.

**Time Complexity:** O(d), where d is the number of digits.

**Space Complexity:** O(1)

**Performance**
- Runtime: **1 ms** (Beats **100.00%**)
- Memory: **42.72 MB** (Beats **38.93%**)

---

## Problem 2: Maximum Building Height

**Approach:**
- Added the mandatory restriction for Building 1 with height 0.
- Sorted all restrictions by building index.
- Performed a left-to-right pass to satisfy adjacent height constraints.
- Performed a right-to-left pass to further tighten the maximum possible heights.
- Calculated the highest achievable peak between every pair of adjacent restrictions.

**Time Complexity:** O(m log m)

**Space Complexity:** O(m)

> *m = number of restrictions.*

**Performance**
- Runtime: **53 ms** (Beats **90.54%**)
- Memory: **125.95 MB** (Beats **18.70%**)

---

## Day 55 Takeaways

- Practiced maintaining the two largest values in a single traversal.
- Learned how bidirectional constraint propagation helps satisfy multiple conditions efficiently.
- Reinforced the importance of sorting and interval-based reasoning in optimization problems.

---

## GitHub Progress

Added today's solutions and updated the repository.

**Repository:**  
👉 https://github.com/AyushMishra365/Dr-G-Vishwanathan-100DaysOfCode-Challenge

---

Day 55 ✅

On to Day 56. 🚀