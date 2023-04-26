public class Milk extends Drink {
    //Процент жирности
    private Double percentage;
    //Срок годности
    private String pullDate;

    public Milk(String name, Double price, Integer quan, String measure, Integer volume, Double percentage, String pullDAte) {
        super(name, price, quan, measure, volume);
    }

    @Override
    public String toString() {
        return super.toString() + ", Rate = " + this.percentage + ", PullDate = " + this.pullDate;
    }
}
