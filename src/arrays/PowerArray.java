package arrays;

public class PowerArray {
    public static void main(String[] args) {
        int size = 4;
        int power = 2;

        int[] result = toPower(size, power);

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] toPower(int size, int power) {
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.pow(i, power);
        }

        return result;
    }
}
