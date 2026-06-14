# Day 14

## Platform

- Codeforces
- LeetCode

## Problems Solved

- 320A. Magic Numbers
- 13. Roman to Integer

## Key Concepts

- Strings
- Pattern Matching
- Greedy
- String Traversal
- Number Conversion

## Takeaways

- Today's problems focused on string processing and pattern recognition.
- Learned how greedy pattern matching can simplify validation problems.
- Practiced processing strings in different directions depending on the problem requirements.
- Continued improving observation skills and implementation accuracy.

---

### Problems Overview

#### 320A. Magic Numbers

A pattern validation problem based on specific allowed string formations.

**My Approach**

- Traversed the string greedily.
- Tried to match the longest valid pattern first:

```text
144
14
1
```

- Rejected the number immediately when no valid pattern matched.

**What I Learned**

Greedy approaches work extremely well when the valid patterns are clearly defined and can be processed incrementally.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

#### 13. Roman to Integer

A string conversion problem involving Roman numeral rules.

**My Approach**

- Traversed the string from right to left.
- Added values normally.
- Subtracted when a smaller numeral appeared before a larger numeral.

**What I Learned**

Processing from right to left greatly simplifies handling subtraction cases such as:

```text
IV
IX
XL
XC
CD
CM
```

and avoids unnecessary condition checks.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

### Why Today Was Important

Today's problems highlighted how choosing the right strategy can simplify implementation significantly.

Magic Numbers demonstrated how a greedy approach can naturally fit pattern-validation problems, while Roman to Integer showed that selecting the correct traversal direction can eliminate much of the complexity.

These small observations often make the difference between a complicated solution and a clean one.

---

Day 14 ✅

Two weeks into the challenge, and I'm starting to notice recurring patterns across problems. The more problems I solve, the easier it becomes to recognize which technique fits a particular situation. Looking forward to learning more patterns and improving problem-solving speed tomorrow.
