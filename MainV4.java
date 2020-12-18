public class MainV4 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 15600;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
