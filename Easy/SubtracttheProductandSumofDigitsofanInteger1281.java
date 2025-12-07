package Easy;

public class SubtracttheProductandSumofDigitsofanInteger1281 {
    public static void main(String[] args) {
        System.out.println("value: "+subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        int rem = 0;
        int sum=0, product =1;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n = n/10;
        }
        return product-sum;}
}
