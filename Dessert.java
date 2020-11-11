package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem5;
import java.math.BigDecimal;

public class Dessert extends Food {
    private double calories;

    public Dessert(String name, BigDecimal price, double gr, double calories) {
        super(name, price, gr);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }




}
