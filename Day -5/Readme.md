# Date 27 Nov 2026
# Session 5

## Topic - Binary Search in Java

### 1. Why do we need Binary search?
Linear Search checks elements one-by-one, Binary Search is faster on a sorted array because it eliminates half of the remaining search range at each step.
```
  Important condition
  - Array must be sorted
  - Binary search relies on the elements being in ascending or descending order.
```
### 2. Understand <code>low</code>, <code>high</code> and <code>mid</code>  
Binary search maintains three important variables:
  - <code>low</code>: first index in current search range.
  - <code>high</code>: last index in current search range.
  - <code>mid</code>: middle index of that range.

Calculate the middle index using:
```java
  int mid = low + (high - low) / 2
```  
Then compare <code>arr[mid]</code> with the target:
| Condition | Action |
|---|---|
| <code>arr[mid] == target | Target Found |
| <code>arr[mid] < target | Search the right half: low = mid + 1 |
| <code> arr[mid] > target | Search the left half: low = mid - 1
