import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> answer = new ArrayList<>();

        //Map to store key and its anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        //Check all the strings
        for(String x: strs){
            
            //Sort string characters
            char[] temp = x.toCharArray();
            Arrays.sort(temp);
            String temp2 = new String(temp);
            
            //Check sorted string as key
            if(map.containsKey(temp2)){
                map.get(temp2).add(x);
            }else{
                map.put(temp2, new ArrayList<String>());
                map.get(temp2).add(x);
            }
        }

        //Adding anagrams in answer
        for(Map.Entry<String, List<String>> mapElements: map.entrySet()){
            answer.add(mapElements.getValue());
        }

        //retuen answer
        return answer;
    }    
}
