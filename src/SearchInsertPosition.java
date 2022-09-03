class Solution {
    public int searchInsert(int[] arr, int k) {
        
        int low = 0;
        int high = arr.length-1;
        int ans =-1;
        
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans == -1 ? arr.length : ans;
    }
}