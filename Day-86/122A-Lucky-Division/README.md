<div align="center">

# A. Lucky Division

**Platform:** Codeforces  
**Difficulty:** ⭐ Easy  
**Status:** ✅ Accepted

</div>

## 📝 Problem Statement

A lucky number is a positive integer whose decimal representation contains only the digits `4` and `7`.

A number is called almost lucky if it is divisible by at least one lucky number.

Given an integer `n`, determine whether it is almost lucky.

## 💡 My Approach

### Idea

- Start checking lucky numbers from `4` up to `n`.
- For every number, check whether all of its digits are either `4` or `7`.
- If the number is lucky and `n` is divisible by it, print `"YES"`.
- If no such lucky number is found, print `"NO"`.

The helper method `isLucky()` checks each digit using `% 10` and `/ 10`.

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n log n)`
- **Space Complexity:** `O(1)`

## 📚 Concepts Learned

- Digit extraction
- Divisibility
- Helper methods
- Loops and conditions
- Mathematical number checking

## ⚡ Performance

- **Verdict:** Accepted ✅
- **Language:** Java 21
- **Runtime:** 562 ms
- **Memory:** 848 KB

## 📝 Notes

A number is lucky only when every digit is either `4` or `7`.

For example:

- `47` → Lucky
- `744` → Lucky
- `467` → Not Lucky
- `17` → Not Lucky