<div align="center">

**# 1927. Sum Game**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

Alice and Bob take turns playing a game with Alice starting first.

You are given a string `num` of even length consisting of digits and `?` characters.

On each turn, a player chooses a `?` and replaces it with a digit from `0` to `9`.

The game ends when there are no more `?` characters.

Bob wins if the sum of the digits in the first half of `num` is equal to the sum of the digits in the second half.

Alice wins if the two sums are not equal.

Assuming both players play optimally, return `true` if Alice will win and `false` if Bob will win.

---

**## My Approach**

**### Idea**

- Divide the string into two equal halves.
- Calculate the difference between the digit sums of the two halves.
- For every `?`, consider its expected value.
- Since the digits `0` to `9` have an average value of `4.5`, each `?` contributes `4.5` to its respective half.
- Add the expected values from the first half and subtract those from the second half.
- If the final difference is not `0`, Alice can force the two sums to be different.
- If the difference is `0`, Bob can make the sums equal.
- Therefore, return `true` when the calculated difference is not zero.

---

**## Complexity Analysis**

```text
Time Complexity : O(n)
Space Complexity: O(1)