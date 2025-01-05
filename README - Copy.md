## 2. Heap

### 2.1 Connect ropes

<details>
<summary>Connect ropes</summary>

#### Problem Description

```
You are given an array A of integers that represent the lengths of ropes.
You need to connect these ropes into one rope. The cost of joining two ropes equals the sum of their lengths.
Find and return the minimum cost to connect these ropes into one rope.
```

#### Problem Constraints

- 1 <= length of the array <= 100000
- 1 <= A[i] <= 1000

#### Input Format : `The only argument given is the integer array A.`

#### Output Format : `Return an integer denoting the minimum cost to connect these ropes into one rope.`

#### Examples :

**Input 1:** `A = [1, 2, 3, 4, 5]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Output 1:** `33`

**Input 2:** ` A = [5, 17, 100, 11]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Output 2:** `182`

#### Example Explanation

**_Explanation 1:_**

```
 Given array A = [1, 2, 3, 4, 5].
 Connect the ropes in the following manner:
 1 + 2 = 3
 3 + 3 = 6
 4 + 5 = 9
 6 + 9 = 15

 So, total cost  to connect the ropes into one is 3 + 6 + 9 + 15 = 33.
```

**_Explanation 2:_**

```
 Given array A = [5, 17, 100, 11].
 Connect the ropes in the following manner:
 5 + 11 = 16
 16 + 17 = 33
 33 + 100 = 133

 So, total cost  to connect the ropes into one is 16 + 33 + 133 = 182
```

</details>

### 2.2 Build a Heap

<details>
<summary>Build a Heap</summary>

#### Problem Description

```
Given an array A of N integers, convert that array into a min heap and return the array.
NOTE: A min heap is a binary tree where every node has a value less than or equal to its children.
```

#### Problem Constraints

- 1 ≤ N ≤ 10<sub>5</sub>
- 0 ≤ A[i] ≤ 10<sub>9</sub>

#### Input Format : `First and only argument of input contains a single integer array A of length N.`

#### Output Format : `Return the reordered array A such that it forms a min heap.`

#### Examples :

**Input 1:** `A = [5, 13, -2, 11, 27, 31, 0, 19]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Output 1:** `A = [-2, 5, 0, 13, 11, 19, 27, 31]`

#### Example Explanation

**_Explanation 1:_**

```
One possible Heap is

                -2
               /    \
             5       0
            / \    /  \
          13  11  19   27
          /
        31

It can be seen that each parent has a value smaller than its children. Hence it is a Valid Heap.

The Heap in the Array format is [-2, 5, 0, 13, 11, 19, 27, 31].

Some more possible heaps are  [-2, 0, 5, 13, 11, 27, 19, 31], [-2, 5, 0, 11, 27, 13, 19, 31], etc.
You can return any possible Valid Heap Structure.
```

</details>

### 2.3 Heap Queries

<details>
<summary>Heap Queries</summary>

#### Problem Description

```
You have an empty min heap. You are given an array A consisting of N queries. Let P denote A[i][0] and Q denote A[i][1]. There are two types of queries:
P = 1, Q = -1 : Pop the minimum element from the heap.
P = 2, 1 <= Q <= 109 : Insert Q into the heap.
Return an integer array containing the answer for all the extract min operation. If the size of heap is 0, then extract min should return -1.
```

#### Problem Constraints

- 1 <= N <= 10<sub>5</sub>
- 1 <= A[i][0] <= 2
- 1 <= A[i][1] <= 10<sub>9</sub> or A[i][1] = -1

#### Input Format : `The only argument A is a 2D integer array`

#### Output Format : `Return an integer array`

#### Examples :

**Input 1:** `A = [[1, -1], [2, 2], [2, 1], [1, -1]]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Output 1:** `[-1, 1]`

**Input 2:** `A = [[2, 5], [2, 3], [2, 1], [1, -1], [1, -1]]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Output 1:** `[1, 3]`

#### Example Explanation

**_Explanation 1:_**

```
For the first extract operation the heap is empty so it gives -1. For the second extract operation the heap contains the elements 2 and 1. Extract min returns the element 1
```

**_Explanation 1:_**

```
The heap contains the elements 5, 3 and 1. The first extract min operation gets the element 1 and the second operation gets the element 3
```

</details>
