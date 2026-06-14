# Day 03

## Platform
 
- Leetcode 

## Problems Solved

- 58. Length of Last Word
- 125. Valid Palindrome
- 1616. Split Two Strings to Make Palindrome

## Key Concepts

- Strings
- String Traversal
- Palindrome Validation
- Pattern Recognition

## Takeaways

- Focused entirely on strengthening string manipulation fundamentals.
- Learned how simple string operations can solve problems efficiently without relying on complex data structures.
- Practiced handling non-alphanumeric characters while validating palindromes.
- Understood how palindrome properties can be used to simplify seemingly difficult string problems.

---

### Problems Overview

#### 58. Length of Last Word

A string traversal problem that requires finding the length of the final word in a sentence.

**My Approach**

- Removed leading and trailing spaces using `trim()`.
- Traversed the string from the end.
- Counted characters until the first space was encountered.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

#### 125. Valid Palindrome

A palindrome problem where non-alphanumeric characters must be ignored during comparison.

**My Approach**

- Compared characters from both ends of the string.
- Ignored non-alphanumeric characters.
- Converted characters to lowercase before comparison.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

#### 1616. Split Two Strings to Make Palindrome

A string problem that involves determining whether splitting two strings at some position can form a palindrome.

**My Approach**

- Compared characters from opposite ends of both strings.
- Continued while matching characters existed.
- Once a mismatch occurred, checked whether the remaining substring itself formed a palindrome.

**Complexity**

- Time Complexity: O(n)
- Space Complexity: O(1)

---

Day 3 ✅
