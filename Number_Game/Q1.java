
// Generate a random number within a specified range, such as 1 to 100.

import java.util.Random;

public class Q1{
    public static void main(String[] args) {
        Random generate = new  Random();
        int randomNumber = generate.nextInt(100)+1;

        System.out.println("The random number generated  between 1 to 1000 is  : "+ randomNumber);
    }
}