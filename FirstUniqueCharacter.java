import java.util.Arrays;

public class FirstUniqueCharacter {
   public int firstUniqChar(String s) {
        if(s.length()==1) return 0;
        int[] index=new int[26];
        Arrays.fill(index,-1);
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(index[ch-'a']==-1) index[ch-'a']=i;
            else if(index[ch-'a']!=-2) index[ch-'a']=-2; 
        }
        int minIndex=len;
        for(int i:index){
            if(i>-1) minIndex=Math.min(minIndex,i);
        } return minIndex==len?-1:minIndex;
    }
}
