<div align="center">

**# 1160. Find Words That Can Be Formed by Characters**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

You are given an array of strings `words` and a string `chars`.

A string is considered **good** if it can be formed using characters from `chars`, where each character can only be used once for each word.

Return the sum of the lengths of all good strings in `words`.

---

**## My Approach**

**### Idea**

- Create a frequency array of size `26` to store the count of each character in `chars`.
- Traverse every word in `words`.
- For each word, create another frequency array to count its characters.
- Compare the character frequencies of the word with the available frequencies in `chars`.
- If every required character is available in sufficient quantity, the word can be formed.
- Add the length of every formable word to the result.
- Return the total length.

---

**## Complexity Analysis**

```text
Time Complexity : O(C + W × L)