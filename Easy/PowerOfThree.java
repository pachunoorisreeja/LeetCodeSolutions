package Easy;

public class PowerOfThree {
    public static void main(String[] args) {

        System.out.println(powerOfThree(27));
    }
    public static boolean powerOfThree(int x) {
        if(x<=0){
            return false;
        }
        while (x%3 ==0){
            x = x/3;
        }

return x==1;
    }


}
