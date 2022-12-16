class Solution {
     public static int beauty(int[]freq)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i: freq)
        {
            if(i!=0)
            {
                min=Math.min(min,i);
                max=Math.max(max,i);
            }
        }
        return max-min;
    }
    public int beautySum(String s) {
         // code here
        int ans=0;
        // we are taking from size 3 becoz
        // aaa=0 , abc=0 , aab=1 so we taking 3 set 
        for(int size=3;size<=s.length();size++)
        {
            int i=0; //for 1st value pointer
            int j=size; // for 3rd value pointer
            //storing the frequency in arr
            int[] freq = new int[26]; //taking size as 26 because we have to determine only lowercase
            for(int l=i;l<j;l++){
                freq[s.charAt(l)-'a']++;
            }
            // add the frequency to ans
            ans+=beauty(freq);
            // to not go out of index
            while(j<s.length())
            {
                freq[s.charAt(j)-'a']++; //add the next char
                freq[s.charAt(i)-'a']--; //remove the next char
                //adding the next frequency
                ans+=beauty(freq);
                j++;
                i++;
            }
        }
        return ans;
    }
}