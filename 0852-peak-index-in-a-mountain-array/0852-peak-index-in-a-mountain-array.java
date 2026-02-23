class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start=0;
        int end = n-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end = mid;
            }
            mid = start+(end-start)/2;
        }
        return start;
    }
}