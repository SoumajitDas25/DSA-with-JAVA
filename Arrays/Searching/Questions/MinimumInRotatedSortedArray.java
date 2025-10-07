package Arrays.Searching.Questions;

//A rotated sorted array is a sorted array on which rotation operation has been performed some number of times. Given a rotated sorted array, find the index of the minimum element in the array. Follow 0-based indexing. It is guranteed that all the elements in the array are unique. Solve it in O(log n) time complexity.
//Input: [3,4,5,1,2]
//Output: 3

class MinimumInRotatedSortedArray
{
    static int findMinimum(int a[])
    {
        int l=0,u=a.length-1,mid,min_index=-1;
        //A rotated sorted array consits of 2 sorted arrays where first sorted array contains all elements greater than the last element & the second sorted array contains all elements less than or equal to the last element & its first element will be the min element.
        while(l<=u)
        {
            mid=l+(u-l)/2;
            if(a[mid]>a[a.length-1]) //when we are in the first sorted array, then we have to move towards the second sorted array to the right
            l=mid+1;
            else
            { //when we are in the second sorted array, then we have to move towards its left to find the min element
                min_index=mid;
                u=mid-1;
            }
        }
        return min_index;
    }
    static void printArray(int a[])
    {
        for (int element : a) 
        {
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) 
    {
        int a[]={3,4,5,1,2};
        System.out.println("ARRAY:");
        printArray(a);
        System.out.println("\nINDEX OF THE MIN ELEMENT: "+findMinimum(a));
    }
}
//Time Complexity: O(log n)
//Space Complexity: O(1)