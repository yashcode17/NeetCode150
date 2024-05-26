import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChatacters {
    public int lengthOfLongestSubstring(String s) {

        //Object to get the character last index
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int answer = 0;

        for(int i = 0; i < s.length(); i++){

            //move pointer if the duplicate string is found
            if(map.containsKey(s.charAt(i))){
                start = Math.max(map.get(s.charAt(i)) + 1, start);
            }
            map.put(s.charAt(i), i);
            answer = Math.max(i - start + 1, answer);
        }

        //return answer
        return answer;
    }
}
