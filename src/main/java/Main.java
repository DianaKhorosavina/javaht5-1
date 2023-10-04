import ru.netology.javaqa.gavaqamvn.services.RestService;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        int threshold = 150000; // остаток
        int income = 100000; // доход
        int expenses = 60000; // траты

        int count = service.calculate(income, expenses, threshold);

        System.out.println(count);
    }
}

