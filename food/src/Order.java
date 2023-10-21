import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> foodItems;
    private FoodFactory foodFactory;

    public Order(FoodFactory foodFactory) {
        this.foodFactory = foodFactory;
        foodItems = new ArrayList<>();
    }

    public void addFoodItem(String name) {
        Food food = foodFactory.createFood(name);
        foodItems.add(food);
    }

    public void prepareFood() {
        for (Food food : foodItems) {
            food.prepare();
        }
    }
}