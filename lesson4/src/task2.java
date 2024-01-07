import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        float max;
        float min;
        float average_value = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число (размер массива): ");
        int size = scanner.nextInt();
        float[] arr = new float[size];

        System.out.println("Массив: ");

        for (int i = 0; i < size; i++) {
            arr[i] = (float) Math.random() * 5;
            System.out.print(arr[i] + "  ");
        }

        //  for (int i = 0; i < size; i++) {
        //    if (arr[i] != 0)
        //      System.out.println("Массив не пустой");
        // break;
        //}

        max = arr[0];
        min = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];

            average_value += arr[i] / size;
        }

        System.out.println();
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
        System.out.println("Среднее значение: " + average_value);
    }
}
