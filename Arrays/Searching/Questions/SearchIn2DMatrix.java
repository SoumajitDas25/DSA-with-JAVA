package Arrays.Searching.Questions;

//Search the target value in 2d integer matrix of dimensions of m*n and return true if found, else return false. This matrix has the following properties:
//1. Integers in each row are sorted from left to right.
//2. The first integer of each row is greater than the last integer of the previous row. 
//Solve it in O(log m*n) time complexity. 
//Input: [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target=3
//Output: true

public class SearchIn2DMatrix
{
    static boolean isTargetFound(int a[][],int target)
    {
        int l,u,mid,m=a.length,n=a[0].length;
        l=0;
        u=(m*n)-1;
        while(l<=u)
        {
            mid=l+(u-l)/2;
            if(a[mid/n][mid%n]==target)
            return true;
            else if(a[mid/n][mid%n]>target)
            u=mid-1;
            else
            l=mid+1;
        }
        return false;
    }
    static void printMatrix(int a[][])
    {
        for(int arr[]:a)
        {
            for(int element:arr)
            {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int a[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println("THE MATRIX: ");
        printMatrix(a);
        if(isTargetFound(a, 3))
        System.out.println("TARGET FOUND");
        else
        System.out.println("TARGET NOT FOUND");
    }
}
//Time Complexity: O(log(m*n))
//Space Complexity: O(1)