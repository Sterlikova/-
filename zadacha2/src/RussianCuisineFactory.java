class RussianCuisineFactory extends CuisineFactory {
    @Override
    Dish createDish() {
        return new Dumplings();
    }
}