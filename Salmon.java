package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem5;
import java.math.BigDecimal;

public class Salmon extends MainDish {
    private static final double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price, double gr) {

        super(name, price, gr);
    }


}
