package Arrays.Sorting.Questions;

//Given an array where all elements are sorted in ascending order excpet two swapped elements,sort it in linear time. Assume there are no duplicates in the array.
//Input: [3,8,6,7,5,9,10]
//Output: [3,5,6,7,8,9,10] 
class SortTwoSwappedElementsArray
{
    static void sortTwoSwappedElementsArray(int a[])
    {
        if(a.length<=1)
        return;

        int i,k1=-1,k2=-1;
        //traverse the array & store the indices of those 2 elements
        for(i=1;i<a.length;i++)
        {
            if(a[i]<a[i-1])
            {
                if(k1==-1)
                {
                    k1=i-1;
                    k2=i;
                }
                else
                k2=i;
            }
        }
        //swap these elements
        int temp=a[k1];
        a[k1]=a[k2];
        a[k2]=temp;
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
        int a[]={3,8,6,7,5,9,10};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        sortTwoSwappedElementsArray(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}
//Time complexity: O(n)
//Space Complexity: O(1)