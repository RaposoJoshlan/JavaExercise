package Exercises;

public class BlackJack {

    public static  int blackJack(int i, int j) {
        if (i <= 21 || j <= 21) {
            if (i > 21) {
                return j;
            } else if (j > 21) {
                return i;
            } else if (i > j) {
                return i;
            } else {
                return j;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(blackJack(23, 21));
    }
}
