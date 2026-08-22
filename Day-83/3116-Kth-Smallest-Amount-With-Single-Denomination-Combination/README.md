<div align="center">

**# 3116. Kth Smallest Amount With Single Denomination Combination**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

You are given an integer array `coins` representing coins of different denominations and an integer `k`.

You have an infinite number of coins of each denomination. However, you are **not allowed to combine coins of different denominations**.

Return the `k`th smallest amount that can be made using these coins.

---

**## My Approach**

**### Idea**

- Use binary search to find the `k`th smallest valid amount.
- Start with `low = 1` and gradually increase `high` until the number of valid amounts up to `high` is at least `k`.
- For a given value `x`, count how many amounts can be formed using each denomination.
- For every coin, the number of possible amounts up to `x` is `x / coin`.
- Use this count to determine which side of the binary search contains the answer.
- If the count is at least `k`, move `high` to `mid`; otherwise, move `low` to `mid + 1`.
- The final value of `low` is the `k`th smallest amount.

---

**## Complexity Analysis**

```text
Time Complexity : O(m × log(max))
Space Complexity : O(1)