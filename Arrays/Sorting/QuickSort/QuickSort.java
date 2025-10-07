package Arrays.Sorting.QuickSort;

public class QuickSort
{
    static int partition(int a[],int start,int end)
    {
        int i,j,pivotElement,count=0;
        // pivotElement = a[start]; //to avoid worst case
        int randomIndex=(int)(Math.random()*(end-start)+start);
        pivotElement = a[randomIndex];
        System.out.println(randomIndex);
        for(i=start;i<=end;i++)
        {
            if(pivotElement>a[i])
            count++;
        }
        int pivotIndex=start+count;
        // swap(a, start, pivotIndex); // to avoid worst case
        swap(a, randomIndex, pivotIndex);

        i=start;
        j=end;
        while(i<pivotIndex && j>pivotIndex)
        {
            while(a[i]<=pivotElement) 
            i++;
            while(a[j]>pivotElement) 
            j--;
            if(i<pivotIndex && j>pivotIndex)
            {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void quickSort(int a[],int start,int end)
    {
        //base case
        if(start>=end)
        return;
        //self-work
        int pivotIndex = partition(a, start, end);
        //subproblem
        quickSort(a, start, pivotIndex-1);
        quickSort(a, pivotIndex+1, end);
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
        int a[]={0,23,45,-3,-1,4};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        quickSort(a,0,a.length-1);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}
//Time complexity: O(nlogn) for best & average case and O(n^2) for worst case(can be avoided using randomised quick sort)
//Space Complexity: O(logn) for best & average case and O(n) for worst case(can be avoided using randomised quick sort)
//Space Complexity can be written as O(1) if implicit stack is ignored/not considered.