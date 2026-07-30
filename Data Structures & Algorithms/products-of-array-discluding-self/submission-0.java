class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            int left = 1;
            int right = 1;

            for (int j = i + 1; j < nums.length; j++) {
                left *= nums[j];
            }

            for (int j = i - 1; j >= 0; j--) {
                right *= nums[j];
            }

            output[i] = left * right;

        }

        return output;
    }
}  
