<div align="center">

# 1781. Sum of Beauty of All Substrings

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Accepted-success)

</div>

---

## 🔗 Problem Link

[LeetCode – 1781. Sum of Beauty of All Substrings](https://leetcode.com/problems/sum-of-beauty-of-all-substrings/)

---

## 📝 Problem Statement

The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

Given a string `s`, return the sum of the beauty of all of its substrings.

---

## 💡 My Approach

### Idea

I considered every possible substring by fixing a starting index and extending the substring one character at a time.

For each substring, I maintained a frequency array of size `26` to count the occurrences of each character.

After updating the frequency, I traversed the frequency array to find the maximum frequency and the minimum non-zero frequency.

The beauty of the current substring is:

`maximum frequency - minimum frequency`

I added this value to the final answer for every substring.

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n² × 26)` → `O(n²)`
- **Space Complexity:** `O(26)` → `O(1)`

---

## 📚 Concepts Learned

- Frequency Array
- Strings
- Substrings
- Nested Loops
- Character Counting
- Maximum and Minimum Frequency

---

## ⚡ Performance

- **Runtime:** 61 ms
- **Memory:** 44.39 MB

---

## 📝 Notes

Since the string contains only lowercase English letters, a frequency array of size `26` is sufficient to store the character frequencies.