//Given an array, move all 0's to the end of it while maintaining the relative order of non zero elements.
//Provided it must be done in-place
//Sample Input: a=[0,5,0,3,4,2]
//Sample Output: a=[5,3,4,2,0,0]

class MoveZerosToEnd 
{
    static void moveZerosToEnd(int a[])
    {
        int i,j,n=a.length;
        boolean isSwapped=false;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]==0 && a[j+1]!=0)
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)
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
        int a[]={0,5,0,3,4,2};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        moveZerosToEnd(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}
//Time complexity: O(n^2)
//Space complexity: O(1)