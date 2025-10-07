package Arrays.Sorting.Questions;

//Sort an array of String elements in lexicographical order using Selection Sort

class LexicographicSort
{
    static void lexicographicSort(String a[])
    {
        int i,j,n=a.length;
        for(i=0;i<n-1;i++)
        {
            int min=i;
            for(j=i+1;j<n;j++)
            {
                if(a[min].compareToIgnoreCase(a[j])>0)
                min=j;
            }
            if(min!=i)
            {
                String temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
    }
    static void printArray(String a[])
    {
        for (String element : a) 
        {
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) 
    {
        String a[]={"papaya","lime","watermelon","apple","mango","kiwi"};
        System.out.println("ARRAY BEFORE SORTING:");
        printArray(a);
        lexicographicSort(a);
        System.out.println("\nARRAY AFTER SORTING:");
        printArray(a);
    }
}
//Time complexity: O(n^2)
//Space Complexity: O(1)