package session45;

class Solution {
    public int majorityElement(int[] nums) {
     int ans=0;
     int cnt=0;
     for(int i=0;i<nums.length;i++){
         if(cnt==0) ans = nums[i];
         if(ans==nums[i]) cnt++;
         else cnt--;
     }
        return ans;
    }
}