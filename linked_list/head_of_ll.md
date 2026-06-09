# Detect Starting Node of Cycle in Linked List

## Problem
Given the head of a linked list, return the node where the cycle begins.
If there is no cycle, return null.

---

## Brute Force Approach (Hashing)

### Idea
Traverse the linked list while storing every visited node in a HashSet.

For every node:
- If it already exists in the HashSet, return it.
- Otherwise, add it to the HashSet and continue.

If traversal reaches null, return null.

---

## First Principle Thinking

Question:
How do we know we've visited a node before?

Answer:
The computer cannot remember unless we store it.
Therefore, maintain a collection of visited nodes.

---

## Algorithm

1. Create an empty HashSet.
2. Set `temp = head`.
3. While `temp != null`:
   - If `temp` is already in the HashSet, return `temp`.
   - Otherwise, add `temp` to the HashSet.
   - Move `temp = temp.next`.
4. Return `null`.

---

## Time Complexity

- HashSet lookup: O(1) average
- HashSet insertion: O(1) average

Overall: **O(n)**

---

## Space Complexity

HashSet may store all nodes.

Overall: **O(n)**

---

## Next Improvement

Use Floyd's Slow & Fast Pointer algorithm to achieve:

- Time: **O(n)**
- Space: **O(1)**