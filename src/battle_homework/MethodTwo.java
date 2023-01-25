package battle_homework;

public class MethodTwo {
    public static int lee(int fighter, int archer, int trooper) {
        return fighter + archer + trooper;
    }

    public static int ming(int fighter, int archer, int trooper) {
        return fighter + archer + trooper;
    }

    public static void main(String[] args) {
        int mingPower = (int) (ming(9, 35, 12) * 860 * 1.5);
        int leePower = lee(13, 24, 46) * 860;
        System.out.println("Воїни династії Мінь набрали " + mingPower + " потужності,а воїни династії Лі набрали " + leePower + " потужності");

    }

}
