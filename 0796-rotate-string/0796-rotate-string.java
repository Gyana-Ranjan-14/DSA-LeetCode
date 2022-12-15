class Solution {
    public boolean rotateString(String s1, String s2) {
        if(s1.length()!=s2.length()){ //if the length is not same then it can not be
            return false;
        }
        else{
            return (s1+s1).contains(s2); //add two string then check if s1 contains s2
        }
    }
}