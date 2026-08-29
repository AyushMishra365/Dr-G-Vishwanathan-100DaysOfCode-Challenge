**# Day 90**

**## Platform**

\- Codeforces

\- LeetCode

**## Problems Solved**

\- [1512A. Spy Detected!]\(./1512A-Spy-Detected)

\- [489B. BerSU Ball]\(./489B-BerSU-Ball)

\- [2615. Sum of Distances]\(./2615-Sum-of-Distances)

**## Key Concepts**

\- Arrays

\- Sorting

\- Two Pointers

\- Greedy

\- Hashing

\- Grouping

\- Index Manipulation

\- Prefix Sum

**## Takeaways**

\- Today's problems focused on Arrays, Sorting, Two Pointers, and efficient index-based calculations.

\- Learned how comparing the first few elements can quickly identify an outlier in an array.

\- Reinforced the Two Pointer technique after sorting two arrays.

\- Practiced grouping equal elements and calculating distances efficiently using index sums.

\- Continued improving the ability to replace brute-force solutions with optimized approaches.

\---

**### Problems Overview**

**#### 1512A. Spy Detected!**

An array problem where all elements are equal except one, and the goal is to find the index of the different element.

**\*\*My Approach\*\***

\- Compared the first three elements to determine the common value.

\- Traversed the array and found the element that does not match the common value.

\- Printed its 1-based index.

**\*\*What I Learned\*\***

A small observation about the first three elements is enough to determine which value is common and which one is different.

**\*\*Complexity\*\***

\- Time Complexity: O(n)

\- Space Complexity: O(n)

\---

**#### 489B. BerSU Ball**

A sorting and Two Pointer problem where boys and girls need to be paired such that their dancing skills differ by at most one.

**\*\*My Approach\*\***

\- Sorted both the boys' and girls' skill arrays.

\- Used two pointers to compare the current boy and girl.

\- If their skill difference was at most one, formed a pair and moved both pointers.

\- Otherwise, moved the pointer pointing to the smaller skill.

**\*\*What I Learned\*\***

Sorting combined with Two Pointers can efficiently solve matching problems where elements need to satisfy a range-based condition.

**\*\*Complexity\*\***

\- Time Complexity: O(n log n + m log m)

\- Space Complexity: O(1)

\---

**#### 2615. Sum of Distances**

An array problem where for every index, the sum of distances to all other indices containing the same value must be calculated.

**\*\*My Approach\*\***

\- Stored every number along with its original index.

\- Sorted the pairs based on their values.

\- Grouped equal values together.

\- Calculated the sum of indices for each group.

\- Used the grouped indices to calculate the required distance for every original position.

**\*\*What I Learned\*\***

Grouping equal elements and working with their indices can avoid repeatedly comparing every pair and makes distance calculations much more efficient.

**\*\*Complexity\*\***

\- Time Complexity: O(n log n)

\- Space Complexity: O(n)

\---

**### Why Today Was Important**

Today's problems gave me more practice with different ways of processing arrays efficiently.

Spy Detected! showed how a simple observation can solve an array problem quickly, while BerSU Ball reinforced the importance of sorting and Two Pointers. Sum of Distances introduced another useful pattern of grouping equal values and working with their indices.

\---

Day 90 ✅

Ninety days into the challenge, and the focus is increasingly shifting toward recognizing patterns instead of directly jumping into brute force. Looking forward to completing the final ten days and strengthening these DSA fundamentals even further.