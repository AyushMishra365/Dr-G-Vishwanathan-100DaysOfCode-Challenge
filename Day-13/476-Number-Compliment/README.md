# 476. Number Complement

## Platform

- LeetCode

## Problem Statement

Given a positive integer, return its complement by flipping all bits in its binary representation.

## Approach

- Created a mask containing all `1`s up to the highest bit of the number.
- XORed the number with the mask to flip only the required bits.

## Problem Link

https://leetcode.com/problems/number-complement/
