class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        int maxVowels=0;
        int n= s.length();
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count+=1;
            }
        }
         maxVowels = count;  // Initialize maxVowels with the first window count
        
        // Sliding window approach
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;  // Add new vowel
            }
            if (isVowel(s.charAt(i - k))) {
                count--;  // Remove outgoing vowel
            }
            
            maxVowels = Math.max(maxVowels, count); // Update max vowels found
        }
        
        return maxVowels;
    }
      private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}