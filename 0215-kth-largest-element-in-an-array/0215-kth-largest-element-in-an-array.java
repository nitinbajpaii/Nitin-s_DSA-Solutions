class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            minHeap.offer(nums[i]);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();

        
    }
}