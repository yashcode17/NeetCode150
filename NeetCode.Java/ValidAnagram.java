public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        //interger arrat to count number of characters
        int[] check = new int[26];

        //count characters
        for(char x: s.toCharArray()){
            check[x-'a']++;
        }

        //subtract the characters
        for(char y: t.toCharArray()){
            check[y-'a']--;
        }

        //if anagram, then array values will be 0
        for(int x: check){
            if(x != 0){
                return false;
            }
        }
        return true;
    }
}
