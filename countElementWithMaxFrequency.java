public class countElementWithMaxFrequency {
  public int maxFrequencyElements(int[] nums) {
        int[] fre=new int[101];
        int maxFre=1,count=0;
        for(int el:nums) {
            fre[el]++;
            if(fre[el]>maxFre) {
                maxFre=fre[el];
                count=1;
            }
            else if(fre[el]==maxFre) count++;
        } return maxFre*count;
    } 
}
