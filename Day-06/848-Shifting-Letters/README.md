<div align="center">

# 848. Shifting Letters

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)

</div>

---

## Problem Statement

You are given a string `s` of lowercase English letters and an integer array `shifts`.

For each `shifts[i]`, shift the first `i + 1` letters of `s` by `shifts[i]` positions in the alphabet.

Return the final string after all such shifts.

---

## Example 1

### Input

```text
s = "abc"
shifts = [3,5,9]
```

### Output

```text
"rpl"
```

---

## Example 2

### Input

```text
s = "aaa"
shifts = [1,2,3]
```

### Output

```text
"gfd"
```

---

## Constraints

```text
1 <= s.length <= 5 × 10⁴

s consists of lowercase English letters.

shifts.length == s.length
```

---

## Problem Link

https://leetcode.com/problems/shifting-letters/
