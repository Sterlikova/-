public class ChineseFood extends Food {
    public ChineseFood(String name) {
        this.name = name;
        this.cuisine = "Chinese";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chinese food: " + name);
    }
}