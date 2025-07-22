package Easy;

public class PowerOftwo {
    public static void main(String[] args) {

        System.out.println(powerOfTwo(8));
    }
    public static boolean powerOfTwo(int x) {
        if(x<=0){
            return false;
        }
        while (x%2 ==0){
            x = x/2;
        }
        if (x==1)
            return true;
return false;
    }


}
