class MexicanCuisineFactory extends CuisineFactory {
    @Override
    Dish createDish() {
        return new Tacos();
    }
}