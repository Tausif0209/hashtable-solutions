class Solution {
    public int numRabbits(int[] answers) {
        if(answers.length==1) return answers[0]+1;
        int[] counts=new int[1001];
        int ans=0,i;
        for(i=0;i<answers.length;i++) counts[answers[i]]++;
        for(i=0;i<1001;i++) {
            if(counts[i]==0) continue;
            int colors=(counts[i]%(i+1)==0)?counts[i]/(i+1):(int)(counts[i]/(i+1))+1;
            ans+=colors*(i+1);
        }
        return ans;
    }
}