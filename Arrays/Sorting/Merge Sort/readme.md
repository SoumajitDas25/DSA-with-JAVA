# **Merge Sort Algorithm**
- ### _In every recursive call,_
  - ### _The Array is divided into 2 halves_
  - ### _The two subarrays are sorted separately using recursion (subproblem)._
  - ### _The two sorted subarrays are now merged to create an overall sorted array (self-work)._
- ### _It is not an in-place algorithm._
- ### _It is a stable sort algorithm (i.e.,relative order of duplicate elements remains same in the final sorted array)._

## **Complexity Analysis**

- ### Time Complexity 
    |Best Case|Average Case|Worst Case|
    |-|-|-|
    |Ω(nlogn)|Θ(nlogn)|O(nlogn)|

- ### Space Complexity: O(n)