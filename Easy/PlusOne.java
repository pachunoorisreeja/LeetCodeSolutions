package Easy;

public class PlusOne {
    public static void main(String[] args) {
        int a[] = plusOne(new int[]{1,2,9});
        System.out.print("[");
        int count =0;
        for (int aa:a){
            System.out.print(aa);

            if (count< a.length-1) {
                System.out.print(",");
            }count++;
        }
        System.out.println("]");
        count=0;
        System.out.println("********************");
        System.out.print("[");
        int aa[] = plusOne(new int[]{9,9,9});
        for (int aaa:aa){
            System.out.print(aaa);
            if (count<aa.length-1){
                System.out.print(",");
            }
            count++;
        }
        System.out.print("]");


    }
    public static int[] plusOne(int arr[]){
        int len = arr.length;
        for (int i=len-1;i>=0;i--){
            if (arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;

        }
        int result[] = new int[len+1];
        result[0]=1;
        return result;
    }
}
