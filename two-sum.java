import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> visitedNums = new HashMap<>();

      int[] answer = new int[2];

      for(int i = 0; i < nums.length; i++) {
          Integer num = nums[i];
          int complementary = target - num;

          if(visitedNums.containsKey(complementary)) {
            answer[0] = visitedNums.get(complementary);
            answer[1] = i;
              
            return answer;
          }

          visitedNums.put(num, i);
      }

      return answer;
    }
} 