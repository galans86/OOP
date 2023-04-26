public class Pampers extends Kids {
    //Размер
    private Integer size;
    //Минимальный вес
    private Integer minWeight;
    //Максимальный вес
    private Integer maxWeight;
    //Тип
    private String type;

    public Pampers(String name, Double price, Integer quan, String measure, Integer age, Boolean hypoallergenic,
                   Integer size, Integer minWeight,Integer maxWeight, String type) {
        super(name, price, quan, measure, age, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Size = " + this.size
                + ", MinWeight = " + this.minWeight
                + ", MaxWeight = " + this.maxWeight
                + ", Type = " + this.type;
    }
}
