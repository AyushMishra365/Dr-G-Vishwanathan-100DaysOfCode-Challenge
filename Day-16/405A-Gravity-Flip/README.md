<div align="center">

# 405A. Gravity Flip

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-1000-success)
![Topic](https://img.shields.io/badge/Topic-Sorting-purple)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Little Chris has several columns of cubes.

After gravity is applied, the cubes fall to the right side, changing the arrangement of the columns.

Determine the final heights of the columns after gravity acts on them.

---

## Example

### Input

```text
4
3 2 1 2
```

### Output

```text
1 2 2 3
```

---

## Explanation

Initial arrangement:

```text
3 2 1 2
```

After gravity acts:

```text
1 2 2 3
```

The columns become arranged in non-decreasing order.

---

## Constraints

```text
1 ≤ n ≤ 100

1 ≤ height ≤ 100
```

---

## My Approach

### Key Observation

Instead of simulating every cube falling individually, observe what the final arrangement looks like after gravity acts.

The resulting column heights are simply the sorted version of the original array.

Example:

```text
3 2 1 2
↓
1 2 2 3
```

So the problem reduces to sorting.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Arrays
- Sorting
- Simulation
- Observation-Based Problem Solving

---

## Problem Link

https://codeforces.com/problemset/problem/405/A