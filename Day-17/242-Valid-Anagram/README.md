<div align="center">

# 242. Valid Anagram

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram is a word formed by rearranging the letters of another word using all original letters exactly once.

---

## Example 1

### Input

```text
s = "anagram"
t = "nagaram"
```

### Output

```text
true
```

---

## Example 2

### Input

```text
s = "rat"
t = "car"
```

### Output

```text
false
```

---

## Constraints

```text
1 <= s.length, t.length <= 5 × 10⁴

s and t consist of lowercase English letters.
```

---

## My Approach

### Key Observation

If two strings are anagrams:

- They must have the same length.
- Their sorted character sequences must be identical.

Example:

```text
anagram
↓ sort

aaagmnr

nagaram
↓ sort

aaagmnr
```

Since both sorted strings are equal, they are anagrams.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(n)
```

---

## Concepts Learned

- Strings
- Character Arrays
- Sorting
- Anagrams

---

## Problem Link

https://leetcode.com/problems/valid-anagram/