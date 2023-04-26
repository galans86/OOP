public class Product {
    //Название
    private String name;
    //Цена
    private Double price;
    //Количество
    private Integer quan;
    //Единица измерения
    private String measure;

    public Product(String name, Double price, Integer quan, String measure) {
        this.name = name;
        this.price = price;
        this.quan = quan;
        this.measure = measure;
    }

    @Override
    public String toString() {
        return  "\n Name = " + name +
                ", Price = " + price +
                ", Quantity = " + quan +
                ", Measure = " + measure;
    }
}
