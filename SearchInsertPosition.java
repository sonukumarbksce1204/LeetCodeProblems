/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
*/



class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int u=nums.length-1;
        // int f=0;//
        int mid=0;
        if(target<nums[0]){
            return 0;
        }
        else if(target>nums[nums.length-1]){
            return nums.length;
        }
        else{
        while(l<=u){
            mid=l+(u-l)/2;
            if(nums[mid]==target){
                return mid;
                // f=1;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
            else{
                u=mid-1;
            }
        }
        }
        //if(target>nums[mid])
        return l;
        //return mid-1;
        
    }
}
