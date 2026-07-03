<div align="center">

# B. Drinks

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-800-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

There are `n` drinks, each containing a certain percentage of orange juice.

Equal amounts of every drink are mixed together.

Find the percentage of orange juice in the final mixture.

---

## My Approach

### Idea

Since equal quantities of every drink are mixed, the final concentration is simply the average of all percentages.

### Steps

1. Read the percentage of each drink.
2. Compute their total.
3. Divide by the number of drinks.
4. Print the result as a floating-point value.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Mathematics
- Average Calculation
- Simulation

---

## Performance

```text
Verdict : Accepted

Runtime : 562 ms

Memory : 2108 KB
```

---

## Notes

A straightforward mathematical observation replaces any need for simulating the mixing process, making the solution both simple and efficient.