//Time Complexity=O(n)
//using Hashmap the complexity is O(1) & we are having a for loop //to traverse the array which contains n items . therefore the //time complexity is O(n).
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sum = new HashMap<>();
        for ( int i = 0; i<nums.length; i++) {
             int difference = target - nums[i];
             if (sum.containsKey(difference)) {
                int[] result = new int []{sum.get(difference),i};
                return result;
             }
            sum.put(nums[i],i);
        }
    return null;
    }
}

