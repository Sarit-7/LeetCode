class Solution {
    public int longestOnes(int[] nums, int k) {
        // int n = nums.length;
        // int maxlen = 0;

        // for (int i = 0; i < n; i++) {
        //     int zeroCount = 0;
        //     for (int j = i; j < n; j++) {
        //         if (nums[j] == 0) {
        //             zeroCount++;
        //         }
        //         if (zeroCount > k) {
        //             break;
        //         }
        //         maxlen = Math.max(maxlen, j - i + 1);
        //     }
        // }
        // return maxlen;



       int n = nums.length;
        int maxlen = 0, left = 0, zero = 0;
        
        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                zero++;
            }

            while (zero > k) {
                if (nums[left] == 0) {
                    zero--;
                }
                left++;
            }

            maxlen = Math.max(maxlen, right - left + 1);
        }
        
        return maxlen;


    }
}
