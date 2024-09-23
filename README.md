# Data-Structure
## Basic Problems Solving
### 1. Count Factors - 2
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

### 2. IsPrime
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

### 3. Find Perfect Numbers
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

### 4. Good Pair
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

### 5. Reverse in a range
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

### 6. Array Rotation
<details>
<summary>ReverseArrayInRange</summary>

#### Problem Description
```
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
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

### 7. Max Min of an Array
<details>
<summary>MinMaxSumArray</summary>

#### Problem Description
```
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
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