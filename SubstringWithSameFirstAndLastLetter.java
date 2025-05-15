public class SubstringWithSameFirstAndLastLetter {
  public int countSubstring(String s) {
        if(s.length()==1) return 1;
        int[] map=new int[26];
        int len=s.length();
        for(int i=0;i<len;i++) map[s.charAt(i)-'a']++;
        int extra=0;
        for(int i=0;i<=25;i++) extra+=(map[i]*(map[i]-1))/2;
        return len+extra;
    }
  
}
