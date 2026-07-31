<div align="center">

# 3016. Minimum Number of Pushes to Type Word II

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a string `word` consisting of lowercase English letters, remap the letters to the keys on a telephone keypad such that the total number of key presses required to type the word is minimized.

Return the minimum number of pushes needed.

---

## My Approach

### Idea

- Count the frequency of each character in the word.
- Sort the frequencies in ascending order.
- Traverse the frequencies from highest to lowest.
- Assign the most frequent characters to positions requiring the fewest key presses:
  - First 8 letters → 1 push
  - Next 8 letters → 2 pushes
  - Next 8 letters → 3 pushes
  - Remaining letters → 4 pushes
- Multiply each frequency by its assigned push count and accumulate the answer.

---

## Complexity Analysis

```text
Time Complexity : O(n + 26 log 26)

Space Complexity: O(26)
```

---

## Concepts Learned

- Frequency Counting
- Greedy Algorithm
- Sorting
- Array Manipulation

---

## Performance

```text
Runtime : 9 ms (Beats 94.22%)

Memory  : 47.99 MB (Beats 73.70%)
```

---

## Notes

The optimal strategy is greedy: assign the most frequently occurring characters to the positions requiring the fewest pushes. Since there are only 26 lowercase letters, sorting the frequency array is effectively constant time.