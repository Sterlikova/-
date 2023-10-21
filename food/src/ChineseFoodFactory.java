public class ChineseFoodFactory extends FoodFactory {
    @Override
    public Food createFood(String name) {
        return new ChineseFood(name);
    }
}