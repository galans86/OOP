public class Health extends Product{
    //Количество штук в упаковке
    private Integer amount;

    public Health(String name, Double price, Integer quan, String measure,Integer amount) {
        super(name, price, quan, measure);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Amount = " + this.amount;
    }
}
