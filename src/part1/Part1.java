package part1;

import java.util.HashMap;
import java.util.Map;

public class Part1 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Van", 15);
        map.put("Vlad", 54);
        map.put("Evgeniy", 23);
        map.put("Alla", 25);
        map.put("Dima", 12);
        map.put("Artas", 22);
        map.put("Artur", 12);
        map.put("Andrey", 45);
        map.put("Ihor", 87);
        map.put("Mo", 11);

        // Вывод карты
        map.forEach((key, value) -> System.out.println(key + " " + value));

        // Черная магия с заменой
        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nРезультат: \n");

        for (Map.Entry<Integer, String> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
