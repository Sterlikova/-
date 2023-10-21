public class MexicanFood extends Food {
    public MexicanFood(String name) {
        this.name = name;
        this.cuisine = "Mexican";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Mexican food: " + name);
    }
}