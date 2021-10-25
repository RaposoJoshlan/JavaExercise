package Exercises;

public class UniqueSum {

    public static int sumOf(int i , int j, int m) {


        if ((i == j)&&(i!=m)){
            return m;
        } else if ((i == m)&&(i!=j)) {
            return j;
        } else if ((m == j)&&(m!=i)) {
            return i;
        } else if ((i==j)&&(i==m)&&(m==j)) {
            return 0;
        } else {
            return i + j+ m;

        }
    }

    public static void main(String[] args) {
        System.out.println(sumOf(0,2,2));
    }
}
