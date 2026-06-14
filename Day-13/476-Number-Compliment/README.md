<div align="center">

# 476. Number Complement

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-BitManipulation-red)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

The complement of an integer is obtained by flipping all the bits in its binary representation.

Given an integer `num`, return its complement.

---

## Example 1

### Input

```text
num = 5
```

### Output

```text
2
```

### Explanation

```text
Binary Representation of 5  : 101

Complement                  : 010

Decimal Value               : 2
```

---

## Example 2

### Input

```text
num = 1
```

### Output

```text
0
```

### Explanation

```text
Binary Representation of 1  : 1

Complement                  : 0
```

---

## Constraints

```text
1 <= num < 2³¹
```

---

## My Approach

### Key Observation

To flip only the significant bits of the number, we first create a mask consisting entirely of `1`s having the same bit length as `num`.

For example:

```text
num  = 5

Binary = 101

Mask   = 111
```

Once the mask is created, performing XOR with the number automatically flips every bit:

```text
101
111
---
010
```

Result:

```text
2
```

---

## Complexity Analysis

### Time Complexity

```text
O(log n)
```

The mask is built by traversing through the number of bits.

### Space Complexity

```text
O(1)
```

Only a few integer variables are used.

---

## Concepts Learned

- Bit Manipulation
- XOR Operation
- Left Shift (`<<`)
- Bit Masking
- Complement of Binary Numbers

---

## Problem Link

https://leetcode.com/problems/number-complement/
