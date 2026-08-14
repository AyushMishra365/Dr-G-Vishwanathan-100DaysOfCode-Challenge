<div align="center">

**# 3090. Maximum Length Substring With Two Occurrences**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

Given a string `s`, return the maximum length of a substring such that it contains **at most two occurrences of each character**.

---

**## My Approach**

**### Idea**

- Use the **Sliding Window** technique.
- Maintain a frequency array of size `26` to store the count of each character.
- Expand the window using the `right` pointer.
- Whenever the current character occurs more than twice:
  - Move the `left` pointer forward.
  - Decrease the frequency of the characters being removed.
- Once the window becomes valid again, update the maximum length.
- Return the maximum valid window length.

---

**## Complexity Analysis**

```text
Time Complexity : O(n)