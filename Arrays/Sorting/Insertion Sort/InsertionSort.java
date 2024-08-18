class InsertionSort 
{
    static void insertionSort(int a[])
    {
        int i,j,temp,n=a.length;
        for(i=1;i<n;i++)
        {
            temp=a[i];
            for(j=i-1;j>=0 && temp<a[j];j--)
            {
                a[j+1]=a[j];
            }
            a[j+1]=temp;
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
        insertionSort(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}

//Time complexity: Ω(n) for best case, Θ(n^2) for average case, O(n^2) for worst case
//Space complexity: O(1)