<div align="center">

# 3718. Smallest Missing Multiple of K

**Platform:** LeetCode  
**Difficulty:** 🟢 Easy  
**Status:** ✅ Accepted

</div>

## 📝 Problem Statement

Given an integer array `nums` and an integer `k`, return the smallest positive multiple of `k` that is missing from `nums`.

A multiple of `k` is any positive integer that is divisible by `k`.

## 💡 My Approach

### Idea

- Store all elements of `nums` in a `HashSet`.
- Start checking from the first positive multiple of `k`, which is `k`.
- If the current multiple is present in the set, move to the next multiple by adding `k`.
- Continue until a multiple is not present in the set.
- Return that missing multiple.

Using a `HashSet` allows efficient checking of whether a particular multiple exists in the array.

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n + m)`
- **Space Complexity:** `O(n)`

Where `n` is the number of elements in `nums` and `m` is the number of multiples of `k` checked.

## 📚 Concepts Learned

- HashSet
- Array traversal
- Multiples and divisibility
- Searching for missing values
- Efficient membership checking

## ⚡ Performance

- **Verdict:** Accepted ✅
- **Language:** Java
- **Runtime:** 2 ms
- **Memory:** 45.42 MB
- **Runtime Beats:** 68.20%
- **Memory Beats:** 38.11%

## 📝 Notes

The key idea is to check only the multiples of `k` rather than every positive integer.

For example:

`nums = [8, 2, 3, 4, 6]` and `k = 2`

The multiples of `2` are:

`2, 4, 6, 8, 10, ...`

Since `2`, `4`, `6`, and `8` are present, the smallest missing multiple is `10`.