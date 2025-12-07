package Easy;

public class JewelsandStones771 {
    public static void main(String[] args) {

        System.out.println("Jewels count is: "+numJewelsInStones("aA","aAAbbbb"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int jewelsCount=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    jewelsCount++;
                }
            }
        }
        return jewelsCount;}
}
