public class RadixSort 
{
    static void radixSort(int a[])
    {
        int i,place,max=Integer.MIN_VALUE;

        //find the max element
        for(i=0;i<a.length;i++)
        {
            if(max<a[i])
            max=a[i];
        }

        //Apply countSort based on place digit of each element
        for(place=1;max/place>0;place*=10)
        {
            countSort(a, place);
            printArray(a);
        }

    }
    static void countSort(int a[],int place)
    {
        int i,count[],output[],maxDigit=Integer.MIN_VALUE;

        //find the maximum place digit
        for(i=0;i<a.length;i++)
        {
            if(maxDigit<((a[i]/place)%10))
            maxDigit=(a[i]/place)%10;
        }
        System.out.println("\n"+maxDigit);

        //Create the frequency array
        count=new int[maxDigit+1];
        for(i=0;i<a.length;i++)
        {
            count[(a[i]/place)%10]++;
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
            output[count[(a[i]/place)%10]-1]=a[i];
            count[(a[i]/place)%10]--;
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
        int a[]={5,45,6,100,1,3,34,73};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        radixSort(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}
//Time Complexity: O(d*n) where d = no. of digits of max element & since k<=10 so its ignored.
//Space Complexity: O(n) since k<=10 so its ignored.
//where k = max place digit