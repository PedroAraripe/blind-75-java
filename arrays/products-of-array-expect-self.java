package arrays;

class Solution {
  public int[] productExceptSelf(int[] nums) {
      int total = 1;
      int [] numsProduct = new int[nums.length];

      for(int i = 0; i < nums.length ; i++) {
        int num = nums[i];

        numsProduct[i] = total;
        total *= num;
      }

      if(nums.length < 2) {
        return numsProduct;
      }

      total = nums[nums.length - 1];

      for(int i = nums.length - 2; i >= 0 ; i--) {
        int num = nums[i];

        numsProduct[i] *= total;
        total *= num;
      }

      return numsProduct;
  }
}
