class Solution {
    public int numberOfSubarrays(int[] nums, int goal) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }

        }
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

     private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;
        int n = nums.length;
        int count = 0, sum = 0, l = 0;

        for (int r = 0; r < n; r++) {
            sum += nums[r];

            while (sum > goal) {
                sum -= nums[l];
                l++;
            }

            count += r - l + 1;
        }

        return count;
    }
}