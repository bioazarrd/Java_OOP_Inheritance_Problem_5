package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem5;
import java.math.BigDecimal;
public class Food extends Product {


    private final double grItShouldBe;

    public Food(String name, BigDecimal price, double gr) {
        super(name, price);
        this.grItShouldBe = gr;
    }

    public double getGrItShouldBe() {
        return grItShouldBe;
    }
}
