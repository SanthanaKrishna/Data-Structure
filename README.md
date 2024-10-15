# Data-Structure

## Basic Problems Solving

#### Sum of N natural numbers

##### Formula

```
As the first n natural numbers are 1,2,3,4,5,6,.........n

They form an AP with a=1 and d=1
The sum of AP for n numbers = ((2*a + (n-1)*d)*n)/2
=((2 + n - 1)*n)/2
=(n*(n+1))/2
```

### 1.1 Count Factors - 2

<details>
<summary>Factors</summary>

#### Problem Description

```
Given an integer A, you need to find the count of it's factors.
Factor of a number is the number which divides it perfectly leaving no remainder.
Example : 1, 2, 3, 6 are factors of 6
```

#### Problem Constraints

- 1 <= A <= 10<sup>9</sup>

#### Input Format : `The first and only argument is an integer A.`

#### Output Format : `Return the count of factors of A.`

#### Examples :

**Input 1:** `5`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `2`

**Input 2:** `10` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `4`

#### Example Explanation

***Explanation 1:*** `Factors of 5 are 1 and 5.`

***Explanation 2:*** `Factors of 10 are 1, 2, 5, and 10.`
</details>

### 1.2 IsPrime

<details>
<summary>IsPrime and CountPrime</summary>

#### Problem Description

```
Given a number A. Return 1 if A is prime and return 0 if not. 

Note : 
The value of A can cross the range of Integer.
```

#### Problem Constraints

- 1 <= A <= 10<sup>9</sup>

#### Input Format : `The first and only argument is an integer A.`

#### Output Format : `Return 1 if A is prime else return 0..`

#### Examples :

**Input 1:** `A = 5`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = 10` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `0`

#### Example Explanation

***Explanation 1:*** `5 is a prime number.`

***Explanation 2:*** `10 is not a prime number.`
</details>

### 1.3 Find Perfect Numbers

<details>
<summary>Perfect Number</summary>

#### Problem Description

```
You are given an integer A. You have to tell whether it is a perfect number or not.
Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
A <bold>proper divisor</bold> of a natural number is the divisor that is strictly less than the number.
```

#### Problem Constraints

- 1 <= A <= 10<sup>6</sup>

#### Input Format : `First and only argument contains a single positive integer A.`

#### Output Format : `Return 1 if A is a perfect number and 0 otherwise.`

#### Examples :

**Input 1:** `A = 4`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `0`

**Input 2:** `A = 6` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `1`

#### Example Explanation

***Explanation 1:*** `For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.`

***Explanation 2:*** `For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.`
</details>

## Array Basics

### 2.1 Good Pair

<details>
<summary>Good Pair</summary>

#### Problem Description

```
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
Check if any good pair exist or not.
```

#### Problem Constraints

- 1 <= A.size() <= 10<sup>4</sup>
- 1 <= A[i] <= 10<sup>9</sup>
- 1 <= B <= 10<sup>9</sup>

#### Input Format :

```
First argument is an integer array A.
Second argument is an integer B.
```

#### Output Format : `Return 1 if good pair exist otherwise return 0.`

#### Examples :

**Input 1:** `A = [1,2,3,4] B = 7`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = [1,2,4] B = 4` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `0`

**Input 3:** `A = [1,2,2] B = 4` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 3:** `1`

#### Example Explanation

***Explanation 1:*** `(i,j) = (3,4)`

***Explanation 2:*** `No pair has sum equal to 4.`

***Explanation 3:*** ` (i,j) = (2,3)`
</details>

### 2.2 Reverse in a range

<details>
<summary>ReverseArrayInRange</summary>

#### Problem Description

```
Given an array A of N integers and also given two integers B and C. 
Reverse the elements of the array A within the given inclusive range [B, C].
```

#### Problem Constraints

- 1 <= N <= 10<sup>5</sup>
- 1 <= A[i] <= 10<sup>9</sup>
- 0 <= B <= C <= N - 1

#### Input Format :

```
The first argument A is an array of integer.
The second and third arguments are integers B and C
```

#### Output Format : `Return the array A after reversing in the given range.`

#### Examples :

**Input 1:** `A = [1,2,3,4] B = 2 C = 3`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `[1, 2, 4, 3]`

**Input 2:** `A = [2, 5, 6] B = 0  C = 2` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `[6, 5, 2]`

#### Example Explanation

***Explanation 1:*** `We reverse the subarray [3, 4].`

***Explanation 2:*** `We reverse the entire array [2, 5, 6].`
</details>

### 2.3 Array Rotation K Times

<details>
<summary>RotateArrayKTimes</summary>

#### Problem Description

```
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
```

#### Problem Constraints

- 1 <= N <= 10<sup>5</sup>
- 1 <= A[i] <= 10<sup>9</sup>
- 1 <= B <= 10<sup>9</sup>

#### Input Format :

```
The first argument given is the integer array A.
The second argument given is the integer B.
```

#### Output Format : `Return the array A after rotating it B times to the right.`

#### Examples :

**Input 1:** `A = [1, 2, 3, 4] B = 2`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `[3, 4, 1, 2]`

**Input 2:** `A = [2, 5, 6] B = 1` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `[6, 5, 2]`

#### Example Explanation

***Explanation 1:*** `Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2].`

***Explanation 2:*** `Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5].`
</details>

### 2.4 Max Min of an Array

<details>
<summary>MinMaxSumArray</summary>

#### Problem Description

```
Given an array A of size N.
You need to find the sum of Maximum and Minimum element in the given array.
```

#### Problem Constraints

- 1 <= N <= 10<sup>5</sup>
- 10<sup>9</sup> <= A[i] <= 10<sup>9</sup>

#### Input Format : `First argument A is an integer array.`

#### Output Format : `Return the sum of maximum and minimum element of the array.`

#### Examples :

**Input 1:** `A = [-2, 1, -4, 5, 3] `  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = [1, 3, 4, 1]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `5`

#### Example Explanation

***Explanation 1:*** `Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1. `

***Explanation 2:*** `Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.`
</details>

### 2.5 Time Complexity - Arrays

#### Problem Description

```
What is the time complexity for inserting/deleting at the beginning of the array?
```

**Output:**

```
Insertion and deletion at the beginning of the array is O(N)
because all the elements after it have to have their indexes recomputed.
```

---

## Array - Prefix Sum

#### Prefix Sum Formula

###### Formula

```
PrefSum[i] = prefSum[i - 1] + A[i]
```

#### Time Complexity of Prefix Sum

##### Problem Description

```
What is the time complexity for inserting/deleting at the beginning of the array?
```

**Output:**

```
We have to traverse over the whole array and calculate each element of the prefix sum array
with the recurrence pre[i] = pre[i - 1] + a[i].
So, the time complexity of creating the prefix sum array is O(N).
```

### 3.1 Range Sum Query

<details>
<summary>PrefixSum - PrefixSumRangeQuery</summary>

#### Problem Description

```
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
```

#### Problem Constraints

- 1 <= N, M <= 10<sup>5</sup>
- 1 <= A[i] <= 10<sup>9</sup>
- 0 <= L <= R < N

#### Input Format :

```
The first argument is the integer array A.
The second argument is the 2D integer array B.
```

#### Output Format : `Return an integer array of length M where ith element is the answer for ith query in B.`

#### Examples :

**Input 1:** `A = [1, 2, 3, 4, 5] B = [[0, 3], [1, 2]]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `[10, 5]`

**Input 2:** `A = [2, 2, 2] B = [[0, 0], [1, 2]]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `[2, 4]`

#### Example Explanation

***Explanation 1:***

```
The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
```

***Explanation 2:***

```
The sum of all elements of A[0 ... 0] = 2 = 2.
The sum of all elements of A[1 ... 2] = 2 + 2 = 4.
```

</details>

### 3.2 Special Index - Prefix Sum Even and Odd

<details>
<summary>PrefixSum - PrefixSumSpecialIndex</summary>

#### Problem Description

```
Given an array, arr[] of size N, 
the task is to find the count of array indices such that removing an element from these indices 
makes the sum of even-indexed and odd-indexed array elements equal.
```

#### Problem Constraints

- 1 <= N <= 10<sup>5</sup>
- 10<sup>5</sup> <= A[i] <= 10<sup>5</sup>
- Sum of all elements of A <= 109

#### Input Format : `First argument contains an array A of integers of size N.`

#### Output Format : `Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.`

#### Examples :

**Input 1:** `A = A = [2, 1, 6, 4]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = [1, 1, 1]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `3`

#### Example Explanation

***Explanation 1:***

```
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
Therefore, the required output is 1.
```

***Explanation 2:***

```
Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
Therefore, the required output is 3.
```

</details>

---

## Array - Carry Forward & SubArrays

#### Total SubArray Formula

###### Formula

```
Total SubArrays = N(N+1)/2
```

### 4.1 Special Subsequences "AG" - 2

<details>
<summary>String - SpecialSubSequences</summary>

#### Problem Description

```
You have given a string A having Uppercase English letters.
You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
```

#### Problem Constraints

- 1 <= length(A) <= 10<sup>5</sup>

#### Input Format : `First and only argument is a string A.`

#### Output Format : `Return an long integer denoting the answer.`

#### Examples :

**Input 1:** ` A = "ABCGAG"`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `3`

**Input 2:** `A = "GAB"` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `0`

#### Example Explanation

***Explanation 1:*** ` Subsequence "AG" is 3 times in given string, the pairs are (0, 3), (0, 5) and (4, 5). `

***Explanation 2:*** ` There is no subsequence "AG" in the given string.`
</details>

### 4.2 Generate all subArrays

<details>
<summary>SubArrays - GenerateAllSubArray</summary>

#### Problem Description

```
You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array
Note : The order of the subarrays in the resulting 2D array does not matter.
```

#### Problem Constraints

- 1 <= lA[i] <= 10<sup>5</sup>
- 1 <= N <= 100

#### Input Format : `First argument A is an array of integers.`

#### Output Format : `Return a 2D array of integers in any order.`

#### Examples :

**Input 1:** `A = [1, 2, 3]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `[[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]`

**Input 2:** `A = [5, 2, 1, 4]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:
** `[[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]`

#### Example Explanation

***Explanation 1:*** `All the subarrays of the array are returned. There are a total of 6 subarrays.`

***Explanation 2:*** `All the subarrays of the array are returned. There are a total of 10 subarrays.`
</details>

### 4.3  SubArray in given range

<details>
<summary>SubArrays - SubArrayInRange</summary>

#### Problem Description

```
Given an array A of length N, return the subarray from B to C.
```

#### Problem Constraints

- 1 <= lA[i] <= 10<sup>5</sup>
- 1 <= A[i] <= 10<sup>9</sup>
- 0 <= B <= C < N

#### Input Format :

```
The first argument A is an array of integers
The remaining argument B and C are integers.
```

#### Output Format : `Return a subarray.`

#### Examples :

**Input 1:** `A = [4, 3, 2, 6] B = 1  C = 3`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `[3, 2, 6]`

**Input 2:** `A = [4, 2, 2] B = 0  C = 1` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `[4, 2]`

#### Example Explanation

***Explanation 1:*** `The subarray of A from 1 to 3 is [3, 2, 6].`

***Explanation 2:*** `The subarray of A from 0 to 1 is [4, 2].`
</details>

### 4.4  Closest MinMax SubArray

<details>
<summary>SubArrays - ClosestMinMaxSmallestSubArray</summary>

#### Problem Description

```
Given an array A, find the size of the smallest subarray such that 
it contains at least one occurrence of the maximum value of the array and at least one occurrence of the minimum value of the array.
```

#### Problem Constraints

- 1 <= |A| <= 2000

#### Input Format : `First and only argument is vector A.`

#### Output Format : `Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array.`

#### Examples :

**Input 1:** `A = [1, 3, 2]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `2`

**Input 2:** `A = [2, 6, 1, 6, 9]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `3`

#### Example Explanation

***Explanation 1:*** `Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.`

***Explanation 2:*** `Take the last 3 elements of the array.`
</details>

---

## Array - Sliding Window & Contribution Technique

### 5.1 Sum of All SubArrays

<details>
<summary>SubArrays - SumAllSubArrays</summary>

#### Problem Description

```
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.
Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
```

#### Problem Constraints

- 1 <= N <= 10<sup>5</sup>
- 1 <= Ai <= 10<sup>4</sup>

#### Input Format : `The first argument is the integer array A.`

#### Output Format : `Return a single integer denoting the sum of all subarray sums of the given array.`

#### Examples :

**Input 1:** `A = [1, 2, 3]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `19`

**Input 2:** `A = [2, 1, 3]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `20`

#### Example Explanation

***Explanation 1:***

```
The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
```

***Explanation 2:***

```
The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19
```

</details>

### 5.2 Maximum SubArray Easy

<details>
<summary>SubArrays - MaximumSubArray</summary>

#### Problem Description

```
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.
```

#### Problem Constraints

- 1 <= A <= 10<sup>3</sup>
- 1 <= B <= 10<sup>9</sup>
- 1 <= C[i] <= 10<sup>6</sup>

#### Input Format :

```
The first argument is the integer A.
The second argument is the integer B.
The third argument is the integer array C.
```

#### Output Format : `Return a single integer which denotes the maximum sum.`

#### Examples :

**Input 1:** `A = 5 B = 12 C = [2, 1, 3, 4, 5]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `12`

**Input 2:** `A = 3 B = 1 C = [2, 2, 2]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `0`

#### Example Explanation

***Explanation 1:*** ```We can select {3,4,5} which sums up to 12 which is the maximum possible sum.```

***Explanation 2:***

```
All elements are greater than B, which means we cannot select any subarray.
Hence, the answer is 0.
```

</details>

### 5.3 SubArray with given sum and length

<details>
<summary>SubArrays - SubArrayGivenSumLength</summary>

#### Problem Description

```
Given an array A of length N. Also given are integers B and C.
Return 1 if there exists a subarray with length B having sum C and 0 otherwise
```

#### Problem Constraints

- 1 <= N <= 10<sup>5</sup>
- 1 <= A[i] <= 10<sup>4</sup>
- 1 <= B <= N
- 1 <= C <= 10<sup>9</sup>

#### Input Format :

```
First argument A is an array of integers.
The remaining arguments B and C are integers
```

#### Output Format : `Return 1 if such a subarray exist and 0 otherwise.`

#### Examples :

**Input 1:** `A = [4, 3, 2, 6, 1] B = 3 C = 11`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = [4, 2, 2, 5, 1] B = 4 C = 6` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `0`

#### Example Explanation

***Explanation 1:***  `The subarray [3, 2, 6] is of length 3 and sum 11.`

***Explanation 2:*** `There are no such subarray.`
</details>

---

## Array - Sorting

### 6.1  Elements Removal

<details>
<summary>RemoveElementCost</summary>

#### Problem Description

```
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.
Find the minimum cost to remove all elements from the array.
```

#### Problem Constraints

- 0 <= N <= 1000
- 1 <= A[i] <= 10<sup>3</sup>

#### Input Format : `First and only argument is an integer array A.`

#### Output Format : `Return an integer denoting the total cost of removing all elements from the array.`

#### Examples :

**Input 1:** `A = [2, 1]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `4`

**Input 2:** `A = [5]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `5`

#### Example Explanation

***Explanation 1:***

```
 Given array A = [2, 1]
 Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 Remove 1 from the array => []. Cost of this operation is (1) = 1.
 So, total cost is = 3 + 1 = 4.
```

***Explanation 2:*** `There is only one element in the array. So, cost of removing is 5.`

</details>

### 6.2  Noble Integer

<details>
<summary>NobleInteger</summary>

#### Problem Description

```
Given an integer array A, 
find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
```

#### Problem Constraints

- 1 <= |A| <= 2*10<sup>5</sup>
- -10<sup>8</sup> <= A[i] <= 10<sup>8</sup>

#### Input Format : `First and only argument is an integer array A.`

#### Output Format : `Return 1 if any such integer p is present else, return -1.`

#### Examples :

**Input 1:** `A = [3, 2, 1, 3]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = [1, 1, 3, 3]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `-1`

#### Example Explanation

***Explanation 1:*** ` For integer 2, there are 2 greater elements in the array..`

***Explanation 2:*** ` There exist no integer satisfying the required conditions.`

</details>

### 6.3  Kth Smallest Element

<details>
<summary>KthSmallestElement</summary>

#### Problem Description

```
Find the Bth smallest element in given array A .
NOTE: Users should try to solve it in less than equal to B swaps.
```

#### Problem Constraints

- 1 <= |A| <= 100000
- 1 <= B <= min(|A|, 500)
- 1 <= A[i] <= 10<sup>9</sup>

#### Input Format :

```
The first argument is an integer array A.
The second argument is integer B.
```

#### Output Format : `Return the Bth smallest element in given array.`

#### Examples :

**Input 1:** `Input 1: A = [2, 1, 4, 3, 2] B = 3`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `2`

**Input 2:** `A = [1, 2] B = 2` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `-1`

#### Example Explanation

***Explanation 1:*** ` For integer 2, there are 2 greater elements in the array..`

***Explanation 2:*** ` There exist no integer satisfying the required conditions.`

</details>

---

## Array - 2D Matrix

### 7.1 Column Sum

<details>
<summary>Matrix - ColumnSum2DArray</summary>

#### Problem Description

```
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
```

#### Problem Constraints

- 1 <= A.size() <= 10<sup>3</sup>
- 1 <= A[i].size() <= 10<sup>3</sup>
- 1 <= A[i][j] <= 10<sup>3</sup>

#### Input Format : `First argument is a 2D array of integers.(2D matrix).`

#### Output Format : `Return an array containing column-wise sums of original matrix.`

#### Examples :

**Input 1:** `A = [[1,2,3,4] [5,6,7,8] [9,2,3,4]]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `{15,10,13,16}`

#### Example Explanation

***Explanation 1:***

```
Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16
```

</details>

### 7.2 Main Diagonal Sum

<details>
<summary>Matrix - MainDiagonalSum</summary>

#### Problem Description

```
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
```

#### Problem Constraints

- 1 <= N <= 10<sup>3</sup>
- 1000 <= A[i][j] <= 100

#### Input Format :

```
There are 1 lines in the input. 
First 2 integers R, C are the number of rows and columns. 
Then R * C integers follow corresponding to the rowwise numbers in the 2D array A.
```

#### Output Format : `Return an integer denoting the sum of main diagonal elements.`

#### Examples :

**Input 1:** `3 3 1 -2 -3 -4 5 -6 -7 -8 9`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `15`

**Input 2:** `2 2 3 2 2 3`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `6`

#### Example Explanation

***Explanation 1:***

```
The size of matrix is 3.
So, considering the indexing from 0.
Main diagonal elements will be A[0][0], A[1][1] and A[2][2]
A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
```

***Explanation 2:***

```
The size of matrix is 2.
So, considering the indexing from 0.
Main diagonal elements will be A[0][0] and A[1][1].
A[1][1] + A[2][2] = 3 + 3 = 6
```

</details>

---

### 7.3  Anti Diagonals

<details>
<summary>Matrix - AntiDiagonal</summary>

#### Problem Description

```
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
```

#### Problem Constraints

- 1<= N <= 1000
- 1<= A[i][j] <= 1e9

#### Input Format : `Only argument is a 2D array A of size N * N.`

#### Output Format :

```
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.
```

#### Examples :

**Input 1:** `[1 2 3] [4 5 6] [7 8 9]]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
**Output 1:**

```
[1 0 0
2 4 0
3 5 7
6 8 0
9 0 0]
```

**Input 2:** `[[1 2] [3 4]]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
**Output 2:**

```
1 0
2 3
4 0
```

#### Example Explanation

***Explanation 1:***

```
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
```

***Explanation 2:***

```
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
```

</details>

### 7.4 Matrix Transpose

<details>
<summary>Matrix - Matrix Transpose</summary>

#### Problem Description

```
Given a 2D integer array A, return the transpose of A.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
```

#### Problem Constraints

- 1 <= A.size() <= 1000
- 1 <= A[i].size() <= 1000
- 1 <= A[i][j] <= 1000

#### Input Format : `First argument is a 2D matrix of integers.`

#### Output Format : `You have to return the Transpose of this 2D matrix.`

#### Examples :

**Input 1:** `A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:
** `[[1, 4, 7], [2, 5, 8], [3, 6, 9]]`

**Input 2:** `A = [[1, 2],[1, 2],[1, 2]]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `[[1, 1, 1], [2, 2, 2]]`

#### Example Explanation

***Explanation 1:***

```
Clearly after converting rows to column and columns to rows of
 [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
```

***Explanation 2:***

```
After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]
```

</details>

### 7.5 Rotate Matrix

<details>
<summary>Matrix - RotateMatrix</summary>

#### Problem Description

```
You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
You need to do this in place.
Note: If you end up using an additional array, you will only receive partial score
```

#### Problem Constraints

- 1 <= n <= 1000

#### Input Format : `First argument is a 2D matrix A of integers.`

#### Output Format : `Return the 2D rotated matrix..`

#### Examples :

**Input 1:** `A =  [[1, 2],[3, 4]]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `[[3, 1],[4, 2]]`

**Input 2:** `A =  [[1, 2, 3],[4, 5, 6],[7, 8, 9]]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:
** `[[7, 4, 1], [8, 5, 2], [9, 6, 3]]`

#### Example Explanation

***Explanation 1:***

```
 After rotating the matrix by 90 degree:
 1 goes to 2, 2 goes to 4
 4 goes to 3, 3 goes to 1
```

***Explanation 2:***

```
 After rotating the matrix by 90 degree:
 1 goes to 3, 3 goes to 9
 2 goes to 6, 6 goes to 8
 9 goes to 7, 7 goes to 1
 8 goes to 4, 4 goes to 2
```

</details>

---

## Bit Manipulations

### 8.1 Sum of All SubArrays

<details>
<summary>SumAllSubArrays</summary>

#### Problem Description

```
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.
Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
```

#### Problem Constraints

- 1 <= N <= 10<sup>5</sup>
- 1 <= Ai <= 10<sup>4</sup>

#### Input Format : `The first argument is the integer array A.`

#### Output Format : `Return a single integer denoting the sum of all subarray sums of the given array.`

#### Examples :

**Input 1:** `A = [1, 2, 3]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `19`

**Input 2:** `A = [2, 1, 3]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `20`

#### Example Explanation

***Explanation 1:***

```
The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
```

***Explanation 2:***

```
The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19
```

</details>

---

## String

### 9.1 Toggle Case

<details>
<summary>Strings - StringToggle</summary>

#### Problem Description

```
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
You have to toggle case of each character of string A. 
For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc
```

#### Problem Constraints

- 1 <= N <= 10<sup>5</sup>
- A[i] ∈ ['a'-'z', 'A'-'Z']

#### Input Format : `First and only argument is a character string A.`

#### Output Format : `Return a character string.`

#### Examples :

**Input 1:** ` A = "Hello"`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `"hELLO"`

**Input 2:** `A = "tHiSiSaStRiNg"` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `"ThIsIsAsTrInG"`

#### Example Explanation

***Explanation 1:***

```
 'H' changes to 'h'
 'e' changes to 'E'
 'l' changes to 'L'
 'l' changes to 'L'
 'o' changes to 'O
```

***Explanation 2:*** `"tHiSiSaStRiNg" changes to "ThIsIsAsTrInG"`
</details>

### 9.2 String Reverse

<details>
<summary>Strings - StringReverse</summary>

#### Problem Description

```
Given a string A, you are asked to reverse the string and return the reversed string.
```

#### Problem Constraints

- 1 <= N <= 10<sup>5</sup>
- String A consist only of lowercase characters.

#### Input Format : `First and only argument is a string A.`

#### Output Format : `Return a string denoting the reversed string.`

#### Examples :

**Input 1:** ` A = "scaler"`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `"relacs"`

**Input 2:** `A = "academy"` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `"ymedaca"`

#### Example Explanation

***Explanation 1:*** `Reverse the given string.`
</details>

### 9.3 Reverse the String

<details>
<summary>Strings - ReverseLine</summary>

#### Problem Description

```
You are given a string A of size N.
Return the string A after reversing the string word by word.
NOTE:
A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
```

#### Problem Constraints

- 1 <= N <= 3 * 10<sup>5</sup>

#### Input Format : `The only argument given is string A.`

#### Output Format : `Return the string A after reversing the string word by word.`

#### Examples :

**Input 1:** ` A = "the sky is blue"`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `"blue is sky the"`

**Input 2:** `A = "this is ib"` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `"ib is this"`

#### Example Explanation

***Explanation 1:*** `We reverse the string word by word so the string becomes "blue is sky the".`

***Explanation 2:*** `We reverse the string word by word so the string becomes "ib is this".`
</details>

### 9.4 Longest Palindromic Substring

<details>
<summary>Strings - StringToggle</summary>

#### Problem Description

```
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)
Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
Incase of conflict, return the substring which occurs first ( with the least starting index).
```

#### Problem Constraints

- 1 <= N <= 6000

#### Input Format : `First and only argument is a string A.`

#### Output Format : `Return a string denoting the longest palindromic substring of string A.`

#### Examples :

**Input 1:** ` A = "aaaabaaa"`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `"aaabaaa"`

**Input 2:** `A = "abba"` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `"abba"`

#### Example Explanation

***Explanation 1:*** `We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".`

***Explanation 2:*** `We can see that longest palindromic substring is of length 4 and the string is "abba".`
</details>

---

## Arrays 2: Two Dimensional

### 10.1 Search in a row wise and column wise sorted matrix

<details>
<summary>Matrix - FindValueInMatrix</summary>

#### Problem Description

```
Given a matrix of integers A of size N x M and an integer B.

In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
Note 3: Expected time complexity is linear
Note 4: Use 1-based indexing
```

#### Problem Constraints

- 1 <= N, M <= 1000
- 100000 <= A[i] <= 100000
- 100000 <= B <= 100000

#### Input Format :

```
The first argument given is the integer matrix A.
The second argument given is the integer B.
```

#### Output Format : `Return the position of B and if it is not present in A return -1 instead.`

#### Examples :

**Input 1:** `A = [[1, 2, 3] [4, 5, 6] [7, 8, 9]]  B = 2`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1011`

**Input 2:** `A = [[1, 2] [3, 3]]  B = 3` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `2019`

#### Example Explanation

***Explanation 1:***

```
A[1][2] = 2
1 * 1009 + 2 = 1011
```

***Explanation 2:***

```
A[2][1] = 3
2 * 1009 + 1 = 2019
A[2][2] = 3
2 * 1009 + 2 = 2020
The minimum value is 2019
```

</details>

---

### 10.2 Spiral Order Matrix II

<details>
<summary>Matrix - SpiralOrderMatrix</summary>

#### Problem Description

`
Given an integer A, generate a square matrix filled with elements from 1 to A<sub>2</sub> in spiral order and return the generated square matrix.
`

#### Problem Constraints

- 1 <= A <= 1000

#### Input Format :`First and only argument is integer A`

#### Output Format : `Return a 2-D matrix which consists of the elements added in spiral order.`

#### Examples :

**Input 1:** `A = 1  B = 2`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `[[1]]`

**Input 2:** `A = 2  B = 3` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `[ [1, 2], [4, 3] ]`

**Input 2:** `A = 5  B = 3` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:
** `[ [1, 2, 3, 4, 5],[16, 17, 18, 19, 6],[15, 24, 25, 20, 7],[14, 23, 22, 21, 8],[13, 12, 11, 10, 9] ]`

#### Example Explanation

***Explanation 1:***

```
Only 1 is to be arranged.
```

***Explanation 2:***

```
1 --> 2
      |
      |
4<--- 3
```

***Explanation 3:***
```![img.png](img.png)```
</details>

### 10.2 Sum of all SubMatrices

<details>
<summary>Matrix - SumSubMatrix</summary>

#### Problem Description

`
Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
`

#### Problem Constraints

- 1 <= N <=30
- 0 <= A[i][j] <= 10

#### Input Format :`Single argument representing a 2-D array A of size N x N.`

#### Output Format : `Return an integer denoting the sum of all possible submatrices in the given matrix.`

#### Examples :

**Input 1:** `A = [ [1, 1] [1, 1] ]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `16`

**Input 2:** `A = [ [1, 2] [3, 4] ]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `40`

#### Example Explanation

***Explanation 1:***

```
Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
Number of submatrices with 3 elements = 0
Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
Total Sum = 4+8+4 = 16
```

***Explanation 2:***

```
The submatrices are [1], [2], [3], [4], [1, 2], [3, 4], [1, 3], [2, 4] and [[1, 2], [3, 4]].
Total sum = 40
```

</details>

---

## Recursion

#### Description : `A function that solves a problem by breaking it into smaller subproblems and calling itself`

#### URL's

`https://codingbat.com/java/Recursion-1`

### 11.1  Find Factorial!

<details>
<summary>Recursion -  Factorial</summary>

#### Problem Description

```
Write a program to find the factorial of the given number A using recursion.

Note: The factorial of a number N is defined as the product of the numbers from 1 to N.
```

#### Problem Constraints

- 0 <= A <= 12

#### Input Format : `First and only argument is an integer A.`

#### Output Format : `Return an integer denoting the factorial of the number A.`

#### Examples :

**Input 1:** `A = 4`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `24`

**Input 2:** `A = 1` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `1`

#### Example Explanation

***Explanation 1:*** `Factorial of 4 = 4 * 3 * 2 * 1 = 24`
***Explanation 2:*** `Factorial of 1 = 1`

</details>

### 11.2   Find Fibonacci - II

<details>
<summary>Recursion -  Fibonacci</summary>

#### Problem Description

```
The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:
Fn = Fn-1 + Fn-2
Given a number A, find and return the Ath Fibonacci Number using recursion.
Given that F0 = 0 and F1 = 1.
```

#### Problem Constraints

- 0 <= A <= 20

#### Input Format : `First and only argument is an integer A.`

#### Output Format : `Return an integer denoting the Ath term of the sequence.`

#### Examples :

**Input 1:** `A = 2`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = 9` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `34`

#### Example Explanation

***Explanation 1:*** `f(2) = f(1) + f(0) = 1`
***Explanation 2:*** ` f(9) = f(8) + f(7) = 21 + 13 = 34`

</details>

### 11.3  Print A to 1 function

<details>
<summary>Recursion -  PrintNNaturalNumberInReverse</summary>

#### Problem Description

```
You are given an integer A, print A to 1 using using recursion.
Note :- After printing all the numbers from A to 1, print a new line.
```

#### Problem Constraints

- 1 <= A <= 10<sub>4</sub>

#### Input Format : `First argument A is an integer.`

#### Output Format :

```
Print A space-separated integers A to 1.
Note: There should be exactly one space after each integer. Print a new line after printing the A integers
```

#### Examples :

**Input 1:** `A = 10`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `10 9 8 7 6 5 4 3 2 1`

**Input 2:** `A = 5` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `5 4 3 2 1`

#### Example Explanation

***Explanation 1:*** `Print 10 to 1 space separated integers.`

***Explanation 2:*** `Print 5 to 1 space separated integers.`

</details>

### 11.4  Print 1 to A function

<details>
<summary>Recursion -  PrintNNaturalNumberInReverse</summary>

#### Problem Description

```
You are given an integer A, print A to 1 using using recursion.
Note :- After printing all the numbers from A to 1, print a new line.
```

#### Problem Constraints

- 1 <= A <= 10<sub>4</sub>

#### Input Format : `First argument A is an integer.`

#### Output Format :

```
Print A space-separated integers 1 to A.
Note: There should be exactly one space after each integer. After printing all the integers, print a new line
```

#### Examples :

**Input 1:** `A = 10`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1 2 3 4 5 6 7 8 9 10`

**Input 2:** `A = 5` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `1 2 3 4 5`

#### Example Explanation

***Explanation 1:*** `Print 1 to 10 space separated integers.`

***Explanation 2:*** `Print 1 to 5 space separated integers.`
</details>

### 11.5 Print Array using Recursion

<details>
<summary>Recursion -  PowerFunction</summary>

#### Problem Description

```
You are given an array A. Print the elements of the array using recursion.
NOTE :
You are required to not use any loops, You can create new functions.
Don't change the signature of the function PrintArray.
Print a new empty line after printing the output.
```

#### Problem Constraints

- 1 <= | A | <= 100
- 1000 <= A[i] <= 1000.

#### Input Format : `One line containing the array A`

#### Output Format : `Print the elements of the array in the sequential order.`

#### Examples :

**Input 1:** `A = [6, -2, 5, 3]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `6 -2 5 3 `

**Input 2:** `A = [1]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `1`

#### Example Explanation

***Explanation 1:*** `Print the elements in their order.`

</details>

### 11.6  All Indices Of Array

<details>
<summary>Recursion -  PrintIndicesGivenValue</summary>

#### Problem Description

```
Given an array of integers A with N elements and a target integer B, the task is to find all the indices at which B occurs in the array.
Note: The problem encourages recursive logic for learning purposes. 
Although the online judge doesn't enforce recursion, it's recommended to use recursive solutions to align with the question's spirit.
```

#### Problem Constraints

- 1 <= N <= 103
- 1 <= A[i] <= 103
- 1 <= B <= 103
- It is guaranteed that the target B, exist atLeast once in the Array A.

#### Input Format :

```
First Argument in an Array of Integers, A.
Second Argument is the Target, B.
```

#### Output Format : `Return the sorted array of indices.`

#### Examples :

**Input 1:** `A = [1, 2, 3, 4, 5] B = 1`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `[0]`

**Input 2:** `A = [8, 9, 5, 6, 5, 5] B = 5` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `[2, 4, 5]`

#### Example Explanation

***Explanation 1:*** `The Target, 1 occurs on Index = 0. So returning [0].`

***Explanation 2:*** `Here, the target 5 occurs at indexes [2, 4, 5].`

</details>

### 11.7  Check Palindrome using Recursion

<details>
<summary>Recursion -  FindPalindrome</summary>

#### Problem Description

```
Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.
Note: A palindrome is a string that's the same when read forward and backward.
```

#### Problem Constraints

- 1 <= |A| <= 50000
- String A consists only of lowercase letters

#### Input Format : `The first and only argument is a string A.`

#### Output Format : `Return 1 if the string A is a palindrome, else return 0.`

#### Examples :

**Input 1:** `A = "madam"`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = "strings"` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `0`

#### Example Explanation

***Explanation 1:*** `"madam" is a palindomic string, so return 1.`

***Explanation 2:*** `"strings" is not a palindrome, so return 0.`
</details>

### 11.8 Fast Power

<details>
<summary>Recursion -  PowerFunction</summary>

#### Problem Description

```
Given two positive integers A and B. Implement Fast Power function to compute AB
```

#### Problem Constraints

- AB would fit in 64-bit type integer.

#### Input Format : `Two integers A and B`

#### Output Format : `Single integer denoting the answer to A<sub>B</sub>.`

#### Examples :

**Input 1:** `A = 2 , B = 10`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1024`

**Input 2:** `A = 1 , B = 100000000` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `1`

#### Example Explanation

***Explanation 1:***

```
2<sub>10</sub> = 2<sub>5</sub> * 2<sub>5</sub>
2<sub>5</sub> = 32, so 32 * 32 = 1024
```

***Explanation 2:*** `1 raised to power anything is 1`

</details>

### 11.9 Tower of Hanoi

<details>
<summary>Recursion -  PowerFunction</summary>

#### Problem Description

```
In the classic problem of the Towers of Hanoi, you have 3 towers numbered from 1 to 3 (left to right) and A disks numbered from 1 to A (top to bottom) of different sizes which can slide onto any tower.
The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).
You have the following constraints:

Only one disk can be moved at a time.
A disk is slid off the top of one tower onto another tower.
A disk cannot be placed on top of a smaller disk.

You have to find the solution to the Tower of Hanoi problem.
You have to return a 2D array of dimensions M x 3, where M is the minimum number of moves needed to solve the problem.
In each row, there should be 3 integers (disk, start, end), where:

disk - number of the disk being moved
start - number of the tower from which the disk is being moved
end - number of the tower to which the disk is being moved
```

#### Problem Constraints

- 1 <= A <= 18

#### Input Format : `The first argument is the integer A.`

#### Output Format : `Return a 2D array with dimensions M x 3 as mentioned above in the description.`

#### Examples :

**Input 1:** ` A = 2`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `[1 1 2 ] [2 1 3 ] [1 2 3 ]`

**Input 2:** `A = 3` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:
** `[1 1 3 ] [2 1 2 ] [1 3 2 ] [3 1 3 ] [1 2 1 ] [2 2 3 ] [1 1 3 ]`

#### Example Explanation

***Explanation 1:***

```
We shift the first disk to the middle tower.
We shift the second disk to the last tower.
We, finally, shift the first disk from the middle tower to the last tower.
```

***Explanation 2:***  
`We can see that this was the only unique path with minimal moves to move all disks from the first to the third tower.`

</details>


---

## Hashing

## Hashing

### 12.5 Check Pair Sum

<details>
<summary>Hashing -  CheckPairSum</summary>

#### Problem Description

```
Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
```

#### Problem Constraints

- 1 <= Length of array B <= 10<sub>5</sub>
- 0 <= Bi <= 10<sub>9</sub>
- 0 <= A <= 10<sub>9</sub>

#### Input Format : `First argument A is the Target sum, and second argument is the array B.`

#### Output Format : `Return an integer value 1 if there exists such pair, else return 0.`

#### Examples :

**Input 1:** `A = 8   B= [3, 5, 1, 2, 1, 2]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = 21  B= [9, 10, 7, 10, 9, 1, 5, 1, 5]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `0`

#### Example Explanation

***Explanation 1:*** `It is possible to obtain sum 8 using 3 and 5.`

***Explanation 2:*** `There is no such pair exists.`

</details>

### 12.6 Count Pair Difference

<details>
<summary>Hashing -  CountPairDifference</summary>

#### Problem Description

```
You are given an array A of N integers and an integer B.
Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
Since the answer can be very large, return the remainder after dividing the count with 109+7.
```

#### Problem Constraints

- 1 <= N <= 10<sub>5</sub>
- 1 <= A[i] <= 10<sub>9</sub>
- 1 <= B <= 10<sub>9</sub>

#### Input Format : `First argument A is an array of integers and second argument B is an integer.`

#### Output Format : `Return an integer.`

#### Examples :

**Input 1:** `A = [3, 5, 1, 2] B = 4`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `1`

**Input 2:** `A = [1, 2, 1, 2] B = 1` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `4`

#### Example Explanation

***Explanation 1:*** `The only pair is (2, 3) which gives difference as 4.`

***Explanation 2:*** `The pair which gives difference as 3 are (2, 1), (4, 1), (2, 3) and (4, 3).`

</details>

### 12.7  Sub-array with 0 sum

<details>
<summary>SubArray -  SubArraySum0</summary>

#### Problem Description

```
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
If the given array contains a sub-array with sum zero return 1, else return 0.
```

#### Problem Constraints

- 1 <= |A| <= 100000
- 10^9 <= A[i] <= 10^9

#### Input Format : `The only argument given is the integer array A.`

#### Output Format : `Return whether the given array contains a subarray with a sum equal to 0.`

#### Examples :

**Input 1:** ` A = [1, 2, 3, 4, 5]`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `0`

**Input 2:** `A = [4, -1, 1]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `1`

#### Example Explanation

***Explanation 1:*** `No subarray has sum 0.`
***Explanation 2:*** `The subarray [-1, 1] has sum 0.`

</details>

### 12.8 Subarray Sum Equals K

<details>
<summary>SubArray -  SubArraySumK</summary>

#### Problem Description

```
Given an array of integers A and an integer B.
Find the total number of subarrays having sum equals to B.
```

#### Problem Constraints

- 1 <= length of the array <= 50000
- 1000 <= A[i] <= 1000

#### Input Format :

```
The first argument given is the integer array A.
The second argument given is integer B
```

#### Output Format : `Return the total number of subarrays having sum equals to B.`

#### Examples :

**Input 1:** `A = [1, 0, 1] B = 1`  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 1:** `4`

**Input 2:** `A = [0, 0, 0] B = 0` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  **Output 2:** `6`

#### Example Explanation

***Explanation 1:*** `[1], [1, 0], [0, 1] and [1] are four subarrays having sum 1.`

***Explanation 2:*** `All the possible subarrays having sum 0.`

</details>

---