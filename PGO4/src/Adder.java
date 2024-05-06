import java.math.BigDecimal;
import java.util.List;
public class Adder {
    public int add(int x, int y) {
        return x + y;}
    public BigDecimal add(List<BigDecimal> list) {
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < list.size(); i++) {
            sum = sum.add(list.get(i));}
        return sum;}
}