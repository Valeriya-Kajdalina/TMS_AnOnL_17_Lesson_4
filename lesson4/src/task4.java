import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int chetn = 0; int j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число (размер массива): ");
        int razmer;
        do {
            System.out.println("размер массива может быть больше 5 и меньше или равно 10 ");
            razmer = scanner.nextInt();
        }while (razmer < 6 || razmer > 10);

        int[] array = new int[razmer];

        for (int i = 0; i < razmer; i++){
            array[i] = (int) (Math.random()*20);
            if (array[i] % 2 == 0)
                if (array[i] != 0)
                    chetn++;
        }

        System.out.println("Массив: "+ Arrays.toString(array));

        if (chetn != 0) {
            int[] new_array = new int[chetn];

            for (int i = 0; i < razmer; i++) {
                if (array[i] % 2 == 0) {
                    new_array[j] = array[i];
                    j++;
                }

            }
            System.out.println("Новый массив: "+ Arrays.toString(new_array));
        }
    }
}
