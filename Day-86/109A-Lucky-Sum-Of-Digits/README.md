<div align="center">

# A. Lucky Sum of Digits

**Platform:** Codeforces  
**Difficulty:** ⭐ Easy  
**Status:** ✅ Accepted

</div>

## 📝 Problem Statement

Given an integer `n`, find the minimum lucky number whose digits have a sum equal to `n`.

A lucky number can contain only the digits `4` and `7`.

If no such lucky number exists, print `-1`.

## 💡 My Approach

### Idea

- Since every digit of a lucky number is either `4` or `7`, represent the required digit sum as a combination of `4`s and `7`s.
- Start with the maximum possible number of `7`s using `n / 7`.
- Check whether the remaining value is divisible by `4`.
- If it is, construct the answer using the required number of `4`s followed by `7`s.
- If not, decrease the number of `7`s and try again.
- If no valid combination is found, print `-1`.

This approach also produces the minimum lucky number because it uses the largest possible number of `4`s in the valid combination.

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

## 📚 Concepts Learned

- Mathematical problem solving
- Divisibility
- Greedy approach
- Loops
- Constructing numbers using digits

## ⚡ Performance

- **Verdict:** Accepted ✅
- **Language:** Java 21
- **Runtime:** 750 ms
- **Memory:** 2228 KB

## 📝 Notes

The key observation is that the required sum must be represented using only `4` and `7`.

So we search for:

`4 × fours + 7 × sevens = n`

If such a combination exists, the corresponding lucky number can be constructed; otherwise the answer is `-1`.