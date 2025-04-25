import java.util.HashMap;

public class MajorityElement {
    static int majorityElement(int arr[]) {
        if(arr.length==1) return arr[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int el:arr) map.put(el,map.getOrDefault(el,0)+1);
        int ans=-1;
        for(Integer key: map.keySet()){
            if(map.get(key)>arr.length/2){
                ans=key;
                break;
            } 
        } 
        return ans;
    }
}
