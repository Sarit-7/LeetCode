class Solution {
    public int singleNumber(int[] ar) {
        int res = ar[0]; 
        for (int i = 1; i < ar.length; i++) 
            res = res ^ ar[i]; 
      
        return res;
    }
}