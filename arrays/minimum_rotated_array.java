class Solution {
  public int findMin(int[] nums) {
    // Example 2:
    // Input: nums = [4,5,6,7,0,1,2]
    // Output: 0
    // Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
    
    // Example 3:
    // Input: nums = [11,13,15,17]
    // Output: 11
    // Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 

    // binary search probably

    // l = 0,                  m = 3,                  r = nums.length - 1 -> 6
    // nums[l] = 4,            nums[m] = 7,            nums[r] = 2

    // if mid > right, the smaller is in right
    // left = mid + 1 -> 4
    // mid = (left + right) / 2 -> 5

    
    // [3,4,5,1,2]

    // l = 0, r = 5, m = 2

    int l = 0, r = nums.length - 1, m = (l + r) / 2;

    while(l != m) {
      System.out.println("m");
      System.out.println(m);
      System.out.println(nums[m]);
      System.out.println(nums[r]);
      System.out.println(nums[m] > nums[r]);
      if(nums[m] > nums[r]) {
        l = m + 1;
        System.out.println("left novo");
        System.out.println(l);
      } else {
        r = m;
      }

      
      System.out.println(l);
      System.out.println(m);
      System.out.println(r);
      m = (l + r) / 2;
    }

    return l;
  }
}