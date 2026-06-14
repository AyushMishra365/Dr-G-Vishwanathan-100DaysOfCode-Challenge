# Day 06

## Platform

- LeetCode

## Problems Solved

- 848. Shifting Letters

## Key Concepts

- Strings
- Prefix/Suffix Thinking
- Cumulative Computation
- Modulo Arithmetic

## Takeaways

- Today's problem took significantly more time than most of the problems I had solved in the previous few days.
- Spent a considerable amount of time debugging incorrect approaches and understanding the underlying pattern.
- Learned how cumulative calculations can simplify what initially appears to be a complex simulation problem.
- Reinforced the importance of stepping back and analyzing the pattern instead of repeatedly modifying a flawed approach.

---

### Problems Overview

#### 848. Shifting Letters

A string manipulation problem where each character must be shifted based on the cumulative effect of multiple shift operations.

**My Approach**

- Calculated the total shift value affecting each character.
- Maintained a running cumulative shift while traversing the string.
- Used modulo arithmetic to handle circular alphabet transitions (`z → a`).
- Updated the remaining shift after processing each position.

**What I Learned**

My initial approaches either produced incorrect results or failed to handle larger shift values properly.

The key observation was realizing that applying every shift operation individually was unnecessary. Instead, tracking the cumulative shift allowed the entire problem to be solved efficiently in a single traversal.

Once that pattern became clear, the implementation itself was fairly straightforward.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(n)

---

### Why Today Was Important

Unlike some of the previous days where the challenge was mainly implementation, today's difficulty came from identifying the correct pattern.

A large portion of the time was spent understanding why certain approaches failed and refining the solution until it handled all cases correctly.

Although it was only one problem, it ended up being one of the most educational days so far because most of the learning came from debugging, experimenting, and understanding the logic behind the solution.

---

Day 6 ✅

Today's biggest takeaway was that struggling with a problem is often where the most learning happens. Finding the right observation can turn a difficult problem into a relatively simple implementation.
