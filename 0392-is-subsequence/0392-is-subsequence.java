class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0;
        int j=0;
         if(n==0 )
         {
            return true;
         }
        for(int o=0;o<m;o++)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                if(i==n)
                {
                    return true;
                }
            }
                j++;
            
        }
    return false;
        
    }
}