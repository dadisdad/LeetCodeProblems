package com.leetcode.solution.array;

/**
 * @author dadisdad
 * @date 2018/1/21
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsertByBSearch(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int high = nums.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] a = {1, 3};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;
        System.out.println(searchInsertByBSearch(a, target1));
        System.out.println(searchInsertByBSearch(a, target2));
        System.out.println(searchInsertByBSearch(a, target3));
        System.out.println(searchInsertByBSearch(a, target4));
    }
}
