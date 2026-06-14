# 136. Single Number

## Platform

- LeetCode

## Problem Statement

Given a non-empty array of integers where every element appears twice except for one, find the single one.

## Approach

- Initialized the result as `0`.
- XORed every number with the result.
- Since equal numbers cancel out using XOR, the remaining value is the single number.

## Problem Link

https://leetcode.com/problems/single-number/
