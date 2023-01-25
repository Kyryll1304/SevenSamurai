package battleHomework;

import java.util.HashMap;
import java.util.Map;

public class MethodOne {
    public static void main(String[] args) {
        Map<String, Integer> lee = new HashMap<String, Integer>();
        lee.put("fighter", 13);
        lee.put("archer", 24);
        lee.put("trooper", 46);

        Map<String, Integer> ming = new HashMap<String, Integer>();
        ming.put("fighter", 9);
        ming.put("archer", 35);
        ming.put("trooper", 12);

        int leePower = (lee.get("fighter") + lee.get("archer") + lee.get("trooper")) * 860;
        int mingPower = (int) ((ming.get("fighter") + ming.get("archer") + ming.get("trooper")) * (860 * 1.5));
        System.out.println("Воїни династії Мінь набрали " + mingPower + " потужності,а воїни династії Лі набрали " + leePower + " потужності");

    }
}