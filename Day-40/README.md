# Day 40

## Platform

- LeetCode

## Problems Solved

- [383. Ransom Note](./383-Ransom-Note)
- [434. Number of Segments in a String](./434-Number-of-Segments-in-a-String)

## Key Concepts

- Frequency Array
- Character Counting
- String Traversal
- Pattern Recognition

## Takeaways

- Practiced solving string problems efficiently using character frequency arrays.
- Learned how identifying the start of each word can solve string parsing problems in a single pass.
- Reinforced that many string problems can be solved without using extra library functions like `split()` or `trim()`.

---

### Problem Overview

#### 383. Ransom Note

Used a frequency array of size 26 to count characters in the magazine. Then traversed the ransom note, decrementing the corresponding frequency. If any frequency became negative, constructing the ransom note was impossible.

#### 434. Number of Segments in a String

Traversed the string once and counted every character that represented the beginning of a new word. A new segment starts when the current character is not a space and either it is the first character or the previous character is a space.

---

## Concepts Practiced

- Arrays
- Strings
- Character Frequency
- Linear Traversal

---

### Why Today Was Important

Today's problems emphasized simple but powerful linear traversal techniques. Instead of relying on built-in methods, both solutions achieved optimal performance through careful observation of character patterns.

---

Day 40 ✅

Another day focused on strengthening string manipulation fundamentals.