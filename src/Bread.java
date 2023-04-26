public class Bread extends Food {
    //Тип муки
    private String flour;

    public Bread(String name, Double price, Integer quan, String measure, String pullDate, String flour ){
        super(name, price, quan, measure,pullDate);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return super.toString() + ", Flour = " + this.flour;
    }
}
