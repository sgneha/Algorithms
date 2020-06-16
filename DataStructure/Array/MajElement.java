package DataStructure.Array;

public class MajElement {
    public int majorityElement(int[] nums) {
        int count = 1;
        int element = nums[0];
        int l = nums.length;

        for (int i = 1; i < l; i++) {
            if (nums[i] == element)
                count++;
            else {
                count--;
                if (count == 0) {
                    count = 1;
                    element = nums[i];
                }
            }
        }
        return element;
    }

    public static void main(String[] args) {
        MajElement obj = new MajElement();
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        int result = obj.majorityElement(arr);
        System.out.println(result);
    }
}