# 🚀 Day 81/100 of the #DrGVishwanathan Challenge | 100 Days of DSA

## Problems Solved:

### 1. 3069. Distribute Elements Into Two Arrays I

**Problem:**  
Given a 1-indexed array of distinct integers, distribute its elements into two arrays according to the given rules based on the last elements of both arrays, and return the array formed by concatenating the two arrays.

**My Approach:**  
Used two `ArrayList<Integer>` to store the elements of the two arrays. Initially, I added the first element to the first array and the second element to the second array. For every remaining element, I compared the last elements of both arrays. If the last element of the first array was greater, I added the current element to the first array; otherwise, I added it to the second array. Finally, I traversed both lists and concatenated them into the result array.

**Complexity:**  
- Time Complexity: O(n)
- Space Complexity: O(n)

---

## Takeaways

- Practiced using **ArrayList** for dynamic storage.
- Learned how to access the last element of an `ArrayList`.
- Practiced distributing elements based on comparison conditions.
- Learned how to concatenate two `ArrayList` objects into an array.
- Strengthened understanding of **array traversal and Java collections**.

---

## Progress

**Day:** 81/100  
**Challenge:** #DrGVishwanathan  
**Repository:** [Dr. G. Vishwanathan 100 Days of Code Challenge](https://github.com/AyushMishra365/Dr-G-Vishwanathan-100DaysOfCode-Challenge)

Another day of consistent DSA practice completed. 🚀

On to Day 82!

#100DaysOfCode #DSA #LeetCode #Java #DrGVishwanathanChallenge