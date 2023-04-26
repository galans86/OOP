public class Eggs extends Food {
    //Количество в упаковке
    private Integer amount;

    public Eggs(String name, Double price, Integer quan, String measure, Integer amount, String pullDate) {
        super(name, price, quan, measure, pullDate);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Amount = " + this.amount;
    }
}
