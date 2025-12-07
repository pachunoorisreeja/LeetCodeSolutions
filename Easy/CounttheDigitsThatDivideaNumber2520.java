package Easy;

public class CounttheDigitsThatDivideaNumber2520 {
    public static void main(String[] args) {
        System.out.println("countDigits: "+countDigits(121));
    }
    public static int countDigits(int num) {
        int count =0;
        int temp =num;
        while(num>0){

            if(temp%(num%10) == 0){
                count++;
            }
            num =num/10;
        }

        return count;}
}
