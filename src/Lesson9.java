import java.util.Arrays;

public class Lesson9 {
    // шифры для значений, где первая цифра - кратность которая нам нужна (800 - кратность нужна и пяти, и трем)
    private final int HELLO = 500;
    private final int WORLD = 300;
    private final int HELLOWORLD = 800;

    // создаем массив типа int
    public int[] arrays() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Вводим массив чисел: " + Arrays.toString(arr));
        return arr;
    }

    // меняем кратные числа на шифры
    public int[] a(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                arr[i] = HELLOWORLD;

            } else if (arr[i] % 5 == 0) {
                arr[i] = HELLO;

            } else if (arr[i] % 3 == 0) {
                arr[i] = WORLD;
            }
        }

        System.out.println("Меняем их на шифр: " + Arrays.toString(arr));
        return arr;
    }


    public String[] convert(int[] arr) {  // конвертирует массив int в String
        String convert = Arrays.toString(arr);
        String[] ar = convert.substring(1, convert.length() - 1).split(", ");
        return ar;

    }

    public void outputString(String[] ar) {
        // меняем шифры на слова
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equals("300")) {
                ar[i] = "world";
            }
            if (ar[i].equals("500")) {
                ar[i] = "hello";
            }
            if (ar[i].equals("800")) {
                ar[i] = "helloWorld";
            }
        }

        String convert = Arrays.toString(ar);
        String  replace = convert.replaceAll("[^\\w]"," ");


        System.out.println("Меняем шифр на нужные значения: " + replace);

    }


}



