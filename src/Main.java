//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для стоимости билета и количества рублей для одной бонусной мили
        double ticketPrice = 13676; // Стоимость билета в рублях
        int milesPerRub = 20; // Количество рублей для одной бонусной мили

        // Рассчитываем количество начисленных миль
        int milesEarned = (int) (ticketPrice / milesPerRub);

        // Выводим результат на экран
        System.out.println("За покупку билета на сумму " + ticketPrice + " рублей начислено " + milesEarned + " миль.");

    }
}