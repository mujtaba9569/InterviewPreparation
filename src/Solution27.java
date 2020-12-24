//O(n)
class Solution27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) {
            return 0;
        }
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
               nums[i] = nums[j];
               i++;
            }
            j++;
        }
        return i;
    }
}