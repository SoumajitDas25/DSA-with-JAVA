package Arrays.Sorting.CountSort;

class CountSort
{
    static void countSort(int a[])
    {
        int i,count[],output[],max=Integer.MIN_VALUE;

        //find the maximum element
        for(i=0;i<a.length;i++)
        {
            if(max<a[i])
            max=a[i];
        }

        //Create the frequency array
        count=new int[max+1];
        for(i=0;i<a.length;i++)
        {
            count[a[i]]++;
        }
        //Update the frequency array by taking prefixSum
        for(i=1;i<count.length;i++)
        {
            count[i]=count[i]+count[i-1];
        }

        //create the final array based on the prefixSum array
        output=new int[a.length];
        for(i=a.length-1;i>=0;i--)
        {
            output[count[a[i]]-1]=a[i];
            count[a[i]]--;
        }

        //copy the output[] to original array
        for(i=0;i<a.length;i++)
        {
            a[i]=output[i];
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
        int a[]={5,45,6,0,1,3};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        countSort(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}
//Time Complexity: O(n) for best case, O(n+k) for worst & average case
//Space Complexity: O(n+k)
//where k = max element