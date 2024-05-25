class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> indexs;
        for (int i = 0; i < nums.size(); ++i) {
            int diff = target - nums[i];
            if (indexs.find(diff) != indexs.end()) {
                return {indexs[diff], i};
            }
            indexs[nums[i]] = i;
        }
        return {};
    }
};