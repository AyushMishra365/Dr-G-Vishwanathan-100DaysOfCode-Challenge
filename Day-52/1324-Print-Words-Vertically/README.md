<div align="center">

# 1324. Print Words Vertically

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a sentence, print its words vertically while removing trailing spaces from every generated string.

---

## My Approach

### Idea

- Split the sentence into individual words.
- Find the maximum word length.
- Traverse column by column across all words.
- Append a space when a word has no character in the current column.
- Remove trailing spaces before storing the final vertical string.

---

## Complexity Analysis

```text
Time Complexity : O(n × m)

Space Complexity: O(n × m)
```

---

## Concepts Learned

- String Manipulation
- Matrix-like Traversal
- StringBuilder
- Trimming Trailing Spaces

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 91.77%

Memory : 43.37 MB

Beats : 22.78%
```

---

## Notes

Treating the words like rows of a matrix and traversing column-wise makes the implementation simple and easy to understand.