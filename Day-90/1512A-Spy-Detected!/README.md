**# 1512A. Spy Detected!**

---

**## Problem Statement**

You are given an array of `n` integers.

All elements in the array are equal except for one element.

Find and print the **1-based index** of the element that is different from the others.

---

**## My Approach**

I first compared the first three elements to determine which value is repeated.

Then I traversed the array and checked each element against the common value.

\- If an element is different from the common value, its index is the answer.

\- Since Codeforces uses **1-based indexing**, I returned `i + 1`.

---

**## Example**

```text
Input:

4
1 1 2 1

Output:

3

## Complexity Analysis

Time Complexity : O(n)

Space Complexity: O(n)

## Concepts Learned

- Arrays

- Linear Search

- Conditional Statements

- Pattern Recognition

- 1-Based Indexing

## Problem Link

https://codeforces.com/problemset/problem/1512/A