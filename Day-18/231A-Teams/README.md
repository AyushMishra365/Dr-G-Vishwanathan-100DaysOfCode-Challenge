<div align="center">

# 231A. Team

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-success)
![Topic](https://img.shields.io/badge/Topic-Implementation-green)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Three friends:

```text
Petya
Vasya
Tonya
```

will solve a problem only if at least two of them are confident about the solution.

Given their opinions for multiple problems, determine how many problems they will solve.

---

## Example

### Input

```text
3
1 1 0
1 1 1
1 0 0
```

### Output

```text
2
```

---

## Explanation

For the first two problems, at least two team members are confident.

For the third problem, only one member is confident.

Therefore:

```text
Answer = 2
```

---

## My Approach

### Key Observation

Each problem contains three values:

```text
0 or 1
```

representing whether a team member is confident.

If:

```text
a + b + c >= 2
```

then the team will attempt the problem.

So for every problem:

- Calculate the sum.
- If the sum is at least two, increment the answer.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Counting
- Conditional Logic
- Implementation

---

## Problem Link

https://codeforces.com/problemset/problem/231/A