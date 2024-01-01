import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {

       int[] arr = {5, 4, 18, 9, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int chislo = scanner.nextInt();
        boolean chisl = false;
        for (int i = 0; i < arr.length; i++) {
            if (chislo == arr[i]){
                chisl = true;
                break;
            }
        }
        if (chisl == true)
            System.out.println("Такое число есть в масиве");
        else System.out.println("Такого числа нет в масиве");
    }
}