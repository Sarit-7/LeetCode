class Solution {
    public int majorityElement(int[] v) {
          int n=v.length;
       
        int z=n/2;

        HashMap <Integer,Integer>map=new HashMap<>();
        for(int x : v)
        {
            map.put(x,map.getOrDefault(x,0)+1);
              if (map.get(x) > z)
               {
                return x;
               }
        }
        return -1;
            
    }
}