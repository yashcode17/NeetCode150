import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        //Map to contain the target-value and index
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++){

            //check if the sum of digits is present of not
            if(map.containsKey(nums[i])){
                ans[0]  = map.get(nums[i]);
                ans[1] = i;
                break;
            }else{
                map.put(target-nums[i], i);
            }
        }

        //return answer
        return ans;
    }
}
