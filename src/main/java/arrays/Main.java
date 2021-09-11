package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayMethods arrayMethods = new ArrayMethods();
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = new int[]{3, 5, 8, 4, 6, 9, 1, 3, 10, 7};
        byte[] array3 = new byte[]{2, 3, 8, 4, 6, 9, 1, 3, 10, 7};
        String[][] array4 = {{"ert", "tyth", "dfyhg", "gjhh"}, {"gnjgh", "fgj", "gfjgj", "dgb"}, {"ghjgh", "hkmhj", "hgikjm", "gjn"}};
        int[][] array5 = {{5, 7, 3, 88}, {7, 0, 1, -12}, {8, 1, 2, 3}};
        double d = 125.78;
        String string = "14.85";

        System.out.println(arrayMethods.convertArrayCharToString(chars));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(arrayMethods.getIndexArray(array, 5));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(arrayMethods.getIndexEndArray(array, 5));
        System.out.println("----------------------------------------------------------------------");
        arrayMethods.showMultipleElement(array, 3);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Arrays.toString(arrayMethods.sortedByAscending(array2)));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(arrayMethods.isRepeatElement(array3));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Arrays.toString(arrayMethods.sortedByDescend(array2)));
        System.out.println("----------------------------------------------------------------------");
        arrayMethods.showTwoDimensionalArray(array4);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(arrayMethods.convertArrayIntToArrayChar(array5)[0][3]);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(arrayMethods.intInversion(array5)[1][1]);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Arrays.toString(arrayMethods.arraysMultiplying(array, array2)));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Arrays.toString(arrayMethods.randomArray(5, 2, 7)));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(NumberConverter.convertIntToString(1452));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(NumberConverter.convertStringToInt("7854"));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(NumberConverter.convertDoubleToString(d));
        System.out.println("----------------------------------------------------------------------");
        System.out.println(NumberConverter.convertStringToDouble(string));

    }

}
