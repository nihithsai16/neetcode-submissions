class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int rightmax=-1;
            for(int j=1+i;j<n;j++){
                rightmax=Math.max(rightmax,arr[j]);
            }
            ans[i]=rightmax;
        }
        return ans;
    }
}