class Solution35 {
    public int searchInsert(int[] nums, int target) {
     
        /*// O(n)
        int i = 0,j = 0;
        //if (nums.length == 0) {
        //    return 0;
        //}
        while (i < nums.length) {
            if (nums[i] == target) {
                return i;
            }
            i++;
        }
        while (j < nums.length) {
            if (target < nums[j]) {
                return j;
            } 
            if (j == nums.length-1) {
                return j+1;
            }   
            j++;
        }*/
        //using binary search O(log n)
        int start = 0, end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start) /2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
       return start;       
   }
}