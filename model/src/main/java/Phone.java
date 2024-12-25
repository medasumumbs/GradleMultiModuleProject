import java.math.BigDecimal;

public record Phone(
        String manufactorer,
        String model,
        BigDecimal price
) {}
