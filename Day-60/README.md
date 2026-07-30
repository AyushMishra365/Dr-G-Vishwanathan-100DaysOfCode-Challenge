# Day 60 - Dr. G. Viswanathan 100 Days of Code Challenge

## Problems Solved

### LeetCode
1. 3014. Minimum Number of Pushes to Type Word I (Easy)

### Codeforces
2. 281A. Word Capitalization (800)
3. 66B. Petya and Countryside (1000)

---

## Problem 1: Minimum Number of Pushes to Type Word I

**Approach:**
- Since the letters are distinct, the optimal assignment is to place the first 8 letters on the first key press, the next 8 on the second press, and so on.
- Iterated through the characters and added `(i / 8) + 1` pushes for each position.

**Time Complexity:** O(n)

**Space Complexity:** O(1)

**Performance**
- Runtime: **0 ms** (Beats **100.00%**)
- Memory: **42.88 MB** (Beats **95.69%**)

---

## Problem 2: Word Capitalization

**Approach:**
- Converted only the first character of the string to uppercase.
- Appended the remaining substring unchanged.

**Time Complexity:** O(n)

**Space Complexity:** O(n)

---

## Problem 3: Petya and Countryside

**Approach:**
- Considered every section as the starting point.
- Expanded to the left while heights were non-increasing and to the right while heights were non-decreasing relative to the current expansion.
- Counted the maximum number of sections that could be watered.

**Time Complexity:** O(n²)

**Space Complexity:** O(1)

---

## Day 60 Takeaways

- Learned how greedy observations can simplify an optimization problem.
- Reinforced basic string manipulation techniques.
- Practiced array expansion and simulation for solving traversal-based problems.

---

## GitHub Progress

Added today's solutions and updated the repository.

**Repository:**  
👉 https://github.com/AyushMishra365/Dr-G-Vishwanathan-100DaysOfCode-Challenge

---

Day 60 ✅

On to Day 61. 🚀