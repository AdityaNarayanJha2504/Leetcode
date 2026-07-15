class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sod=n*n;
        int sev=n*(n+1);
        int j=0;
        for(int i=sev;i>0;i--){
            if(sev%i==0 && sod%i==0){
                j=i;
                break;
            }
        }
        return j;

    }
}