class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0]; // Initialize the maximum sum to the first element

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);

            // If currentSum becomes negative, reset it to 0 to start a new subarray
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
