# Day 25

## Platform

- LeetCode

## Problems Solved

- [1835. Find XOR Sum of All Pairs Bitwise AND](./1835-Find-XOR-Sum-of-All-Pairs-Bitwise-AND)
- [89. Gray Code](./89-Gray-Code)

## Key Concepts

- Bit Manipulation
- XOR Properties
- Gray Code Generation
- Mathematical Observations
- Pattern Recognition

## Takeaways

- XOR has several powerful distributive properties that can transform seemingly expensive computations into simple operations.
- Many hard bit manipulation problems become manageable once the underlying bitwise identities are discovered.
- Gray Code can be generated directly using a mathematical formula instead of recursion or backtracking.
- Learning standard bit tricks helps solve complex problems with very little code.

---

### Problems Overview

#### 1835. Find XOR Sum of All Pairs Bitwise AND

A challenging bit manipulation problem where generating all possible pairs is unnecessary.

Using the identity:

```text
(a1 ⊕ a2 ⊕ ... ⊕ an) & (b1 ⊕ b2 ⊕ ... ⊕ bm)
```

directly gives the XOR sum of all pairwise AND values.

---

#### 89. Gray Code

Generate an n-bit Gray Code sequence.

The key formula:

```text
Gray(i) = i ^ (i >> 1)
```

produces a valid Gray Code number for every integer `i`.

---

## Concepts Practiced

- XOR Algebra
- Bitwise AND
- Gray Code Construction
- Binary Representation
- Mathematical Optimization

---

### Why Today Was Important

Day 25 was heavily focused on bit manipulation and mathematical patterns. Both problems reinforced the idea that understanding properties of binary operations is often more valuable than brute-force computation.

---

Day 25 ✅

A rewarding day of bit manipulation. One problem required discovering a powerful XOR identity, while the other introduced the elegant Gray Code formula that generates an entire sequence with a single expression.