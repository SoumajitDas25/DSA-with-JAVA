class MergeSort 
{
    static void merge(int a[],int l,int mid,int r)
    {
        int i,j,k,n1=mid-l+1,n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(i=0;i<n1;i++)
        {
            left[i]=a[l+i];
        }
        for(j=0;j<n2;j++)
        {
            right[j]=a[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            a[k++]=left[i++];
            else
            a[k++]=right[j++];
        }
        while(i<n1)
        {
            a[k++]=left[i++];
        }
        while(j<n2)
        {
            a[k++]=right[j++];
        }
    }
    static void mergeSort(int a[],int l,int r)
    {
        //base case
        if(l>=r)
        return;
        //subproblem
        int mid=(l+r)/2;
        mergeSort(a, l, mid);
        mergeSort(a, mid+1, r);
        //self work
        merge(a,l,mid,r);
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
        int a[]={5,45,6,0,-1,3};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        mergeSort(a,0,a.length-1);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
    
}
//Time complexity: O(nlogn) for all cases
//Space complexity: O(n)