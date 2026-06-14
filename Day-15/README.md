# Day 15

## Platform

- LeetCode

## Problems Solved

- [136. Single Number](./136-Single-Number)
- [191. Number of 1 Bits](./191-Number-of-1-Bits)
- [1328. Break a Palindrome](./1328-Break-a-Palindrome)

## Key Concepts

- Bit Manipulation
- XOR
- Brian Kernighan's Algorithm
- Strings
- Greedy
- Character Arrays

## Takeaways

- Today's problems were a combination of Bit Manipulation and String Processing.
- Reinforced the usefulness of XOR in solving array problems efficiently.
- Continued practicing Brian Kernighan's Algorithm for working with set bits.
- Learned how a greedy observation can simplify string transformation problems.

---

### Problems Overview

#### 136. Single Number

A bit manipulation problem where every element appears twice except one.

**My Approach**

- Applied XOR on all elements of the array.
- Since identical numbers cancel each other out, the remaining value is the answer.

**What I Learned**

The XOR properties:

```text
x ^ x = 0
x ^ 0 = x
```

allow duplicate elements to eliminate each other naturally.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

#### 191. Number of 1 Bits

A classic bit manipulation problem involving counting set bits.

**My Approach**

- Used Brian Kernighan's Algorithm.
- Repeatedly removed the rightmost set bit using:

```text
n & (n - 1)
```

until the number became zero.

**What I Learned**

The algorithm runs only as many times as there are set bits, making it more efficient than checking every bit individually.

**Complexity**

- Time Complexity: O(k)
- Space Complexity: O(1)

where k is the number of set bits.

---

#### 1328. Break a Palindrome

A string manipulation problem with a greedy approach.

**My Approach**

- Traversed only the first half of the palindrome.
- Replaced the first non-'a' character with 'a'.
- If all characters were already 'a', changed the last character to 'b'.

**What I Learned**

Sometimes a small greedy observation can completely eliminate the need for complex string generation or brute-force checking.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(n)

---

### Why Today Was Important

Today's problems highlighted how powerful simple observations can be.

Bit manipulation continues to become more intuitive with practice, while Break a Palindrome demonstrated how understanding the structure of a problem often leads directly to an optimal solution.

---

Day 15 ✅

Fifteen days into the challenge, and bit manipulation is starting to feel much less intimidating than it did initially. Looking forward to learning more patterns and strengthening my DSA fundamentals tomorrow.