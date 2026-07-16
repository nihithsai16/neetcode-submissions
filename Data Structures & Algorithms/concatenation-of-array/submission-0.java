class Solution {
    public int[] getConcatenation(int[] nums) {
int a = 2 * nums.length;
int b=nums.length;
int[] ans = new int[a];
for(int i=0;i<b;i++){
    ans[i]=nums[i];
}
int c=b;
for(int i=0;i<b;i++){
    ans[c+i]=nums[i];
}
return ans;
    }
}