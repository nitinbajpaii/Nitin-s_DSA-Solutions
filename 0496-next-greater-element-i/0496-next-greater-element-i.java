class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int curr = nums1[i];
            int ans =-1;

            for(int j=0;j<m;j++){
                if(nums2[j]==curr){
                    for(int k=j+1;k<m;k++){
                        if(nums2[k]>curr){
                            ans = nums2[k];
                            break;
                        }
                    }

                }
            }
            res[i]=ans;
        }
        return res;
    }
}