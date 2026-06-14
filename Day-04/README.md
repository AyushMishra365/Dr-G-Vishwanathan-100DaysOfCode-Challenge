# Day 04

## Platform

- LeetCode

## Problems Solved

- [179. Largest Number](./179-Largest-Number)

## Key Concepts

- Sorting
- Custom Comparators
- Strings
- Greedy Ordering

## Takeaways

- Learned that the natural ordering of numbers is not always the correct ordering for a problem.
- Understood how defining the right comparison logic can completely change the solution.
- Practiced converting numerical problems into string-based comparisons.
- Reinforced the idea that some problems are solved by finding the correct way to compare elements rather than by using a complex algorithm.

---

### Problems Overview

#### 179. Largest Number

A sorting problem where the objective is to arrange a list of non-negative integers such that their concatenation forms the largest possible number.

**My Approach**

- Converted each number into its string representation.
- Compared two possible arrangements of every pair of numbers:
  
  - `ab`
  - `ba`

- Determined the ordering based on which concatenation produced the larger value.
- Sorted the elements according to this custom comparison logic.
- Joined all the strings together to form the final answer.

**Why This Problem Was Interesting**

At first glance, it appears to be a simple sorting problem. However, comparing numbers directly does not produce the correct result.

For example:

```text
9, 34
```

Normal sorting would place them as:

```text
34, 9
```

But comparing:

```text
934
349
```

shows that placing `9` before `34` creates the larger number.

This observation forms the entire foundation of the solution.

**Complexity**

- Time Complexity: O(n² × k)
- Space Complexity: O(n × k)

where:

- n = number of elements
- k = average number of digits per number

---

Day 4 ✅

Today's problem was a reminder that solving DSA problems is not always about learning a new algorithm. Sometimes the challenge lies in identifying the correct way to model and compare data before implementation begins.
