public class TPaper extends Health{
    //Количество слоёв
    private Integer layers;

    public TPaper(String name, Double price, Integer quan, String measure, Integer amount,Integer layers) {
        super(name, price, quan, measure,amount);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return super.toString() + ", Layers = " + this.layers;
    }
}
