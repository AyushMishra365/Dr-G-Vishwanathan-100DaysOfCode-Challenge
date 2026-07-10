<div align="center">

# 383. Ransom Note

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given two strings `ransomNote` and `magazine`, return `true` if the ransom note can be constructed using the letters from the magazine. Each character from the magazine can only be used once.

---

## My Approach

### Idea

Store the frequency of every character present in the magazine.

Then traverse the ransom note and decrease the frequency of each required character.

If any frequency becomes negative, the required character is unavailable, so return `false`.

Otherwise, return `true`.

### Steps

1. Create a frequency array of size 26.
2. Count all characters of the magazine.
3. Traverse the ransom note.
4. Decrease the corresponding frequency.
5. If any count becomes negative, return `false`.
6. Otherwise return `true`.

---

## Complexity Analysis

```text
Time Complexity : O(m + n)

Space Complexity: O(1)
```

where

- m = length of magazine
- n = length of ransomNote

---

## Concepts Learned

- Frequency Array
- Character Counting
- Strings

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 99.98%

Memory : 46.22 MB

Beats : 79.63%
```

---

## Notes

Using a fixed-size frequency array is much more efficient than using a HashMap since the input contains only lowercase English letters.