class Solution {
    public int pivotIndex(int[] nums) {
        for (int i=0; i < nums.length; i++) {
            int j=0;
            int leftsum = 0, rightsum = 0;
            while (j < i) {
                leftsum = leftsum + nums[j];
                j++;
            }
            j = nums.length - 1;
            while (j > i) {
                rightsum = rightsum + nums[j];
                j--;
            }
            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }
}