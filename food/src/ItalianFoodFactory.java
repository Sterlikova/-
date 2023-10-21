public class ItalianFoodFactory extends FoodFactory {
    @Override
    public Food createFood(String name) {
        return new ItalianFood(name);
    }
}