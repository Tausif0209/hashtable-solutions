import java.util.HashMap;

public class Leetcode2359 {
  public int closestMeetingNode(int[] edges, int node1, int node2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        helper(node1,edges,map1,0);
        helper(node2,edges,map2,0);
        int ans=-1;
        int minDist=Integer.MAX_VALUE;
        for(Integer key:map1.keySet()){
            if(!map2.containsKey(key)) continue;
            int dist=Math.max(map1.get(key),map2.get(key));
            if(dist<minDist){
                ans=key;
                minDist=dist;
            }
            else if(dist==minDist) ans=Math.min(ans,key);
        } return ans;
    }
    private void helper(int i,int[] edges,HashMap<Integer,Integer> map,int dist){
        if(i==-1||map.containsKey(i)) return;
        map.put(i,dist);
        helper(edges[i],edges,map,dist+1);
    }
  
}
