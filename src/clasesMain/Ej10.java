package clasesMain;


import java.util.Arrays;

public class Ej10 {

    public static void main(String[] args) {
        double[] arrayA = new double[50];
        double[] arrayB = new double[20];

        for (int i = 0; i < 50; i++) {
            arrayA[i] = Math.random() * 100;
        }

        System.out.println(Arrays.toString(arrayA));

        Arrays.sort(arrayA);

        System.arraycopy(arrayA, 0, arrayB, 0, 10);

        Arrays.fill(arrayB, 10, arrayB.length - 1, 0.5);

        System.out.println("arrayA = " + Arrays.toString(arrayA));
        System.out.println("arrayB = " + Arrays.toString(arrayB));
    }
}
