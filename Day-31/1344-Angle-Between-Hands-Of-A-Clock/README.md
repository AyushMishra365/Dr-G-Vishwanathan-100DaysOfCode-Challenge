<div align="center">

# 1344. Angle Between Hands of a Clock

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given the current hour and minutes on an analog clock, return the smaller angle formed between the hour hand and the minute hand.

---

## My Approach

### Idea

Compute the angle made by each hand independently.

- Minute hand moves **6° per minute**.
- Hour hand moves **30° per hour** and **0.5° per minute**.

Find the absolute difference between the two angles and return the smaller of that value and `360° − difference`.

### Steps

1. Compute the minute hand angle.
2. Compute the hour hand angle.
3. Find the absolute difference.
4. Return the smaller possible angle.

---

## Complexity Analysis

```text
Time Complexity : O(1)

Space Complexity: O(1)
```

---

## Concepts Learned

- Clock Geometry
- Mathematical Formulas
- Angle Calculation

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 44.68 MB

Beats : 90.47%
```

---

## Notes

Instead of simulating the movement of the hands, directly computing their positions using mathematical formulas results in a simple and constant-time solution.