# Day 19

## Platform

- Codeforces
- LeetCode

## Problems Solved

- [160A. Twins](./160A-Twins)
- [155A. I_love_%username%](./155A-I-love-username)
- [122. Best Time to Buy and Sell Stock II](./122-Best-Time-to-Buy-and-Sell-Stock-II)
- [55. Jump Game](./55-Jump-Game)

## Key Concepts

- Greedy
- Arrays
- Sorting
- Simulation
- Dynamic Reachability
- Observation

## Takeaways

- Day 19 was heavily focused on Greedy thinking.
- Twins showed how taking the largest values first can immediately lead to an optimal solution.
- I_love_%username% reinforced tracking running minimums and maximums efficiently.
- Best Time to Buy and Sell Stock II demonstrated how local profitable decisions combine into the global optimum.
- Jump Game was particularly interesting because it looked like a DP problem initially, but a greedy reachability approach solved it efficiently.

---

### Problems Overview

#### 160A. Twins

Used sorting and greedily picked the largest coins until my share became strictly greater than the remaining sum.

#### 155A. I_love_%username%

Tracked the current maximum and minimum scores and counted every time a new record was broken.

#### 122. Best Time to Buy and Sell Stock II

Added every positive price difference between consecutive days to maximize total profit.

#### 55. Jump Game

Maintained the farthest reachable index while traversing the array and checked whether every position remained reachable.

---

### Why Today Was Important

Today's problems reinforced one of the most common competitive programming themes: Greedy algorithms. Understanding why a locally optimal decision leads to a globally optimal solution is becoming much more intuitive with practice.

---

Day 19 ✅

Nineteen days into the challenge, and Greedy algorithms are starting to appear everywhere. The more problems I solve, the easier it becomes to identify when a simple observation can replace a more complicated solution.