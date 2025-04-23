import java.util.HashMap;

class Solution {
  public int countLargestGroup(int n) {
      int count=0;
      HashMap<Integer,Integer> map=new HashMap<>();
      int maxSize=0;
      for(int i=1;i<=n;i++){
          int sumDigit=sumDigit(i);
          int val=map.getOrDefault(sumDigit,0);
          map.put(sumDigit,val+1);
          if(maxSize<val+1){
              count=1;
              maxSize=val+1;
          } 
          else if(maxSize==val+1) count++;
      } return count;
  }
  private int sumDigit(int n){
      int sum=0;
      while(n>0){
          sum+=n%10;
          n/=10;
      }
      return sum;
  }
}