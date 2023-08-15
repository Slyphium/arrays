package arrays;

public class output {
    public static void main(String[] args) {
        double[] exampleArray = {1, 5, 6, 5, 4, 1};
        double sum = 0;

        for (int i = 0; i < exampleArray.length; i++) {
            sum += exampleArray[i];
        }

        System.out.println("Sum of the array elements: " + sum);
    }
}