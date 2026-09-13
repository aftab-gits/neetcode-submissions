class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // List<List<Integer>> mainList =  new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        for(int i=0 ;i< nums.length ; i++)
        {
            int low=i+1;
            int high= nums.length-1;

            while(low<high)
           {

            if((i!=low)&&(low!=high)&&(i!=high))
            {
               if(nums[i]+ nums[low]+ nums[high]==0)
                {
                    List<Integer> list = Arrays.asList(nums[i],nums[low],nums[high]);
                    res.add(list);
                    low++;
                    high--;
                }
                else if(nums[i]+ nums[low]+ nums[high]>0)
                {
                    high--;
                }
                else
                {
                    low++;
                }

            }
           }


        }

        return new ArrayList<>(res);

        

        
        
        
    }
}
