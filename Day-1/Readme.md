# Date 21 Nov 2026
# Session 1

## Topic - Understanding Time and Space Complexity (Big-O)

- Befor becoming a good developer, you need to understand not just whether your code works, but also how efficient it works.
- Imagine two developers build the same application:
  - Developer A writes code that takes 1 second for 100 records but 100 seconds for 10,000 records.
  - Developer B writes code that takes 1 second for 100 records and 2 seconds for 10,000 records.
Both applications work, but Developer B has designed a more scalable solution.

That's why we learn Big-O.

- Big-O describes how an algorithm's resource requirements grow as its input size increases.
  | Complexity | Meaning | Example |
  |---|---|---|
  | O(1) | Constant | Access array element |
  | O(log n) | Logarithmic | Binary Search |
  | O(n) | Linear | Traverse an Array |
  | O(n log n) | Linearithmic | Merge sort |
  | O(n<sup>2</sup>) | Quadratic | Nested Loops |

  ## Example
  ### O(1) - Contant Time
  ```java
    static int getFirst(int[] arr) {
    return arr[0];
  }
  ```

  ### O(n) - Linear Time
  ```java
    static int findMax(int[] arr) {
    int max = arr[0];

    for (int num : arr) {
        if (num > max) {
            max = num;
        }
    }

    return max;
  }
  ```

  ### O(n<sup>2</sup>) - Quadratic Time
  ```java
    static void printPairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
  }
  ```
