package battle_homework;


import java.util.HashMap;
import java.util.Map;

public class MethodOne {
    public static int sum(Map<String, Integer> map) {
        int sum = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            sum += e.getValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Map<String, Integer> lee = new HashMap<>();
        lee.put("fighter", 13);
        lee.put("archer", 24);
        lee.put("trooper", 46);

        Map<String, Integer> ming = new HashMap<>();
        ming.put("fighter", 9);
        ming.put("archer", 35);
        ming.put("trooper", 12);

        int leePower = sum(lee) * 860;
        int mingPower = (int) (sum(ming) * 860 * 1.5);

        System.out.println("Воїни династії Мінь набрали " + mingPower + " потужності,а воїни династії Лі набрали " + leePower + " потужності");

    }
}