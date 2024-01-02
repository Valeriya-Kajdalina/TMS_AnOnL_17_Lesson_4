import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int[] array = {87, 56, 34, 89, 12, 5, 7, 0};
        boolean p = true;
        int i = 0; int r = 0;
        do {
            p = true;
            if (i < array.length-1){
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    i++;
                    p = false;
                }
                else {p = false; r++; i++;}
            }

            else if (i == array.length-1){
                i = 0; p = false; r = 0;}

            if (r == array.length - 1)
                p = true;
        }
        while(p == false);
        System.out.println("Новый массив: "+Arrays.toString(array));
    }

}