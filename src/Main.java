public class Main {
    public static void main(String[] args) {
        int ticket = 15000; // цена билета
        int mile = 20; // количество рублей для одной бонусной мили
        int bonus = ticket / mile;
        System.out.println("Бонус:" + bonus);

    }
}