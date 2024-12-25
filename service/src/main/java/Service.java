import java.math.BigDecimal;

public class Service {
    public static void main(String[] args) {
        Phone phone = new Phone("mnf1","model1", BigDecimal.valueOf(15000));
        System.out.println(phone);
        phone = new Phone("mnf2","model2", BigDecimal.valueOf(15001));
        System.out.println(phone);
    }
}
