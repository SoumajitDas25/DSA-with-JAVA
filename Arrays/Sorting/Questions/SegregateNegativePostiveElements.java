package Arrays.Sorting.Questions;

//Given an array of positive & negative integers, segregate them in linear time and constant space. The output should print all ngeative numbers, followed by all positive numbers.
//Input: [19,-20,7,-4,-13,11-5,3]
//Output: [-20,-4,-13,-5,7,11,19,3]

public class SegregateNegativePostiveElements 
{
    static void segregate(int a[])
    {
        int left=0,right=a.length-1;
        while(left<right)
        {
            if(a[left]<0)
            left++;
            if(a[right]>0)
            right--;
            if(a[left]>0 && a[right]<0)
            {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }

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
        int a[]={19,-20,7,-4,-13,11-5,3};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        segregate(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}
//Time complexity: O(n)
//Space Complexity: O(1)