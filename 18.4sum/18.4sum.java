class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {//1 0 -1 0 -2 2
        //-4 -1 -1 0 1 2
        int temp;
        List<List<Integer>> myList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                int left = j + 1 ;//2
                int right = nums.length - 1 ;//5
                long subtarget = (long)target - nums[i] - nums[j];
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                while(left < right){
                    long sum = (long)nums[left]+nums[right];

                    if( sum > subtarget){
                        right--;
                    }else if( sum < subtarget ){
                        left++;
                    }else{
                        List<Integer> list = new ArrayList<>( Arrays.asList(nums[i],nums[j],nums[left++],nums[right--]) );
                        System.out.println(list);
                        if(!myList.contains(list)){
                            myList.add(list);
                        }
                    }
                }
            }
        }
        return myList;

    }
}