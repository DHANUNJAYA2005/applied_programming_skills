class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder sb=new StringBuilder("");
      for(int i=0;i<s.length();i++){
        char ch=Character.toLowerCase(s.charAt(i));
        if(Character.isLetterOrDigit(ch)){
            sb.append(ch);
        }
      }
     String string=sb.toString();
        int n=string.length();
        for(int i=0;i<string.length()/2;i++ ){
            if(string.charAt(i)!=string.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}