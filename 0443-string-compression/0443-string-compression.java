class Solution {
    public int compress(char[] chars) {
        int index=0;
        int n=chars.length;
        char curr_char;
        int i=0;
        while(i<n)
        {
            curr_char=chars[i];
            int count=0;
            while(i<n && chars[i]==curr_char)
            {
                count++;
                i++;
            }
            chars[index]=curr_char;
            index++;
            if(count>1)
            {
                String count_str = Integer.toString(count);
                int m =count_str.length();
                for(int j=0;j<m;j++){
                    chars[index]=count_str.charAt(j);
                    index++;
                }
            }
              }
              return index;
    }
}