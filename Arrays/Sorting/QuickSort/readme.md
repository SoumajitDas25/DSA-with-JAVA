# **Quick Sort Algorithm**
- ### _In every recursive call,_
    - ### _A random pivot element between the range(start-end) is chosen & is placed at its right position by counting the smaller numbers & then swapping it with the element present at  pivotIndex(start+count) & further moving all smaller elements before the pivot & larger elements after the pivot (self-work)._
    - ### _The array is then partitioned into two halves around the pivot element & is sorted using recursion (subproblem)._

- ### _It is an in-place algorithm._

- ### _It is not a stable sort algorithm (i.e.,relative order of duplicate elements does not remain same in the final sorted array)._

## **Complexity Analysis**

- ### Time Complexity 
    |Best Case|Average Case|Worst Case|
    |-|-|-|
    |Ω(nlogn)|Θ(nlogn)|O(nlogn) using randomised quick sort
    |-|-|O(n^2) without randomised quick sort
    |

- ### Space Complexity
    |Best Case|Average Case|Worst Case|
    |-|-|-|
    |Ω(logn)|Θ(logn)|O(logn) using randomised quick sort
    |-|-|O(n) without randomised quick sort
    |
    - _Space Complexity can be written as O(1) if implicit stack is ignored/not considered._