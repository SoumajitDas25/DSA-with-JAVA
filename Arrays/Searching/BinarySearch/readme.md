# **Binary Search Algorithm**
- ### _The array is divied into 2 havles around the mid element._
- ### _If a[mid]==target, then return true(indicating element is found)._
- ### _If a[mid]>target, then find in the lower half._
- ### _Id a[mid]<target, then find in the upper half._
- ### _If the search space becomes empty without finding the element, then return false(indicating element is not found)._

- ### _It is an in-place algorithm(iterative approach)._

## **Complexity Analysis**

- ### Time Complexity : O(log n)
- ### Space Complexity: O(1) for iterative approach, O(log n) for recursive approach 
