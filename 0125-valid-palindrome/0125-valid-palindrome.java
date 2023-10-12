class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i< s.length() ;i ++){
                    if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i)))
                            sb.append(s.charAt(i));
            }
      int begin = 0 ;
      int end = sb.length()-1;
      while(begin<end)
      {
          if(sb.charAt(begin)!=sb.charAt(end))
          return false;
          else
          begin++;
          end--;
      }  
      return true;
    }
}