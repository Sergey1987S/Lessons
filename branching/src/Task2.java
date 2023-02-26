public class Task2 {

    public static void main(String[] args) {
        int Money = 100000;
        String Name = ("Bank");

        int Tax1 = 10;


        int TotalTax = (Money * Tax1 / 100);


        if (Money < 250000) {

            System.out.println("Налог на сумму" + Money + "для отрасли" + Name + "составляет" + TotalTax + ". Это составляет" + Tax1 + "процентов");
        }
    }
}
