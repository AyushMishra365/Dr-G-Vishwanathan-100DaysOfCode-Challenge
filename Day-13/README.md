# Day 13

## Platform

- Codeforces
- LeetCode

## Problems Solved

- 41A. Translation
- 236A. Boy or Girl
- 461. Hamming Distance
- 476. Number Complement 

## Key Concepts

- Strings
- Character Comparison
- Sorting
- Distinct Elements
- Bit Manipulation
- XOR
- Brian Kernighan's Algorithm

## Takeaways

- Today's problems covered strings, implementation, and bit manipulation.
- Learned how XOR can be used to identify differing bits between two numbers.
- Understood Brian Kernighan's Algorithm for counting set bits efficiently.
- Continued strengthening problem-solving through simple observations and optimizations.

---

### Problems Overview

#### 41A. Translation

A string reversal and comparison problem.

**My Approach**

- Compared characters of the first string with characters from the end of the second string.
- Verified whether one string was the reverse of the other.

**What I Learned**

String comparison problems often become simpler when approached with two indices moving in opposite directions.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

#### 236A. Boy or Girl

A problem based on counting distinct characters in a username.

**My Approach**

- Sorted the characters of the string.
- Counted the number of distinct characters.
- Determined the answer based on whether the count was odd or even.

**What I Learned**

There are multiple ways to count distinct characters, but sorting provides a straightforward solution while reinforcing sorting concepts.

**Complexity**

- Time Complexity: O(n log n)
- Space Complexity: O(n)

---

#### 461. Hamming Distance

A bit manipulation problem involving differing bit positions.

**My Approach**

- Applied XOR to identify differing bits.
- Used Brian Kernighan's Algorithm to count the set bits efficiently.

**What I Learned**

Today's biggest learning was Brian Kernighan's Algorithm:

```text
n & (n - 1)
```

which removes the rightmost set bit in every iteration.

**Complexity**

- Time Complexity: O(k), where k is the number of set bits
- Space Complexity: O(1)

---

### Why Today Was Important

Today's problems introduced another useful area of DSA: Bit Manipulation.

While string and sorting problems feel more intuitive, bitwise operations require a different way of thinking. Learning XOR tricks and Brian Kernighan's Algorithm was the highlight of the day and showed how mathematical properties can lead to elegant solutions.

---

Day 13 ✅

Thirteen days into the challenge, and I'm gradually moving beyond basic implementation toward understanding more efficient techniques and optimizations. Looking forward to learning more patterns and algorithms tomorrow.
