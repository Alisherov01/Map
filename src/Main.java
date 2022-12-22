import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите день недели(первая буква заглавная!)");
        for (int i = 0; i < 10; i++) {
            String day = scan.nextLine();
            Map<String, String> map = new HashMap<>();
            map.put("Monday", "Понедельник");
            map.put("Tuesday", "Вторник");
            map.put("Wednesday", "Среда");
            map.put("Thursday", "Четверг");
            map.put("Friday", "Пятница");
            map.put("Saturday", "Суббота");
            map.put("Sunday", "Воскресенье");
            if (map.get(day) != null) {
                System.out.println(map.get(day));
            } else {
                System.out.println("Слово было написано не правильно!");
            }
        }
    }
}