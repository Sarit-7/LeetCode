class Solution {
    private void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        int n = str.length;

        // Reverse the entire string
        reverse(str, 0, n - 1);

        // Reverse individual words and remove extra spaces
        int i = 0;
        int j = 0;
        int wordCount = 0;

        while (j < n) {
            while (j < n && str[j] == ' ') j++; // Skip leading spaces
            if (j == n) break;

            if (wordCount > 0) {
                str[i++] = ' '; // Add a single space between words
            }

            int start = i;
            while (j < n && str[j] != ' ') //this is for multiple spaces between the words
            {
                str[i++] = str[j++];
            }
            reverse(str, start, i - 1);
            wordCount++;
        }

        // Remove any trailing spaces
        int finalLength = i;
        while (finalLength > 0 && str[finalLength - 1] == ' ') {
            finalLength--;
        }

        return new String(str, 0, finalLength);
    }
}

