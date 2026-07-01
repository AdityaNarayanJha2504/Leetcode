class Solution {
    public void rotate(int[][] m) {
        for(int i=0;i<m.length;i++){
            for(int j=i;j<m[i].length;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int i=0;i<m.length;i++){
            int s=0;
            int end=m[i].length-1;
            while(s<end){
                int temp=m[i][s];
                m[i][s]=m[i][end];
                m[i][end]=temp;
                s++;
                end--;
            }
        }
    }
}
