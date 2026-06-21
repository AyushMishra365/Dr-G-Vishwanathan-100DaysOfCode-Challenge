<div align="center">

# 1328. Break a Palindrome

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a palindromic string, replace exactly one character so that the resulting string is not a palindrome and is lexicographically smallest possible.

Return the resulting string.

If it is impossible, return an empty string.

---

## Example 1

### Input

```text
palindrome = "abccba"
```

### Output

```text
aaccba
```

---

## Example 2

### Input

```text
palindrome = "a"
```

### Output

```text
""
```

---

## My Approach

### Key Observation

To obtain the lexicographically smallest non-palindrome:

1. Traverse only the first half of the string.
2. Replace the first non-'a' character with 'a'.
3. If every character is already 'a', replace the last character with 'b'.

Example:

```text
abccba
↓
aaccba
```

If:

```text
aaaa
```

then:

```text
aaab
```

---

## Complexity Analysis

```text
Time Complexity : O(n)
Space Complexity: O(n)
```

---

## Concepts Learned

- Greedy
- Strings
- Character Arrays
- Lexicographical Ordering

---

## Problem Link

https://leetcode.com/problems/break-a-palindrome/