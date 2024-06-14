class Solution {
  
  // [4,5,6,7,8,1,2,3], 8
  // [4,5,6,7,8,1,2,3], 8

  public int search(int[] nums, int target) {
    int l = 0, r = nums.length - 1, m = (l + r) / 2;

    while(l != m) {
      if(nums[l] == target) {
        return l;
      } else if (nums[m] == target) {
        return m;
      } else if (nums[r] == target) {
        return r;
      }

      if(
        nums[m] > nums[r] && nums[m] > target ||
        nums[m] < nums[r] && nums[m] < target && nums[r] > target
      ) {
        l = m + 1;
      } else {
        r = m;
      }
      
      m = (l + r) / 2;
    }

    if(nums[l] == target) {
      return l;
    } else if (nums[r] == target) {
      return r;
    }

    return -1;
  }
}