import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] array1 = {31, 4, 69, 3, 58};
        int[] array2 = {16, 48, 76, 33, 8};
        float average_value1 = 0;
        float average_value2 = 0;
        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));

        for (int i = 0; i < 5; i++) {
            average_value1 += array1[i] / 5;
            average_value2 += array2[i] / 5;
        }

        if (average_value1 > average_value2)
            System.out.println("Среднее значение первого массива больше");
        else if (average_value1 < average_value2)
            System.out.println("Среднее значение второго массива больше");
        else System.out.println("Средние значения двух массивов равны");
    }
}
