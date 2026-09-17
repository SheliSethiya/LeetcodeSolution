class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target); //lowerbound(nums,2)
        int last = upperBound(nums, target) - 1;//upperbound(nums,2)-1

        if (first == nums.length || nums[first] != target)
            return new int[]{-1, -1};

        return new int[]{first, last};
    }

    int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target) l = m + 1;
            else r = m;
        }
        return l;
    }

    int upperBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] <= target) l = m + 1;
            else r = m;
        }
        return l;


    }
}