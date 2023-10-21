public class MexicanFoodFactory extends FoodFactory {
    @Override
    public Food createFood(String name) {
        return new MexicanFood(name);
    }
}