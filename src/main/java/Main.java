public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(50_000, true);
        System.out.println(bonus);
    }
}
