public class Drink extends  Product{
    //Объём
    private Integer volume;

    public Drink(String name, Double price, Integer quan, String measure, Integer volume) {
        super(name, price, quan, measure);
        this.volume = volume;
    }
    @Override
    public String toString() {
        return super.toString() + ", Volume = " + this.volume ;
    }
}
