# 1328. Break a Palindrome

## Platform

- LeetCode

## Problem Statement

Given a palindromic string, replace exactly one character so that the resulting string is not a palindrome and is lexicographically smallest.

If it is impossible, return an empty string.

## Approach

- If the string length is `1`, returned an empty string.
- Checked only the first half of the string.
- Replaced the first non-`a` character with `a`.
- If all first-half characters were `a`, changed the last character to `b`.

## Problem Link

https://leetcode.com/problems/break-a-palindrome/
