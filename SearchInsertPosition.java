class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int k = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == target){
                k = i;
            }else if(nums[i] < target){
                k = i+1;
            }

        }
        return k;
    }
}