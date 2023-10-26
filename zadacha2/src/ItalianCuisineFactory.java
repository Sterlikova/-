class ItalianCuisineFactory extends CuisineFactory {
    @Override
    Dish createDish() {
        return new Pasta();
    }
}