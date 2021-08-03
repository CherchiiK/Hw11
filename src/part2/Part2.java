package part2;

import java.util.*;

public class Part2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String str;

        while (true) {
            Scanner in = new Scanner(System.in);
            str = in.nextLine();
            if (str.equals("")) {
                break;
            }

            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                int counter = map.get(str);
                map.put(str, counter + 1);
            }
        }
        map.values()
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .forEach(System.out::println);
        System.out.println(map);
    }
}