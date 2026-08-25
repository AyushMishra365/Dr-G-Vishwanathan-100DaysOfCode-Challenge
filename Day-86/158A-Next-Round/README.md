<div align="center">

# A. Next Round

**Platform:** Codeforces  
**Difficulty:** ⭐ Easy  
**Status:** ✅ Accepted

</div>

## 📝 Problem Statement

Given `n` participants and their scores, determine how many participants will advance to the next round.

A participant advances if their score is greater than or equal to the score of the participant who finished in the `k`-th position, and their score must be positive.

## 💡 My Approach

### Idea

- Store all participant scores in an array.
- Find the score of the participant at the `k`-th position using `players[k-1]`.
- Traverse the complete array.
- Count every participant whose score is greater than or equal to this score and is greater than `0`.
- Print the final count.

This directly follows the conditions given in the problem.

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

## 📚 Concepts Learned

- Array traversal
- Array indexing
- Conditional statements
- Handling threshold-based conditions

## ⚡ Performance

- **Verdict:** Accepted ✅
- **Language:** Java 21
- **Runtime:** 656 ms
- **Memory:** 1140 KB

## 📝 Notes

The important condition is:

`players[i] >= players[k-1] && players[i] > 0`

The positive-score check is necessary because participants with a score of `0` cannot advance.