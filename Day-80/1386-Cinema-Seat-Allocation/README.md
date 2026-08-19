<div align="center">

**# 1386. Cinema Seat Allocation**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

A cinema has `n` rows of seats, with each row containing 10 seats numbered from `1` to `10`.

You are given a 2D integer array `reservedSeats`, where `reservedSeats[i] = [row, seat]` means that the specified seat is already reserved.

A four-person family must be assigned to four seats in the same row.

A family can be seated in one of the following blocks:

- Seats `2, 3, 4, 5`
- Seats `4, 5, 6, 7`
- Seats `6, 7, 8, 9`

A block can only be used if none of its seats are reserved.

Return the maximum number of four-person families that can be seated.

---

**## My Approach**

**### Idea**

- Use a `HashMap` to store the reserved seats for each row.
- For every reserved seat, mark its seat number as `true` in a boolean array.
- Initially assume that every row can accommodate two families.
- For rows with reserved seats:
  - Check whether seats `2–5` are available.
  - Check whether seats `6–9` are available.
  - If both blocks are available, two families can be seated.
  - If either block is available, one family can be seated.
  - If neither block is available, check whether the middle block `4–7` can accommodate one family.
- Rows that do not appear in the `HashMap` have no reserved seats, so they can accommodate two families.
- Add the maximum possible families from every row to obtain the final answer.

---

**## Complexity Analysis**

```text
Time Complexity : O(m)
Space Complexity : O(m)