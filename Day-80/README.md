# 🚀 Day 80/100 of the #DrGVishwanathan Challenge | 100 Days of DSA

## Problems Solved:

### 1. 1386. Cinema Seat Allocation

**Problem:**  
Given `n` rows of cinema seats and a list of reserved seats, determine the maximum number of four-person families that can be seated together in the same row.

A family can occupy one of the following seat blocks:

- Seats `2, 3, 4, 5`
- Seats `4, 5, 6, 7`
- Seats `6, 7, 8, 9`

Reserved seats cannot be used.

**My Approach:**  
Used a `HashMap` to store the reserved seats for each row using a boolean array.

- First, store all reserved seats row-wise.
- Initially assume that every row can accommodate two families.
- For rows containing reservations, check whether the left block (`2–5`) and middle/right block (`4–7` / `6–9`) are available.
- Based on the available blocks, determine whether the row can accommodate two families, one family, or no family.
- Rows without any reserved seats can directly accommodate two families.

**Complexity:**  
- Time Complexity: O(m)
- Space Complexity: O(m)

where `m` is the number of reserved seats.

---

## Takeaways

- Practiced **HashMap** for storing row-wise information.
- Learned how to represent reserved seats using a **boolean array**.
- Practiced checking multiple overlapping seat ranges.
- Learned how to handle rows with and without reserved seats efficiently.
- Strengthened understanding of **greedy decision-making** and edge cases.

---

## Progress

**Day:** 80/100  
**Challenge:** #DrGVishwanathan  
**Repository:** [Dr. G. Vishwanathan 100 Days of Code Challenge](https://github.com/AyushMishra365/Dr-G-Vishwanathan-100DaysOfCode-Challenge)

Another day of consistent DSA practice completed. 🚀

On to Day 81!

#100DaysOfCode #DSA #LeetCode #Java #DrGVishwanathanChallenge