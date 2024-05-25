import java.util.HashSet;

class DuplicateInteger{

    public boolean containsDuplicate(int[] nums) {

        //HashSet to store the numbers
        HashSet<Integer> set = new HashSet<>();

        for(int number: nums){

            //If the number is alreay present in set then return true; else add the number in set
            if (set.contains(number)){
                return true;
            }
            else{
                set.add(number);
            }
        }

        //no duplicate found
        return false;
    }
}