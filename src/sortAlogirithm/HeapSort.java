package sortAlogirithm;

import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] nums) {
        for (int i = (nums.length - 2) / 2; i >= 0; i--) {
            heapAdjust(nums, i, nums.length);
        }
        System.out.println(Arrays.toString(nums));

        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0 , i);
            heapAdjust(nums, 0, i);
        }
    }


//sift down 操作
    public static void heapAdjust(int[] nums, int start, int length) {
//        int child = 2 * start + 1;
        while (start * 2 + 1 < length) {
            int child = 2 * start + 1;

            if (child + 1 < length && nums[child] < nums[child + 1]) {
                child++; //bigger
            }
            if (nums[start] < nums[child]) {
                swap(nums, start, child);
            } else {
                break;
            }
            start = child;

        }
    }


    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 23, 30, 8, 32, 31, 41, 1, 15};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
