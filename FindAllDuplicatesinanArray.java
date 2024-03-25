import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<Integer>();
    for (int num : nums) {
        if (seen.contains(num)) {
            res.add(num);
        }else{
        seen.add(num);
        }
    }
    return res;
        
    }
}