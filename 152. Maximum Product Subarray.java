class Solution {
    public int maxProduct(int[] nums) {
      int ans = Integer.MIN_VALUE;
      int suf=1,pre=1;
      for(int i=0;i<nums.length;i++){
        if(suf==0) suf=1;
        if(pre==0) pre=1;
        suf*=nums[i];
        pre*=nums[nums.length-1-i];
        ans = Math.max(ans,Math.max(pre,suf));
      }
      return ans;  
    }
}
