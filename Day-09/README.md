# Day 09

## Platform

- LeetCode

## Problems Solved

- [6. Zigzag Conversion](./6-Zigzag-Conversion)
- [1071. Greatest Common Divisor of Strings](./1071-Greatest-Common-Divisor-of-Strings)

## Key Concepts

- Strings
- Pattern Recognition
- Simulation
- GCD (Euclidean Algorithm)

## Takeaways

- Today's focus was entirely on string-based problems.
- Learned that visualization can often be more challenging than implementation.
- Improved my understanding of how patterns emerge once a problem is broken down into smaller steps.
- Reinforced the importance of spending time understanding the arrangement of data before jumping into coding.

---

### Problems Overview

#### 6. Zigzag Conversion

A string manipulation problem where characters must be arranged in a zigzag pattern across multiple rows and then read row by row.

**My Approach**

- Simulated the zigzag movement row by row.
- Stored characters in separate rows while moving vertically downward and diagonally upward.
- Combined all rows at the end to generate the final answer.

**What I Learned**

This was easily the more challenging problem of the day.

The implementation itself wasn't very difficult once the pattern became clear, but understanding how characters move through the rows took considerable time.

The diagonal (oblique) movement of characters was initially difficult to visualize, and most of my effort went into understanding that arrangement correctly before writing the solution.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(n)

---

#### 1071. Greatest Common Divisor of Strings

A string problem that involves finding the largest string that can repeatedly construct both given strings.

**My Approach**

- Checked whether both strings could be generated from the same repeating pattern.
- Applied Euclid's GCD algorithm on the lengths of the strings.
- Returned the corresponding prefix whose length matched the computed GCD.

**What I Learned**

This problem was interesting because it combined string manipulation with a mathematical concept that is usually associated with numbers.

It was a good example of how familiar algorithms can often be applied in completely different contexts.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

### Why Today Was Important

Today's session highlighted how important visualization and pattern recognition are when solving DSA problems.

The Zigzag Conversion problem especially reminded me that understanding the structure of a problem is often more important than the coding itself. Once the pattern became clear, the implementation followed naturally.

It was also my first time solving a Medium problem where understanding the arrangement of elements took significantly more time than writing the actual code.

---

Day 9 ✅

Today's biggest takeaway was that before thinking about optimization or implementation, it's important to fully understand how the data is being arranged and transformed. A clear mental picture often makes the solution much easier to develop.
