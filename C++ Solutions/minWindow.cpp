string minWindow(string s, string t) {
    if (s.empty() || t.empty()) {
        return "";
    }

    unordered_map<char, int> tFreq, sFreq;
    string result = "";
    int left = 0, right = -1;
    int finalLeft = -1, finalRight = -1;
    int minW = s.length() + 1;
    int count = 0;

    // Initialize tFreq with character frequencies from t
    for (char c : t) {
        tFreq[c]++;
    }

    while (left < s.length()) {
        if (right + 1 < s.length() && count < t.length()) {
            char next = s[right + 1];
            sFreq[next]++;
            if (sFreq[next] <= tFreq[next]) {
                count++;
            }
            right++;
        } else {
            if (count == t.length()) {
                // Update minW and indices if a smaller window is found
                if (right - left + 1 < minW) {
                    minW = right - left + 1;
                    finalLeft = left;
                    finalRight = right;
                }
                // Contract the window from the left
                char leftChar = s[left];
                if (sFreq[leftChar] == tFreq[leftChar]) {
                    count--;
                }
                sFreq[leftChar]--;
                left++;
            } else {
                // Early exit if current window size >= minW
                break;
            }
        }
    }

    if (finalLeft != -1) {
        result = s.substr(finalLeft, finalRight - finalLeft + 1);
    }
    return result;
}
