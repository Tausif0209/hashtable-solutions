import java.util.Arrays;

public class Leetcode3335 {
      public int lengthAfterTransformations(String s, int t) {
        int num= (int)(Math.pow(10,9))+7;
        long[] map=new long[26];
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            map[ch-'a']++;
        }
        while(t-->0){
            long[] prevMap=Arrays.copyOf(map,map.length);
            for(int i=0;i<25;i++){
                map[i+1]=prevMap[i];
            }
            map[0]=prevMap[25];
            map[1]=(map[1]+prevMap[25])%num;
        } 
        int sum=0;
        for(long el:map) sum=(int)((sum+el)%num);
        return sum;
    }
}
