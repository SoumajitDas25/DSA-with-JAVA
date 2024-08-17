class BubbleSort
{
    static void bubbleSort(int a[])
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            boolean isSwapped=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) //if no swap has occured in current iteration,then it means array is sorted, so no need to continue the loop
            break;
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
        bubbleSort(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}

//Time complexity: O(n) for best case, O(n^2) for worst & average case
//Space complexity: O(1)