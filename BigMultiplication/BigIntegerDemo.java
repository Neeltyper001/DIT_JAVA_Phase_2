package BigMultiplication;
import java.math.BigInteger;
public class BigIntegerDemo {
    
    public static void main(String[] args) {
            BigInteger num1 = new BigInteger("123456789");
    BigInteger num2 = new BigInteger("987654321");
    System.out.println(num1.add(num2));

    System.out.println(num1.multiply(num2));
    System.out.println(num1.divide(num2));
    System.out.println(num1.mod(num2));

    String num = "1110010";
    BigInteger ans5 = new BigInteger(num,8);
    System.out.println(ans5);
    
    BigInteger num3 = new BigInteger("8");
    boolean ansPrime = num3.isProbablePrime(1);
    System.out.println("Prime or not?: "+ansPrime);
    System.out.println("Next Optimus prime "+num3.nextProbablePrime());
}

}
