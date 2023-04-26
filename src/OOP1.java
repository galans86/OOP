public class OOP1 {
    public static void main(String[] args) {
        Product[] products = {
                new Milk("Простоквашино", 98.7, 2, "шт", 700, 3.2, "30.06.2023"),
                new Lemo("Добрый", 123.0, 3, "шт", 500),
                new Bread("Хлеб", 30.0, 300, "грамм", "20.01.2023", "пшеничная"),
                new Eggs("Яйцо Деревенское", 97.5, 1, "уп", 10, "23.10.2023"),
                new Mask("Маски защитные", 240.0, 3,"уп",100),
                new TPaper("Zewa", 150.0, 1, "шт", 8, 3),
                new Pampers("Pampers",532.0,2, "уп",1,true,3,20,30,"all" ),
                new Gigi("Пустышка",425.5,3,"шт",0,true)
        };

        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}