class Solution {
    public int[] twoSum(int[] nums, int k) {
        
        HashMap<Integer,Integer>hm = new HashMap();
        int[]ans = new int[2];
        
        for(int i = 0 ;i<nums.length ; i++){
            
            if(hm.containsKey( nums[i] )){
                ans[0]=i;
                ans[1]=hm.get(nums[i]);
                System.out.println(hm.get(nums[i]));
                break;
            }else{
                hm.put((k-nums[i]) ,i);
                 System.out.println(hm.get(nums[i]));
            }
            
        }
         System.out.println(hm);
        
        return ans;
        
    }
}