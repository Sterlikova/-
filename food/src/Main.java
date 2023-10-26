// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// Реализуйте систему заказов в ресторане, где фабричный метод используется для создания блюд разных кухонь (итальянская, китайская, мексиканская).
public class Main {
    public static void main(String[] args) {
        FoodFactory italianFoodFactory = new ItalianFoodFactory();
        FoodFactory chineseFoodFactory = new ChineseFoodFactory();
        FoodFactory mexicanFoodFactory = new MexicanFoodFactory();

        Order order1 = new Order(italianFoodFactory);
        order1.addFoodItem("Pizza");
        order1.addFoodItem("Pasta");
        order1.prepareFood();

        Order order2 = new Order(chineseFoodFactory);
        order2.addFoodItem("Fried Rice");
        order2.addFoodItem("Dumplings");
        order2.prepareFood();

        Order order3 = new Order(mexicanFoodFactory);
        order3.addFoodItem("Tacos");
        order3.addFoodItem("Enchiladas");
        order3.prepareFood();
    }
}
