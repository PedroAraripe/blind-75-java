class Solution {
  public int maxSubArray(int[] nums) {
    int bestSum = nums[0];
    int currentSum = nums[0];

    if(nums.length == 1) {
      return bestSum;
    }
    
    for(int i = 1; i < nums.length; i++) {
      int num = nums[i];
      
      if(currentSum < 0 && num > currentSum) {
        currentSum = num;
      } else {
        currentSum += num;
      }

      if(currentSum > bestSum) {
        bestSum = currentSum;
      }
    }

    return bestSum;
  }
}