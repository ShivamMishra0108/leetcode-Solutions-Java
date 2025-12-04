package Array;

class MissingElement {
    public int missingNumber(int[] arr) {

        // int n = nums.length ;
        // int arraySum =0;
        // int sum = n*(n+1)/2;

        // for(int i=0; i<n; i++){
        //     arraySum += nums[i];
        // }
        // return sum - arraySum;

        int n = arr.length;
        int i = 0;

        while (i< arr.length){
            if(arr[i] == i || arr[i] == n)i++;
            else{
                int idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }

        }

        for ( i=0; i<arr.length; i++){
            if(arr[i] != i)return arr[i];
        }
        return n;

    }
}
