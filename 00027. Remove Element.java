class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==val&&nums[j]!=val) nums[i++]=nums[j--]; 
            else if(nums[i]!=val) i++;
            else if(nums[j]==val) j--; 
        }
        return j+1;
    }
}
