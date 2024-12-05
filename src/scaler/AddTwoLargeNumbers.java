package scaler;

import java.math.BigInteger;

public class AddTwoLargeNumbers {
    public static void main(String[] args) {
        String num_1 = "123456789123456789";
        String num_2 = "987654321987654321";
        Long long_1 = Long.parseLong(num_1);
        Long long_2 = Long.parseLong(num_2);
        BigInteger bigInteger_1 = BigInteger.valueOf(Long.parseLong(num_1));
        BigInteger bigInteger_2 = BigInteger.valueOf(Long.parseLong(num_2));
        BigInteger added = bigInteger_1.add(bigInteger_2);
        System.out.println(added);

    }

}
