class BinarySearch
{
    //Iterative Approach
    static int binarySearch(int a[],int target)
    {
        int l=0,u=a.length-1,mid;
        while(l<=u)
        {
            mid=l+(u-l)/2; //a better approach for calculating mid
            if(a[mid]==target)
            return mid;
            else if(a[mid]>target)
            u=mid-1;
            else 
            l=mid+1;
        }
        return -1;
    }
    //Recursive Approach
    static int binarySearch(int a[],int l,int u,int target)
    {
        //base case
        if(l>u)
        return -1;
        //recursive case
        int mid=l+(u-l)/2;
        if(a[mid]==target)
        return mid;
        else if(a[mid]>target)
        return binarySearch(a,l,mid-1,target);
        else
        return binarySearch(a,mid+1,u,target);
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
        int a[]={-4,-2,1,3,45,69};
        System.out.println("ARRAY:");
        printArray(a);
        int index=binarySearch(a,0,a.length-1,69);
        if(index!=-1)
        System.out.println("\nELEMENT FOUND AT INDEX "+index);
        else
        System.out.println("\nELEMENT NOT FOUND");
    }
}