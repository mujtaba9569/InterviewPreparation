class Solution88 {
    
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        //2 approaches .
        // first one is to merge both and then sort.
        /*int len = m + n;
        int i = 0, j = 0, k = 0;
        while (i < len) {
            if (i < m) {
                i++;
            } else {
                nums1[i] = nums2[j];
                j++;
                i++;
            }
        }
            Arrays.sort(nums1);
    }*/
        //2nd one is to compare both arrays and swap and then append the remaining 
        int i = m - 1, j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}