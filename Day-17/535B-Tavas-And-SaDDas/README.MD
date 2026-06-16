<div align="center">

# 535B. Tavas and SaDDas

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-1200-success)
![Topic](https://img.shields.io/badge/Topic-Math-purple)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

A lucky number is a number that consists only of digits:

```text
4
7
```

All lucky numbers are arranged in increasing order.

Given a lucky number, determine its position in this ordering.

---

## Example

### Input

```text
4
```

### Output

```text
1
```

---

### Input

```text
7
```

### Output

```text
2
```

---

### Input

```text
47
```

### Output

```text
3
```

---

## Key Observation

Treat:

```text
4 → 0
7 → 1
```

This converts every lucky number into a binary representation.

Example:

```text
47

4 → 0
7 → 1

Binary: 01
```

Then:

- Calculate its binary value.
- Add the count of all lucky numbers with fewer digits.

This directly gives the position of the lucky number.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Binary Representation
- Pattern Recognition
- Number Systems
- Observation-Based Problem Solving

---

## Problem Link

https://codeforces.com/problemset/problem/535/B