# Day 08

## Platform

- LeetCode

## Problems Solved

- [925. Long Pressed Name](./925-Long-Pressed-Name)

## Key Concepts

- Strings
- Two Pointers
- Character Matching
- Edge Case Handling

## Takeaways

- Learned how the Two Pointer technique can simplify string comparison problems.
- Practiced handling repeated characters and validating whether they form a valid pattern.
- Reinforced the importance of carefully considering edge cases before finalizing a solution.
- Understood that many string problems are less about complex algorithms and more about maintaining the correct traversal logic.

---

### Problems Overview

#### 925. Long Pressed Name

A string problem that requires determining whether a typed string could have been produced from the original name if some keys were accidentally long-pressed.

**My Approach**

- Used two pointers to traverse both strings simultaneously.
- Compared characters at each position and advanced pointers whenever a valid match was found.
- Allowed extra repeated characters in the typed string only when they could be explained as a valid long press of the previous character.
- Verified that all characters from the original name were successfully matched.

**What I Learned**

At first glance, the problem looked fairly simple. However, most of the challenge came from handling different edge cases involving repeated characters.

The key idea was realizing that every extra character in the typed string must be justified by a previous matching character. Once that condition was handled correctly, the solution became much more straightforward.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

### Why Today Was Important

Today's problem was a good reminder that not every DSA question requires advanced data structures or complex algorithms.

Sometimes a carefully designed traversal strategy is enough to solve the problem efficiently.

It also reinforced the importance of testing solutions against unusual inputs, since string problems often fail due to overlooked edge cases rather than incorrect core logic.

---

Day 8 ✅

Today's biggest takeaway was that understanding how to move pointers correctly can often be more important than the implementation itself. Small mistakes in traversal logic can completely change the outcome of a solution.
