package Arrays.Sorting.Questions;

//Given an array of size N containing only 0s, 1s, and 2s, sort the array in ascending order.
//Input: [0,2,1,2,0,0]
//Output: [0,0,0,1,2,2]

public class SortZeroOneTwosArray
{
    static void sort(int a[])
    {
        int left=0,mid=0,right=a.length-1;
        while(mid<=right)
        {
            if(a[mid]==0)
            {
                swap(a, mid, left);
                left++;
                mid++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(a, mid, right);
                right--;
            }
        }
    }
    static void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
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
        int a[]={0,2,1,2,0,0};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        sort(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}
//Time Complexity: O(n) one pass
//Space Complexity: O(1)
//Above implemented algorithm is also known as Dutch National Flag Alogrithm
//This question can also be sorted using Count Sort alogrithm with the same time complexity O(n) and space complexity ~O(1) but it would have multiple passes. 
