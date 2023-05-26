package Questions;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {

    public boolean isIsomorphic(String s , String t){
        HashMap<Character,Character> mp = new HashMap<>();
       // HashSet<Character> st = new HashSet<>();
        for(int i =0 ; i<s.length(); i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);

            if(mp.containsKey(sCh)){
                if(mp.get(sCh) != tCh) return false;
            }else if(mp.containsValue(tCh)){
                return false;
            }else {
                mp.put(sCh,tCh);
                //st.add(tCh);
            }
        }
        return true;
    }
}
