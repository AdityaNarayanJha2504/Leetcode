class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int rev=Math.abs((arr[i]-'a')-26);
            int pro=rev*(i+1);
            sum+=pro;
        }
        return sum;
    }
}