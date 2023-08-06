package BigMultiplication;

public class BigMultiplication {
    static String bigProduct (String num1 , String num2){
        int l1 = num1.length();
        int l2 = num2.length();
        int arr[] = new int[l1+l2];
        for(int i=l1 - 1 ; i>= 0 ; i--){
            int d1 = num1.charAt(i) - '0';

            for(int j=l2-1; j>- 0 ; j--){
                int d2 = num2.charAt(j) - '0';
                int b = i+j;
                int a = b+1;
                int prod = d1*d2;
                int sum = prod + arr[a];

                arr[a] = sum%10;
                arr[b] = arr[b] + sum/10;
            }

            StringBuilder ans = new StringBuilder();
            for(int i: arr){
                ans.append(i);
            }

            return ans.toString();
        }

        public static void main(String[] args) {
            String num1 = "123456789";
            String num2 = "9876543210";
        }
    }
}
