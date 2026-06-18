<div align="center">

# 96A. Football

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-success)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Players from two teams are represented by a string consisting of:

```text
0
1
```

A situation is considered dangerous if there are at least seven consecutive players from the same team.

Determine whether the given arrangement is dangerous.

---

## Example

### Input

```text
0010011111111
```

### Output

```text
YES
```

---

### Input

```text
11110111011101
```

### Output

```text
NO
```

---

## My Approach

### Key Observation

The only thing that matters is the length of consecutive identical characters.

Example:

```text
1111111
```

contains seven consecutive players from the same team, making the situation dangerous.

I traversed the string while maintaining a counter for consecutive equal characters.

Whenever:

```text
s[i] == s[i - 1]
```

the counter increases.

Otherwise it resets to 1.

As soon as the counter reaches 7, the answer is:

```text
YES
```

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Strings
- Consecutive Character Counting
- Implementation

---

## Problem Link

https://codeforces.com/problemset/problem/96/A