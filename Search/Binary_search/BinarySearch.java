package Search.Binary_search;

public class BinarySearch {

    public int search(int[] nums, int target) {
        return binary_search(nums, 0, nums.length - 1, target);

    }

    public int binary_search(int[] nums, int l, int r, int target) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return mid;
            if (target < nums[mid])
                return binary_search(nums, 0, mid - 1, target);
            return binary_search(nums, mid + 1, r, target);
        }
        return -1;

    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 3, 5, 12, 9 };
        BinarySearch obj = new BinarySearch();
        int index = obj.search(nums, 12);
        System.out.println("Index " + index);
    }
}
