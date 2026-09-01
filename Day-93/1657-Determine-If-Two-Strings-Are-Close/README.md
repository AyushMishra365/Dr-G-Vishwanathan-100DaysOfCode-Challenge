<div align="center">

# 1657. Determine if Two Strings Are Close

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Accepted-success)

</div>

---

## 🔗 Problem Link

[LeetCode – 1657. Determine if Two Strings Are Close](https://leetcode.com/problems/determine-if-two-strings-are-close/)

---

## 📝 Problem Statement

Two strings are considered close if you can attain one from the other using the following operations:

- Swap any two existing characters.
- Transform every occurrence of one existing character into another existing character, and do the same with the other character.

Given two strings `word1` and `word2`, return `true` if they are close and `false` otherwise.

---

## 💡 My Approach

### Idea

First, I checked whether both strings have the same length. If their lengths are different, they cannot be close.

Then I created two frequency arrays of size `26` to store the frequency of every character in both strings.

I checked that both strings contain exactly the same set of characters.

Finally, I compared the frequency distributions of both strings. The allowed operations can swap characters and exchange their frequencies, but they cannot change the overall frequency distribution.

If both conditions are satisfied, I return `true`; otherwise, I return `false`.

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n + 26)` → `O(n)`
- **Space Complexity:** `O(26)` → `O(1)`

---

## 📚 Concepts Learned

- Frequency Array
- Strings
- Character Counting
- String Manipulation
- Character Set Comparison
- Frequency Distribution

---

## ⚡ Performance

- **Runtime:** 11 ms
- **Memory:** 47.72 MB

---

## 📝 Notes

The key observation is that two strings are close when:

1. They contain the same set of characters.
2. Their character frequencies have the same distribution.

The actual order of characters does not matter because characters can be swapped.