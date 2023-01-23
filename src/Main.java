import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task();//задачи 1,2
        task3();
        task4();
    }

    public static void task() {
        System.out.println("Задачи 1 и 2");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println(array1[0] + "," + array1[1] + "," + array1[2]);
        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ",");
            }
        }
        System.out.println();
        long[] array3 = {1000L, 2000L, 3000L, 4000L, 5000L};
        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length - 1) {
                System.out.print(array3[i]);
            } else {
                System.out.print(array3[i] + ",");
            }
        }
    }


    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ",");
            }
        }
        System.out.println();
        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ",");
            }
        }
        System.out.println();
        long[] array3 = {1000L, 2000L, 3000L, 4000L, 5000L};
        for (int i = array3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array3[i]);
            } else {
                System.out.print(array3[i] + ",");
            }
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        int[] array1 = {1,2,3};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                array1[i]=array1[i]+1;
                System.out.println(Arrays.toString(array1));
            }

        }
    }
}





