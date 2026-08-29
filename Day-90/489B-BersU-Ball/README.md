**# 489B. BerSU Ball**

---

**## Problem Statement**

You are given the dancing skills of `n` boys and `m` girls.

A boy and a girl can form a pair if the difference between their dancing skills is **at most 1**.

Find the maximum possible number of pairs that can be formed.

Each boy and girl can participate in at most one pair.

---

**## My Approach**

I first sorted both the boys' and girls' skill arrays.

Then I used **two pointers** to find the maximum number of valid pairs.

\- If the absolute difference between the current boy's and girl's skills is at most `1`, I formed a pair and moved both pointers forward.

\- If the boy's skill was smaller than the girl's skill, I moved the boy pointer forward because that boy could not pair with the current or any smaller girl.

\- Otherwise, I moved the girl pointer forward.

This greedy approach ensures that whenever a valid pair is possible, it is formed immediately.

---

**## Example**

```text
Input:

4
1 4 6 2
5
5 1 5 7 9

Output:

3

## Complexity Analysis

Time Complexity : O(n log n + m log m)

Space Complexity: O(1)

The sorting operations take O(n log n + m log m), while the two-pointer traversal takes O(n + m).

## Concepts Learned

- Arrays

- Sorting

- Two Pointers

- Greedy Algorithm

- Absolute Difference

- Pair Matching

## Problem Link

https://codeforces.com/problemset/problem/489/B