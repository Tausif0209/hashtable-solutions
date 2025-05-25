import java.util.HashMap;
import java.util.HashSet;

public class Leetcode2131 {
   public int longestPalindrome(String[] words) {
       int ans=0;
        int[] letters=new int[26];//To map the string where both letter are same
        HashMap<String,Integer> map=new HashMap<>();//to map string where both letter are different
        for(String word:words){
            char ch1=word.charAt(0);
            char ch2=word.charAt(1);
            if(ch1==ch2)letters[ch1-'a']++;
            else map.put(word,map.getOrDefault(word,0)+1);
        }
        boolean extra=false;
        for(Integer fre: letters){
            if(fre%2!=0){
                extra=true;
                ans+= (fre-1)*2;
            } else ans+=fre*2;
        }
        HashSet<String> isVisited=new HashSet<>();
        for(String word : map.keySet()){
            String reversed= word.charAt(1)+""+word.charAt(0);
            if(isVisited.contains(reversed)) continue;
            ans+=Math.min(map.get(word),map.getOrDefault(reversed,0))*4;
            isVisited.add(word);
        }
        return ans + (extra ? 2:0);
    }
}
