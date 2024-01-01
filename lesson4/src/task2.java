import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        float max = 0;
        float min = 5;
        float sredn_znach = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число (размер массива): ");
        int razmer = scanner.nextInt();
        float[] arr = new float[razmer];

        System.out.println("Массив: ");

        for (int i = 0; i < razmer; i++) {
            arr[i] = (float) Math.random()*5;

            System.out.print(arr[i]+"  ");

            if(arr[i] > max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];

            sredn_znach += arr[i]/razmer;
        }
        System.out.println();
        System.out.println("Максимум: "+max);
        System.out.println("Минимум: "+min);
        System.out.println("Среднее значение: "+sredn_znach);
    }
}
