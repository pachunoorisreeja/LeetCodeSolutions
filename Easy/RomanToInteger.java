package Easy;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInteger("MCMXCIV"));
    }
    public static int romanToInteger(String s){
        int prevValue = 0, finalSum =0;
        for(int i=s.length()-1;i>=0;i--){
            int currentValue = getRomanValue(s.charAt(i));
            if(currentValue < prevValue){
                finalSum -=currentValue;   //MIX;
            }
            else{
                finalSum +=currentValue;
            }
            prevValue =currentValue;

        }
        return finalSum;
    }
    public static int getRomanValue(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;

        }
        return 0;}
}
