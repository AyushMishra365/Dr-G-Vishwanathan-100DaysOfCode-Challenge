# Day 24

## Platform

- Codeforces

## Problems Solved

- [551A. GukiZ and Contest](./551A-GukiZ-and-Contest)

## Key Concepts

- Implementation
- Ranking Systems
- Nested Loops
- Array Traversal

## Takeaways

- Ranking problems can often be solved directly without sorting if constraints are small.
- Comparing every participant against all others is a straightforward way to determine ranks.
- Equal ratings should receive the same rank, which naturally follows from counting strictly greater values.
- Always pay attention to the exact ranking definition provided in the problem statement.

---

### Problems Overview

#### 551A. GukiZ and Contest

Given the ratings of contest participants, determine each participant's final rank based on how many students have a strictly higher rating.

The solution compares each student's rating with every other student's rating and counts how many ratings are greater. The final rank becomes:

```text
1 + Number of students with a higher rating
```

---

## Concepts Practiced

- Brute Force Comparison
- Ranking Logic
- Arrays
- Competitive Programming Implementation

---

### Why Today Was Important

Day 24 focused on translating a ranking definition directly into code. Problems like this reinforce careful reading of problem statements and building solutions from the given rules rather than searching for complicated algorithms.

---

Day 24 ✅

A shorter implementation-focused day. It was a good reminder that not every problem requires advanced data structures—sometimes a direct approach is the cleanest and most reliable solution.
