class Solution {
    public int minEatingSpeed(int[] piles, int h) {


        int left =1;
        int right = piles[0];
        int result=0;

        for(int i=0 ; i< piles.length ;i++)
        {
            right = Math.max(piles[i], right);
        }

        while(left<=right)
        {
            int mid = left + (right-left)/2;
            long hours= calculateHours(piles,mid);

            if(hours<=h)
            {   
                result= mid;
                right = mid-1;
            }
            else
            {   
                left = mid+1;

            }

            
        }

        return result;







        
    }

    public static long calculateHours(int[] piles, int mid)
    {   
        long hours=0;
        for(int i : piles)
        {
            if(i % mid == 0)
            {
                hours= hours + (i/mid);
            }
            else
            {
                hours = hours + (i/mid)+1;
            }
        }

        return hours;
    }
}