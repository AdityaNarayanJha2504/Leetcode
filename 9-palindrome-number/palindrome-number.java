class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        StringBuffer rev=new StringBuffer(s.length());
        StringBuffer sb =new StringBuffer(s);
        int n=s.length()-1;
        for(int i=0;i<sb.length();i++){
            rev.append(sb.charAt(n));
            n--;
        }
        if(s.equals(rev.toString())){
            return true;
        }
        return false;
        
    }
}