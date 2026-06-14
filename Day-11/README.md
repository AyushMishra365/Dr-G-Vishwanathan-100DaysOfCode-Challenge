# Day 11

## Platform

- Codeforces
- LeetCode

## Problems Solved

- 208A. Dubstep
- 392. Is Subsequence
- 14. Longest Common Prefix

## Key Concepts

- Strings
- String Manipulation
- Pattern Recognition
- Prefix Matching

## Takeaways

- Today's problems were mostly based on simple string operations and pattern identification.
- Reinforced how powerful built-in string methods can be when used appropriately.
- Practiced extracting patterns from strings rather than relying on complex algorithms.
- Continued building confidence in solving string-related problems efficiently.

---

### Problems Overview

#### 208A. Dubstep

A string manipulation problem involving removal of extra separator patterns.

**My Approach**

- Replaced every occurrence of `"WUB"` with spaces.
- Trimmed the resulting string.
- Reconstructed the original sequence of words.

**What I Learned**

This problem showed how a simple observation combined with built-in string operations can lead to a very clean solution.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(n)

---

#### 392. Is Subsequence

A problem that checks whether one string appears within another while maintaining character order.

**My Approach**

- Traversed the larger string while searching for characters of the smaller string in order.
- Continued matching characters until either the entire string was found or traversal ended.

**What I Learned**

The problem reinforced the importance of maintaining relative order while processing strings and highlighted how a straightforward traversal can solve the problem efficiently.

**Complexity**

- Time Complexity: O(n × m)
- Space Complexity: O(n)

---

#### 14. Longest Common Prefix

A string problem focused on finding the common starting characters shared by multiple strings.

**My Approach**

- Started with the first string as the candidate prefix.
- Repeatedly shortened the prefix until every string began with it.
- Returned the remaining common prefix.

**What I Learned**

Instead of building a solution from scratch, gradually narrowing down a candidate answer often leads to a simpler implementation.

**Complexity**

- Time Complexity: O(n × m)
- Space Complexity: O(1)

---

### Why Today Was Important

Today's problems were relatively straightforward, but they demonstrated how many string problems can be solved using simple logic once the underlying pattern is identified.

Problems that once felt difficult are now becoming much more approachable due to consistent practice and repeated exposure to common string techniques.

It was also a good reminder that writing clean solutions using existing language features can often be just as important as learning new algorithms.

---

Day 11 ✅

Today's biggest takeaway was that consistency is slowly turning familiar concepts into instincts. Many string patterns that previously required significant effort now feel much more natural to identify and implement.
