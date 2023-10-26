// Пример использования системы заказов в ресторане
//Реализуйте систему заказов в ресторане, где абстрактная фабрика создает блюда для разных типов кухонь (итальянская, китайская, мексиканская).
public class RestaurantOrderSystem {
    public static void main(String[] args) {
        // Создание фабрики для итальянской кухни
        CuisineFactory italianCuisineFactory = new ItalianCuisineFactory();
        // Создание пасты
        Dish pasta = italianCuisineFactory.createDish();
        pasta.prepare();
        pasta.cook();
        pasta.serve();

        // Создание фабрики для русской кухни
        CuisineFactory russianCuisineFactory = new RussianCuisineFactory();
        // Создание пельменей
        Dish dumplings = russianCuisineFactory.createDish();
        dumplings.prepare();
        dumplings.cook();
        dumplings.serve();

        // Создание фабрики для мексиканской кухни
        CuisineFactory mexicanCuisineFactory = new MexicanCuisineFactory();
        // Создание тако
        Dish tacos = mexicanCuisineFactory.createDish();
        tacos.prepare();
        tacos.cook();
        tacos.serve();
    }
}