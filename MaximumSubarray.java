package Array;


class MaximumSubarray {
    public int maxSubArray(int[] arr) {

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for(int val: arr){
            curSum += val;
            if(maxSum > curSum){
                maxSum = maxSum;
            }
            else{
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
}
