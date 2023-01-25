package battleHomework;

public class MethodTwo {
    public static int lee() {
        int fighter = 13;
        int archer = 24;
        int trooper = 46;
        return fighter + archer + trooper;
    }

    public static int ming() {
        int fighter = 9;
        int archer = 35;
        int trooper = 12;
        return fighter + archer + trooper;
    }

    public static void main(String[] args) {
        int mingPower = (int) (ming() * 860 * 1.5);
        int leePower = lee() * 860;
        System.out.println("Воїни династії Мінь набрали " + mingPower + " потужності,а воїни династії Лі набрали " + leePower + " потужності");

    }

}
