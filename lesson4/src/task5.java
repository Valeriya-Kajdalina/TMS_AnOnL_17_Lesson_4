import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 20);

        System.out.println("Массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++)
            if (i % 2 != 0)
                array[i] = 0;

        System.out.println("Новый массив: " + Arrays.toString(array));
    }
}
