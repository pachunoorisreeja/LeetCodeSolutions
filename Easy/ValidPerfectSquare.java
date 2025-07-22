package Easy;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        if (num==1)
            return true;
        for(int i=2;i<=num/i;i++){
            int result= i*i;
            if(result == num){
                return true;
            }

        }

        return false;
    }
}
