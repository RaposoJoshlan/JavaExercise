package First;

import java.util.Arrays;

public class HelloWorld {

    public int addition(int j, int i) {
        return j + i;
    }

    public int multiply(int j, int i) {
        return  j * i;
    }

    public int subtract(int j, int i) {
        return  j - i;
    }

    public double division(int i, int j) {
        return j / i;
    }

    public void print() {
        System.out.println(addition(10,5));
        System.out.println(multiply(10,5));
        System.out.println(subtract(10,5));
        System.out.println(Math.floor(division(10, 59)));

    }

    public static int twoDArray[][] = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};

    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.print();

        for(int i = 0; i < twoDArray.length; i++) { //Loop through the Outer array{}
            for(int j = 0; j < twoDArray[i].length; j++) { //Loop through the Inner Array {{//this one}}
                System.out.print(twoDArray[i][j]);
            }
            System.out.println();
        }
    }
}