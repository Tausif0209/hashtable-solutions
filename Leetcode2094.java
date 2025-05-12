import java.util.ArrayList;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] digitCount=new int[10];
        for(int el:digits) digitCount[el]++;
        int num=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            if(digitCount[i]==0) continue;
            num=i;
            digitCount[i]--;
            for(int j=0;j<=9;j++){
                if(digitCount[j]==0) continue;
                num=(num*10)+j;
                digitCount[j]--;
                for(int k=0;k<=8;k+=2){
                    if(digitCount[k]==0) continue;
                    list.add(num*10+k);
                }
                num=i;
                digitCount[j]++;
            } digitCount[i]++;
        } if(list.isEmpty()) return new int[]{};
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
