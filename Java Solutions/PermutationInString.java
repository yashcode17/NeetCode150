public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int[] test = new int[26];
        for(Character s: s1.toCharArray()){
            test[s - 'a']++;
        }
        for(int i = 0; i <= s2.length()-s1.length(); i++){
            int[] arr = test.clone();
            
            for(int j = 0; j < s1.length(); j++){
                if(arr[s2.charAt(i+j) - 'a'] == 0){
                    break;
                }else{
                    arr[s2.charAt(i+j) - 'a']--;
                }
                if(j == s1.length()-1){
                    return true;
                }
            }
        }
        return false;
    }
}
