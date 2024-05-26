class Solution {
public:
    double findMedianSortedArrays(vector<int> &nums1, vector<int> &nums2)
    {
        if (nums1.size() > nums2.size())
        {
            return findMedianSortedArrays(nums2, nums1);
        }

        int low = 0, high = nums1.size(), k = (nums1.size() + nums2.size() + 1) / 2;
        int nums1Mid, nums2Mid;

        while (low <= high)
        {
            nums1Mid = low + (high - low) / 2;
            nums2Mid = k - nums1Mid;

            if (nums1Mid > 0 && nums1[nums1Mid - 1] > nums2[nums2Mid])
            {
                high = nums1Mid - 1;
            }
            else if (nums1Mid != nums1.size() && nums1[nums1Mid] < nums2[nums2Mid - 1])
            {
                low = nums1Mid + 1;
            }
            else
            {
                break;
            }
        }

        int midLeft, midRight;

        if (nums1Mid == 0)
        {
            midLeft = nums2[nums2Mid - 1];
        }
        else if (nums2Mid == 0)
        {
            midLeft = nums1[nums1Mid - 1];
        }
        else
        {
            midLeft = max(nums1[nums1Mid - 1], nums2[nums2Mid - 1]);
        }

        if ((nums1.size() + nums2.size()) % 2 == 1)
        {
            return static_cast<double>(midLeft);
        }

        if (nums1Mid == nums1.size())
        {
            midRight = nums2[nums2Mid];
        }
        else if (nums2Mid == nums2.size())
        {
            midRight = nums1[nums1Mid];
        }
        else
        {
            midRight = min(nums1[nums1Mid], nums2[nums2Mid]);
        }
        return static_cast<double>(midLeft + midRight) / 2.0;
    }
};
