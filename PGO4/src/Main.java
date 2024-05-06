import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        Adder adder = new Adder();
        Address address = new Address();
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        List<BigDecimal> bigDecList = new ArrayList<>();
        bigDecList.add(BigDecimal.valueOf(1));
        bigDecList.add(BigDecimal.valueOf(2));
        bigDecList.add(BigDecimal.valueOf(3));
        System.out.println(multiplier.multiply(1,2));
        System.out.println(multiplier.multiply(3,4, 1, 2));
        System.out.println(multiplier.multiply(1d,2d));
        System.out.println(multiplier.multiply(BigDecimal.valueOf(1), BigDecimal.valueOf(2)));
        System.out.println(multiplier.multiply(intList));
        System.out.println(adder.add(1,2));
        System.out.println(adder.add(bigDecList));
        System.out.println(address.createAddress("Poland"));
        System.out.println(address.createAddress("Poland", "Warsaw"));
        System.out.println(address.createAddress("Poland", "Warsaw", 00-123));
        System.out.println(address.createAddress("Poland", "Warsaw", 00-123, "Warszawska"));
        System.out.println(address.createAddress("Poland", "Warsaw", 00-123, "Warszawska", 1));}
}