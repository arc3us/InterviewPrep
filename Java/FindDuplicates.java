//Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant extra space.

 

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]


import java.util.*;
class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList <Integer>();
        for(int i=0; i<nums.length; i++)
        {
            int ind = Math.abs(nums[i]);
            if(nums[ind-1]>0)
            {
                nums[ind-1]=nums[ind-1]*(-1);
            }
            else
            {
                res.add(Math.abs(nums[i]));
            }
        }
        
        return res;
    }
}
