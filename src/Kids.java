public class Kids extends Product{
    // Минимальный возраст
    private Integer age;
    //Гипоаллергенность
    private Boolean hypoallergenic;

    public Kids(String name, Double price, Integer quan, String measure, Integer age, Boolean hypoallergenic) {
        super(name, price, quan, measure);
        this.age = age;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString() + ", Age = " + this.age +
                ", Hypoallergenic = " + (this.hypoallergenic?"Да":"Нет");
    }
}
