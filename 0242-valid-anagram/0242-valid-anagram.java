class Solution {
    public boolean isAnagram(String s1, String s2) {
       // Your code here
       char charArray[] = s1.toCharArray();
       Arrays.sort(charArray);
       char charArray2[] = s2.toCharArray();
       Arrays.sort(charArray2);
       
      //The equals() method compares two strings, and returns true if the strings are equal, and false if not. 
      return Arrays.equals(charArray,charArray2);

    }
}