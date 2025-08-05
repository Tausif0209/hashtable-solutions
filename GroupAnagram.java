import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> ans=new ArrayList<>();
  List<String> list=new ArrayList<>();
  if(strs.length==0) return new ArrayList<>();
  if(strs.length==1) {
    list.add(strs[0]);
    ans.add(list);
    return ans;
  }
  HashMap<String,List<String>> map =new HashMap<>();
  for(String s: strs){
    String hashCode=generateHashCode(s);
    list=map.getOrDefault(hashCode,new ArrayList());
    list.add(s);
    map.put(hashCode,list);
  } 
  for(String hash:map.keySet()){
    ans.add(map.get(hash));
  } return ans;
}
 private String generateHashCode(String s){
    int[] fre=new int[26];
    for(int i=0;i<s.length();i++) fre[s.charAt(i)-'a']++;
    StringBuilder hashCode=new StringBuilder();
    for(int f:fre) hashCode.append(f).append('#');
    return hashCode.toString();
  }
}
