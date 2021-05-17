package team.rapj.ptt.dao;

import java.io.File;

/**
 * Open the file to save or load data
 *
 * @author Kuihong Chen
 */
public class BaseConnection {
//    private static String SAVE_PATH = "./";
    private static String FILE_NAME = "cpytest.json";

    public static File connect() {
        File file = new File(FILE_NAME);

        return file;
    }

    public static int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        // search for right
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        int right = i;
        // 左右边界情况check！！！！
        if (j >= 0 && nums[j] != target) {
            return 0;
        }

        // search for left
        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        int left = j;
        return right - left - 1;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = new int[] {5, 7, 7, 8, 8, 10};
        search(arr, 8);
    }
}
