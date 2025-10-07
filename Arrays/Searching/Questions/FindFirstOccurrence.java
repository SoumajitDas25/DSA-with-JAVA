package Arrays.Searching.Questions;

//Find the first occurrence of a given element x, given that the given array is sorted. If no occurence of x is found, then return -1. Solve it in O(log n) time complexity.
//Input: [2,5,5,5,6,6,8,9,9,9], x=5
//Output: 1

public class FindFirstOccurrence
{
    static int findFirstOccurrence(int a[], int target)
    {
        int l=0,u=a.length-1,mid,firstOccurrence=-1;
        while(l<=u)
        {
            mid=l+(u-l)/2;
            if(a[mid]==target)
            {
                firstOccurrence=mid;
                u=mid-1;
            }
            else if(a[mid]>target)
            u=mid-1;
            else
            l=mid+1;
        }
        return firstOccurrence;
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
        int a[]={2,5,5,5,6,6,8,9,9,9};
        System.out.println("ARRAY:");
        printArray(a);
        int index= findFirstOccurrence(a,9);
        if(index!=-1)
        System.out.println("\nELEMENT FIRST OCCURENCE AT INDEX "+index);
        else
        System.out.println("\nELEMENT NOT FOUND");
    }
}
//Time Complexity: O(log n)
//Space Complexity: O(1)