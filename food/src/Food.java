public abstract class Food {
    protected String name;
    protected String cuisine;

    public abstract void prepare();

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }
}