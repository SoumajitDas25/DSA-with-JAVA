# **Bubble Sort Algorithm**
- ### _We do a certain no of passes/iterations & in every pass, we compare adjacent elements & swap them if they are in the wrong order._
- ### _In every ith-iteration, the largest element in the subarray to be processed moves to its correct postion._
- ### _It is an in-place algorithm._
- ### _It is a stable sort algorithm (i.e.,relative order of duplicate elements remains same in the final sorted array)._
- ### _We can optimize the algorithm by stopping the process further if the array is already sorted at some iteration._

## **Complexity Analysis**

Best Case(Optimized)|Best Case(unoptimzed)|Average Case|Worst Case|
|-|-|-|-|
|O(n)|O(n^2)|O(n^2)|O(n^2)