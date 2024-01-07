import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 18, 9, 8};
        int counter = 0, j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        for (int i = 0; i < arr.length; i++)
            if (number == arr[i])
                counter++;

        int new_length = arr.length - counter;
        int[] arr1 = new int[new_length];

        System.out.println("Новый массив: ");

        for (int i = 0; i < arr.length; i++)
            if (number != arr[i]) {
                arr1[j] = arr[i];
                j++;
                System.out.print(arr[j] + "  ");
            }
    }
}
