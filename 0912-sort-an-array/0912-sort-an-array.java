
class Solution {
    public int[] sortArray(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    static int[] helper(int[] nums, int start, int end) {
        if (start > end) {
            return new int[0];
        }

        if (start == end) {
            return new int[]{nums[start]};
        }

        int mid = start + (end - start) / 2;

        int[] left = helper(nums, start, mid);
        int[] right = helper(nums, mid + 1, end);

        return mergeSort(left, right);
    }

    static int[] mergeSort(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        int nums1 = left.length;
        int nums2 = right.length;

        int[] sort = new int[nums1 + nums2];

        while (i < nums1 && j < nums2) {
            if (left[i] <= right[j]) {
                sort[k++] = left[i++];
            } else {
                sort[k++] = right[j++];
            }
        }

        while (i < nums1) {
            sort[k++] = left[i++];
        }

        while (j < nums2) {
            sort[k++] = right[j++];
        }

        return sort;
    }
}
