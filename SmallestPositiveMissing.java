import java.util.HashSet;

public class SmallestPositiveMissing {
   public int missingNumber(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int el:arr) if(el>0) set.add(el);
        int end=(int)Math.pow(10,6);
        for(int start=1;start<=end;start++){
            if(!set.contains(start)) return start;
        } return -1;
    }
}
