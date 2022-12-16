class Solution {
    public String longestPalindrome(String s) {
//         //for start and end character
//         int start=0,end=0;
//         for(int i=0;i<s.length();i++){
//             //the findlength function will give length of odd and even substring
//             int odd = findlength(s,i,i);
//             int even = findlength(s,i,i+1);
            
//             //find the maximum length   both even and odd
//             int len = Math.max(odd,even); //this length is greater than we earlier found
            
//             if(len>end-start){
//               start = i-(len-1)/2;
//               end=i+len/2;   
//             }
//         }
//          //substring does not add end , so end+1
//         return s.substring(start,end+1);
//     }
//         int findlength(String s,int left,int right){
//             while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
//                 left--;
//                 right++;
//             }
//             return right-left-1;
//         }
         // code here
        if(s.length()<2) //if the legth of string less than 2 return it
        {
            return s;
        }
        String max="";
        for(int i=0;i<s.length()-1;i++)
        {
            String odd = findPalindrome(s, i, i);
            String even = findPalindrome(s, i, i+1);
            
            if(odd.length()>max.length()){
                max = odd;
            }
            if (even.length() > max.length()) {
                max = even;
            }
        }
        return max;
    }
     static String findPalindrome(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--; right++;
        }
        return s.substring(left+1, right);
     }
}