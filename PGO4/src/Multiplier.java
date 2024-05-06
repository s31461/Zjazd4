import java.math.BigDecimal;
import java.util.List;
public class Multiplier {
    public int multiply(int x, int y) {
        return x * y;}
    public int multiply(int a, int b, int x, int y) {
        return multiply(a, b) * multiply(x, y);}
    public double multiply(double x, double y) {
        return x * y;}
    public BigDecimal multiply(BigDecimal x, BigDecimal y) {
        return x.multiply(y);}
    public int multiply(List<Integer> list) {
        int result = 1;
        for(int i = 0; i < list.size(); i++) {
            result *= list.get(i);}
        return result;}
}