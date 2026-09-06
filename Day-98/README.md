# 🚀 Day 98/100 – Dr. G. Viswanathan 100 Days of Code Challenge

## 📌 Problem Solved

### 1. Distinct Subsequences
- **LeetCode:** 115
- **Difficulty:** Hard
- **Status:** Accepted

**Problem:**  
Given two strings `s` and `t`, find the number of distinct subsequences of `s` that are equal to `t`.

**My Approach:**  
Used Dynamic Programming.

- `dp[i][j]` represents the number of distinct subsequences of the first `i` characters of `s` that can form the first `j` characters of `t`.
- If the current characters match, there are two choices:
  - Include the current character from `s`.
  - Skip the current character from `s`.
- Therefore:
  `dp[i][j] = dp[i-1][j-1] + dp[i-1][j]`
- If the characters do not match, we can only skip the current character of `s`:
  `dp[i][j] = dp[i-1][j]`
- `dp[i][0] = 1` because an empty string can always be formed by taking no characters.

**Complexity:**
- Time: `O(n × m)`
- Space: `O(n × m)`

---

## 📚 Day 98 Takeaways

- Practiced **Dynamic Programming** on strings.
- Learned how to count subsequences using a 2D DP table.
- Strengthened understanding of **include/exclude choices** in DP.
- Practiced identifying base cases for string DP problems.
- Improved understanding of how smaller subproblems contribute to the final answer.

---

## 📂 GitHub Progress

I've been documenting every day's solutions and progress in my GitHub repository:

- **Day:** 98/100
- **Language:** Java
- **Repository:** Dr. G. Viswanathan 100 Days of Code Challenge