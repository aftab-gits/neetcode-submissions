class Solution {
    public int shipWithinDays(int[] weights, int days) 
        {
         int initialCap =1;
         int mid=0;
         int sum=0;
         int result=0;
        

        for(int i=0 ; i< weights.length ;i++)
        {
            initialCap = Math.max(weights[i],initialCap);
            sum= sum+weights[i];
        }
        int maxCap= sum;

        while(initialCap<= maxCap)
        {
            mid = initialCap + (maxCap - initialCap)/2;

            int myDays  =  calculateDays(weights, mid);

            if(myDays <= days)
            {   
                result=mid;
                maxCap = mid-1;
            }
            else 
            {
               initialCap = mid +1;
            }
           
        }
        return result;


        
    }

    public static int calculateDays(int[] weights , int mid)
    {
        int sum=0, days = 0;

        for(int i=0 ; i< weights.length ; i++)
        {
            sum = sum+ weights[i];
            if(sum==mid)
            {
                days++;
                sum=0;
            }
            else if(sum>mid)
            {
                sum=0;
                days++;
                i=i-1;
            }
            else if(sum<mid && i== weights.length-1)
            {
                days++;
            }
        }
        return days;
    }
        
    }
