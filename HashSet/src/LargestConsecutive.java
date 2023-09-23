import java.util.HashSet;


public class LargestConsecutive {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums) st.add(num);
        int maxStreak = 0;
        for(int num : st){
            if(!st.contains(num-1)){ // num is starting point of a sequence
                int currNum = num ; // 1
                int currStreak = 1;
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;

    }
}
