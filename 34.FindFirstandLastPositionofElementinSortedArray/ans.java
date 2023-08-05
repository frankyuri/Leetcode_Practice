class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {0,0};
        int count = 0;
        boolean left = false ;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                if(!left){
                    ans[0] = i;
                    ans[1] = i;
                    left = true;
                }else{
                    ans[1] = i;
                }
            }
        }
        if(!left){
            int[] exp = {-1,-1};
            return exp;
        }
        return ans;
    }
}