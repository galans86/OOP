public class Food extends Product {
    //Срок годности
    private String pullDate;

    public Food(String name, Double price, Integer quan, String measure, String pullDate) {
        super(name, price, quan, measure);
        this.pullDate = pullDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", PullDate = " + this.pullDate ;
    }
}
