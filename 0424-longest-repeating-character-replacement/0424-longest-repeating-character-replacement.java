class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int maxlen = 0, maxFreq = 0;
        int l = 0;
        int n = s.length();

        for (int r = 0; r < n; r++) {
            arr[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, arr[s.charAt(r) - 'A']);
            int changes = (r - l + 1) - maxFreq;

            if (changes > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
        }
        return maxlen;
    }
}
