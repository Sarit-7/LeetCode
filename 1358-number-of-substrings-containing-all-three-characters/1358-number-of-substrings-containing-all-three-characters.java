class Solution {
    public int numberOfSubstrings(String s) {
        // int n = s.length();
        // int count = 0;

        // for (int i = 0; i < n; i++) {
        //     StringBuilder st = new StringBuilder();
        //     for (int j = i; j < n; j++) {
        //         st.append(s.charAt(j));
        //         if (st.indexOf("a") != -1 && st.indexOf("b") != -1 && st.indexOf("c") != -1) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int n=s.length();
        int count= 0;
        int[] arr = new int[3];

        for(int i=0;i<3;i++){
            arr[i]=-1;
        }

        for(int i=0;i<n;i++){

            arr[s.charAt(i)-'a'] = i;   
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1) {
                count+=1+Math.min(arr[0],Math.min(arr[1],arr[2]));  //minimum among 3
            }

        }
        return count;








    }
}
