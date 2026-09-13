class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        

        Map<Integer, List<Integer>> map =  new HashMap<>();

    for(int i=0 ; i<nums.length ; i++)
    {
        if(!map.containsKey(nums[i]))
        {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            map.put(nums[i],list);
        }
        else
        {
            List<Integer> newList = map.get(nums[i]);
            newList.add(i);
            map.put(nums[i], newList);
            
        }
    }

    for(Map.Entry entry : map.entrySet())
    {
        int key = (int)entry.getKey();
        List<Integer> myList = (List)entry.getValue();
        int[] arr = myList.stream()
                          .mapToInt(Integer::intValue)
                          .toArray();
        if(arr.length>=2)
        {
            for(int i=1; i< arr.length;i++)
            {
                int diff = arr[i]-arr[i-1];
                if(diff<0)
                {
                    diff = diff * -1;
                }
                
                if(diff<=k)
                {
                    return true;
                }
            }
        }
        
    }

    return false;
    }
}