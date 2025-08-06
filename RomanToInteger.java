public class RomanToInteger {
  HashMap<Character,Integer> map= new HashMap<>();
    public int romanToDecimal(String s) {
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        return decimal(s);
    }
    private int decimal(String s){
        if(s.isEmpty()) return 0;
        if(s.length()==1) return map.get(s.charAt(0));
        int val1=map.get(s.charAt(0));
        int val2=map.get(s.charAt(1));
        
        return (val1>=val2)? val1+decimal(s.substring(1)) :
        val2-val1 + decimal(s.substring(2));
    }
}
