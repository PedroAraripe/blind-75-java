import java.util.HashMap;

class Solution {
  public boolean containsDuplicate(int[] nums) {
      HashMap<Integer, Boolean> visitedHash = new HashMap<>();
      
      for(int i = 0; i < nums.length; i++) {
          int num = nums[i];
          
          if(visitedHash.containsKey(num)) {
            return true;
          }

          visitedHash.put(num, true);
      }

      return false;
  }
}