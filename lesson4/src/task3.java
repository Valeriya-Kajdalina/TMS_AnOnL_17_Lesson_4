import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] array1 = {31, 4, 69, 3, 58};
        int[] array2 = {16, 48, 76, 33, 8};
        float sredn_znach1 = 0; float sredn_znach2 = 0;
        System.out.println("Первый массив: "+Arrays.toString(array1));
        System.out.println("Второй массив: "+Arrays.toString(array2));

        for (int i = 0; i < 5; i++) {
            sredn_znach1 += array1[i]/5;
            sredn_znach2 += array2[i]/5;
        }

        if(sredn_znach1 > sredn_znach2)
            System.out.println("Среднее значение первого массива больше");
        else if (sredn_znach1 < sredn_znach2)
            System.out.println("Среднее значение второго массива больше");
        else System.out.println("Средние значения двух массивов равны");
    }
}
