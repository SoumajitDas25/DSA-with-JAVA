package Arrays.Searching.Questions;

//Given the rotated sorted array of integers,which contains distinct elements, and an integer target, return the index of target if it is in the array, otherwise return -1. Solve it in O(log n) time complexity.
//Input: [5,1,2,3,4] , target=1
//Output: 1

//Properties of Rotated Sorted Array:
//1. If l,mid,u are any indices in the array, then out of the two subarrays starting from [0,mid-1] & [mid,l], either both will be sorted or any one will be sorted & another will be unsorted.
//2. If x and y are any two indices in the array where a[x]<a[y], then the subarray[x,y] will be sorted.

public class TargetInRotatedSortedArray 
{
    static int findTarget(int a[],int target)
    {
        int l=0,u=a.length-1,mid;
        while(l<=u)
        {
            mid=l+(u-l)/2;
            if(a[mid]==target)
            return mid;
            if(a[mid]<a[u])
            {
                if(target>a[mid] && target<=a[u])
                l=mid+1;
                else
                u=mid-1;
            }
            else
            {
                if(target>=a[l] && target<a[mid])
                u=mid-1;
                else
                l=mid+1;
            }
        }
        return -1;
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
        int a[]={0,0,0,1,1,2,0,0,0};
        System.out.println("ARRAY:");
        printArray(a);
        System.out.println("\nINDEX OF THE MIN ELEMENT: "+findTarget(a,2));
    }
}
//Time Complexity: O(log n)
//Space Complexity: O(1)