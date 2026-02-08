class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [] arr = new int[m+n];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            arr[n+i]=nums2[i];
        }
        Arrays.sort(arr);
        int a = m+n;
        if(a%2!=0){
            int mid = a/2;
            return arr[mid];
        }
        else{
            int mid = a/2;
            return (arr[mid-1]+arr[mid])/2.0;
        }
    }
}