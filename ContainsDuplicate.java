package Array;


import java.util.Arrays;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] arr) {

        int  n= arr.length;
        boolean flag = false;
        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                flag = true;
            }
        }
        return flag;
    }
}