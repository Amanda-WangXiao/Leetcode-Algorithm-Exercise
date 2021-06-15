class Solution {    //  1 ms    38.4 MB
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int result_index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                result_index = i;
            }
        }

        return result_index;
    }
}