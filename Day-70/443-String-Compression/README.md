# 443. String Compression

## Problem Statement

Given an array of characters `chars`, compress it using the given algorithm.

For each group of consecutive repeating characters:

- If the group's length is `1`, append only the character.
- Otherwise, append the character followed by the group's length.

The compressed string must be stored directly in the input array.

Return the new length of the array.

## Approach

I used two indices:

- `i` to traverse the array and find groups of consecutive characters.
- `index` to store the compressed result in-place.

For every group:

1. Store the current character.
2. Count how many times it occurs consecutively.
3. Place the character at `chars[index]`.
4. If the count is greater than `1`, convert the count into characters and store each digit in the array.
5. Continue processing the next group.

This allows the array to be compressed without using another array.

## Complexity Analysis

- Time Complexity: O(n)
- Space Complexity: O(1)

## Key Takeaway

The important part of this problem is using separate read and write positions so that the compressed result can be stored directly inside the original array while using constant extra space.