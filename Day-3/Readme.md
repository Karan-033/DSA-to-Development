# Date 23 Nov 2026
# Session 3

## Topic - Array in Java

### 1. What is an Array?
Imagine you have five students marks. You could create five seperate variales.  
```java
    int mark1 = 78;
    int mark2 = 92;
    int mark3 = 65;
    int mark4 = 88;
    int mark5 = 74;
```
That become inconvenient when you have 100 students.  

- An Array stores multiple value of same data type under one variable.
```java
  int[] marks = [78, 92, 65, 88, 74];
```
- Think of it as five boxes arranged in a row:
<div>
<h3>The <code>marks</code> array</h3>
<table align="center">
  <tr>
    <td align="center" width="120">
      <h2>78</h2>
      Index 0
    </td>
    <td align="center" width="120">
      <h2>92</h2>
      Index 1
    </td>
    <td align="center" width="120">
      <h2>65</h2>
      Index 2
    </td>
    <td align="center" width="120">
      <h2>88</h2>
      Index 3
    </td>
    <td align="center" width="120">
      <h2>74</h2>
      Index 4
    </td>
  </tr>
</table>
Each box holds one integer. Its index tells Java where to find it.
</div>

Java arrays use zero-based indexing 
| Index | Value |
|---|---|
| 0 | 78 |
| 1 | 92 |
| 2 | 65 |
| 3 | 88 |
| 4 | 74 |

So:  
```java
  System.out.println(marks[0]); \\78
  System.out.println(marks[0]); \\92
```

The first element is at index 0, not index 1.

### 2. Array Length and valid Indexes
use <code>.length</code> to get the number of elements:
```java
  System.out.println(marks.length); \\5
```
The Valid indexes are always:  
  - First index: <code>0</code>
  - Last index: <code>marks.length - 1</code>

For this array, the last valid index is <code>4</code>.  
<span style="color:red;">🔴 Avoid this</span>
```java
  System.out.println(marks[5]);
```
This cause an <code>ArrayIndexOutOfBoundsException</code>, because index <code>5</code> does not exist.  
Remember: Java array <code>.length</code> does not use parantheses.

### 3. Updating an array element
You can change an existing element using its index.
```java
  marks[2] = 70;
```
Before:
  <code>78, 92, 65, 88, 74</code>
After:
  <code>78, 92, 70, 88, 74</code>
You changed only the value at index 2. the Array still has five elements.

### 4. Traversing an Array
Traversal means visiting each element one by one.
```java
  for(int i = 0; i < marks.length; i++){
    System.out.println(marks[i]);
  }
```
Lets trace the loop:
| Iteration | i | marks[i] |
|---|---|---|
| 1 | 0 | 78 |
| 2 | 1 | 92 |
| 3 | 2 | 65 |
| 4 | 3 | 88 |
| 5 | 4 | 74 |

When <code>i</code> becomes <code>5</code>, the condition <code>i < marks.length</code> is false, so the loop stops.  
Why use <code>i < marks.length</code> instead of <code>i <= marks.length</code>?  
Because the last valid index is <code>length - 1</code>. Using <code><=</code> would try to access an invalid index.

### 5. Finding minimum and Maximum
Suppose you want to find the highest and lowest marks.  
A useful approach is:
  1. Assume the first element is both the minimum and maximum.
  2. Visit every element.
  3. If an element is samller than the minimum, update the minimum.
  4. If an element is larger than the maximum, update the maximum.

```java
  int min = marks[0];
  int max = marks[0];
  for (int i = 0; i < marks.length; i++) {
    if (marks[i] < min) {
        min = marks[i];
    }
    if (marks[i] > max) {
        max = marks[i];
    }
  }
```

for <code>{78, 92, 65, 88, 74}</code>:
  - Minimum = <code>65</code>
  - Maximum = <code>92</code>

This example assumes the array contains at least one element. In a general program, check that the array is not empty before accessing marks[0].  

### 6. Couting matching values
Now suppose you want to count how many students scored at least <code>80</code>

```java
  int count = 0;
  for (int i = 0; i < marks.length; i++) {
    if (marks[i] >= 80) {
      count++;
    }
  }
```

Tha matching values are <code>92</code> and <code>88</code>.
Therefore, <code>count = 2</code>
The condition determines what counts as a match. For an exact match, you could use <code>marks[i] == 80</code> instead.

### 7. Complete java example - ArrayExplorer
  This program combines the operations we've learned
    [Click here](ArrayExplorer.java)

### 8. Connect arrays to Big-O
This is where our Session 02 learning becomes useful.
| Operations | Time Complexity | Reason |
|---|---|---|
| Read <code>marks[2]</code> | O(1) | Direct indexed access |
| Update <code>marks[2]</code> | O(1) | Direct indexed update |
| Read <code>marks.length</code> | O(1) | Length is available directly |
| Print all elements | O(n) | visit every element |
| Find min and Max | O(n) | Inspect every element |
| Count matching values | O(n) | Inspect every element |

Notice that our combined min/max/count loop does three checks during one traversal. It still visits each of the <code>n</code> elements once, so its time complexity is O(n), not O(n²).

Auxiliary space: O(1)

We use a fixed number of extra variables: <code>min</code>, <code>max</code>, <code>count</code>, <code>i</code>, and <code>current</code>. Their number does not grow with the array size. The original input array is not counted as extra auxiliary storage.
