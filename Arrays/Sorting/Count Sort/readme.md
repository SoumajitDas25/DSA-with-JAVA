# **Count Sort Algorithm**
- ### _Find the max element in the array._
- ### _Create a Frequency array from the original array by Counting the no. of occurences of its each element._
- ### _Convert the frequency array into its prefix sum array._
- ### _Traverse the original array from end to start and place each element into its correct position in the output array by determining the last index of each repeated/non-repeated element from the prefix sum array & decrementing the postion by 1 after placing each element._
- ### _It is not an in-place algorithm._
- ### _It is a Stable sort algorithm._

## **Complexity Analysis**

- ### Time Complexity 
    |Best Case|Average Case|Worst Case|
    |-|-|-|
    |Ω(n)|Θ(n+k)|O(n+k)|

- ### Space Complexity: O(n+k)
  ### _where k = max element_ 

- ### _Not a good algorithm when k/range is too large._