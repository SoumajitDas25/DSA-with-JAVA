class SelectionSort 
{
    static void selectionSort(int a[])
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        { 
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                min=j;
            }
            if(min!=i)
            {
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
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
        int a[]={5,7,0,2,1};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        selectionSort(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}

//Time complexity: O(n^2) for all cases
//Space complexity: O(1)
