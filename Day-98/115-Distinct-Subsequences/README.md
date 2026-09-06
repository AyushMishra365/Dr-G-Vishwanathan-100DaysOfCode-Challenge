<h1 align="center">115. Distinct Subsequences</h1>

<p align="center">
  <b>Platform:</b> LeetCode &nbsp; | &nbsp;
  <b>Difficulty:</b> Hard &nbsp; | &nbsp;
  <b>Status:</b> Accepted
</p>

---

## 📌 Problem Statement

Given two strings `s` and `t`, return the number of distinct subsequences of `s` which equals `t`.

A subsequence is formed by deleting some or none of the characters from a string while maintaining the relative order of the remaining characters.

### Example

```text
Input:
s = "rabbbit"
t = "rabbit"

Output:
3
There are 3 different ways to form "rabbit" from "rabbbit".
```

## 💡 My Approach
```text
I used Dynamic Programming.

Let:

dp[i][j]

represent the number of distinct subsequences of the first i characters of s that form the first j characters of t.

Base Case
dp[i][0] = 1

An empty string can always be formed by deleting all characters.

Transition

If:

s[i-1] == t[j-1]

we have two choices:

Use s[i-1] to match t[j-1].
Skip s[i-1].

Therefore:

dp[i][j] = dp[i-1][j-1] + dp[i-1][j]

If the characters do not match:

dp[i][j] = dp[i-1][j]

Finally:

dp[n][m]

contains the required answer.
```

## 🧮 Complexity Analysis

Let n = s.length() and m = t.length().

### Time Complexity: O(n × m)
### Space Complexity: O(n × m)


## 📚 Concepts Learned
Dynamic Programming
String DP
Subsequences
Include/Exclude Pattern
2D DP
DP Base Cases
State Transition


## ⚡ Performance
Status: Accepted
Runtime: 18 ms
Runtime Percentile: 76.88%
Memory: 54.45 MB
Memory Percentile: 38.68%


## 📝 Notes

This problem demonstrates an important DP pattern:

When characters match, consider both taking and skipping the current character.

The key recurrence is:

dp[i][j] = dp[i-1][j-1] + dp[i-1][j]

when s[i-1] == t[j-1].



## 🔗 Problem

### LeetCode 115 – Distinct Subsequences

### [115 – Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/)
- **Platform:** LeetCode
- **Difficulty:** Hard
- **Status:** Accepted