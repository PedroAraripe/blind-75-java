import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> hashVisited = new HashMap<>();
      
      for(int i = 0; i < nums.length; i++) {
        if(hashVisited.containsKey(target - nums[i])) {
          return new int[]{hashVisited.get(target - nums[i]), i};
        } else {
          hashVisited.put(nums[i], i);
        }
      }

      return new int[2];
    }
}