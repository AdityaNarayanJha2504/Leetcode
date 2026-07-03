class Solution {
    public int maxArea(int[] nums) {
        // int n=height.length;
//         Map<Integer,Integer>map=new HashMap<>();
//         int multi[]=new int[n];
//         for(int i=0;i<n;i++){
//             map.put(i,height[i]);
//         }
//         for(int i=0;i<n;i++){
//             multi[i]=map.get(i)*(i+1);
//         }
//         int max=multi[0];
//         int ctr=0;
//         for(int i=0;i<n;i++){
//             if((multi[i]*i)>(max*i)){
//                 max=multi[i];
//                 ctr=i;
//             }
//         }
//         return map.get(ctr)*map.get(ctr);
        // int start=0;
        // int end=n-1;
        // while(end-start>0){
        //     if(height)
        // }
        int ans=0;
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(nums[start]<nums[end]){
                ans=Math.max((end-start)*nums[start],ans);
                start++;
            }
            else{
                ans=Math.max((end-start)*nums[end--],ans);
            }
        }
        return ans;
    }
}