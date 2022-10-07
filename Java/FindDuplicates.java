//Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/

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