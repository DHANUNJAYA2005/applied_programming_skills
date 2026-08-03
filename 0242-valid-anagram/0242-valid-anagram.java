class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        char ch[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        if(s.length()==t.length()  && Arrays.toString(ch).equals(Arrays.toString(ch2))){
            return true;
        }
        return false;
    }
}