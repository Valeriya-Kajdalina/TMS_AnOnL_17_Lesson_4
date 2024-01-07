import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int counter_even = 0;
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число (размер массива): ");
        int size;
        do {
            System.out.println("Размер массива может быть больше 5 и меньше или равно 10 ");
            size = scanner.nextInt();
        } while (size < 6 || size > 10);

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 20);
            if (array[i] % 2 == 0)
                if (array[i] != 0)
                    counter_even++;
        }

        System.out.println("Массив: " + Arrays.toString(array));

        if (counter_even != 0) {
            int[] new_array = new int[counter_even];

            for (int i = 0; i < size; i++) {
                if (array[i] % 2 == 0) {
                    new_array[j] = array[i];
                    j++;
                }
            }
            System.out.println("Новый массив: " + Arrays.toString(new_array));
        }
    }
}
