import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int[] array = {87, 56, 34, 89, 12, 5, 7, 0};
        boolean flag = true;
        int length = array.length;
        int i = 0;
        int k = 0;
        do {
            flag = true;
            if (i < length - 1) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    i++;
                    flag = false;

                } else {
                    flag = false;
                    k++;
                    i++;
                }

            } else if (i == length - 1) {
                i = 0;
                flag = false;
                length--;
                k = 0;
            }

            if (k == length - 1) {
                flag = true;
                length--;
            }
        }
        while (flag == false);
        System.out.println("Новый массив: " + Arrays.toString(array));
    }
}