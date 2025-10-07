package Arrays.Searching.Questions;

//Find the square root of a number with a given precision p.
//Input: n=11, p=3
//Output: 3.316

public class FindSquareRoot 
{
    static double findSquareRoot(int n,int p)
    {
        long l,u,target,mid,sqr=-1;
        target=n*(long)Math.pow(10,p*2);
        l=0;
        u=target;
        while(l<=u)
        {
            mid=l+(u-l)/2;
            if((long)mid*(long)mid==target)
            return mid;
            else if((long)mid*(long)mid<target)
            {
                sqr=mid;
                l=mid+1;
            }
            else
            u=mid-1;
        }
        return (double)(sqr/Math.pow(10, p));
    }
    public static void main(String[] args) 
    {
        System.out.println(findSquareRoot(11,3));
    }
}
//Time Complexity: O(log(n*10^(p^2)))
//Space Complexity: O(1)
//Dry run for n=3, p=2
// 0,30000 m=15000
// 0,14999 m=7499
// 0,7498 m=3749
// 0,3748 m=1874
// 0,1873 m=936
// 0,935 m=467
// 0,466 m=233
// 0,232 m=116, sqr=116
// 117,232 m=174
// 117,173 m=145, sqr=145
// 146,173 m=159, sqr=159
// 160,173 m=166, sqr=166
// 167,173 m=170, sqr=170
// 171,173 m=172, sqr=172
// 173,173 m=173, sqr=173
// 174,173
// return 1.73